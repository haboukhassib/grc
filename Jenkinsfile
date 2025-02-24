pipeline {
	agent any

    environment {
		REPO_URL = 'https://github.com/haboukhassib/grc.git'
        REPO_DIR = 'C:\\Users\\Administrator\\Desktop\\GRC'
        PORT = '8080'
    }

    stages {
		stage('Checkout Repository') {
			steps {
				script {
					if (!fileExists(env.REPO_DIR)) {
						echo 'Cloning repository...'
                        bat "git clone %REPO_URL% %REPO_DIR%"
                    } else {
						echo 'Repository exists. Pulling latest changes...'
                        dir(env.REPO_DIR) {
							bat 'git pull'
                        }
                    }
                }
            }
        }

        stage('Stop Process on Port 8080') {
			steps {
				script {
					def processId = bat(script: "netstat -ano | findstr :%PORT%", returnStdout: true).trim()
                    if (processId) {
						def pid = processId.split()[-1]
                        bat "taskkill /PID ${pid} /F"
                        echo "Killed process using port ${PORT} (PID: ${pid})"
                    } else {
						echo "No process found on port ${PORT}"
                    }
                }
            }
        }

        stage('Build Project') {
			steps {
				dir(env.REPO_DIR) {
					bat './gradlew "-Pvaadin.productionMode=true" bootJar'
                }
            }
        }

        stage('Run Application') {
			steps {
				script {
					def jarPath = "${env.REPO_DIR}\\build\\libs"
                    def jarFile = bat(script: "dir /B /O:D ${jarPath}\\GRC-*.jar", returnStdout: true).trim().split("\n")[-1]

                    if (jarFile) {
						echo "Starting application: ${jarFile}"
                        bat "java -jar \"${jarPath}\\${jarFile}\""
                    } else {
						echo "No JAR file found in build\\libs"
                    }
                }
            }
        }
    }
}