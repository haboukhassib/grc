pipeline {
	agent any

    environment {
		SUPERSET_DIR = "/home/ubuntu/superset"
        GRC_DIR = "/home/ubuntu/grc"
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
					def processId = sh(script: "lsof -t -i:${GRC_PORT} || true", returnStdout: true).trim()
                    if (processId) {
						echo "Stopping process on port ${GRC_PORT} (PID: ${processId})"
                        sh "kill -9 ${processId}"
                    } else {
						echo "No process found on port ${GRC_PORT}."
                    }
                }
            }
        }

        stage('Build GRC Project') {
			steps {
				script {
					dir(GRC_DIR) {
						sh "./gradlew -Pvaadin.productionMode=true bootJar"
                    }
                }
            }
        }

        stage('Run GRC Application') {
			steps {
				script {
					dir("${GRC_DIR}/build/libs") {
						def jarFile = sh(script: "ls GRC-*.jar | head -n 1", returnStdout: true).trim()
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
}
