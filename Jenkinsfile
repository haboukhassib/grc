pipeline {
	agent any

    environment {
		SUPERSET_DIR = "/home/ubuntu/superset"
        DOCKER_COMPOSE_FILE = "docker-compose-non-dev.yml"
        GRC_PORT = "8080"
        SUPERSET_PORT = "8088"
    }

    stages {
		stage('Start Superset Container (if needed)') {
			steps {
				script {
					def isRunning = sh(script: "docker ps --filter 'publish=${SUPERSET_PORT}' --format '{{.ID}}' || true", returnStdout: true).trim()
                    if (isRunning) {
						echo "Superset is already running on port ${SUPERSET_PORT}."
                    } else {
						echo "Starting Superset container..."
                        dir(SUPERSET_DIR) {
							sh "docker-compose -f ${DOCKER_COMPOSE_FILE} up -d"
                        }
                    }
                }
            }
        }

		stage('Stop Process on Port 8080') {
			steps {
				script {
					// Use lsof with sudo to find the PID for the process running on port 8080
					def processId = sh(script: "sudo lsof -t -i :${GRC_PORT} || true", returnStdout: true).trim()
					echo "Process ID: ${processId}" // Debug line

					if (processId) {
						echo "Stopping process on port ${GRC_PORT} (PID: ${processId})"
						sh "sudo kill -9 ${processId}"
						echo "Process stopped."
					} else {
						echo "No process found on port ${GRC_PORT}."
					}
				}
			}
		}

        stage('Pull GRC Code') {
			steps {
				script {
					echo "Pulling latest code from the GRC repository..."
					sh "git pull origin master"
				}
			}
		}

        stage('Build GRC Project') {
			steps {
				script {
					// Ensure gradlew has execute permission
					sh "chmod +x gradlew"
					sh "sudo ./gradlew -Pvaadin.productionMode=true bootJar"
				}
			}
		}

        stage('Run GRC Application') {
			steps {
				script {
					def jarFile = sh(script: "ls build/libs/GRC-*.jar | head -n 1", returnStdout: true).trim()
					if (jarFile) {
						echo "Running ${jarFile}..."
						sh "nohup java -jar ${jarFile} &"
					} else {
						error "No JAR file found!"
					}
				}
			}
		}
    }
}
