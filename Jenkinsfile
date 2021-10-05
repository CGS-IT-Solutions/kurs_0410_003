pipeline {
    agent any

    tools {
        maven 'maven_3.6.3'
        jdk 'jdk_1.8.0'
    }

    stages {
        stage('Introduction and Pre Checks') {
            steps {
                echo 'This is a minimal pipeline.'
                script {
                    sh 'df -h'
                    sh 'java -version'
                }
            }
        }
<<<<<<< HEAD

        stage('Build Project') {
            steps {
                echo 'This is the build step'
                sh 'mvn -B -DskipTests clean package'
            }
        }

=======
        stage('Build Rolands Project') {
            steps {
                echo 'This is the real build step'
                sh 'mvn -B -DskipTests clean package'
            }
        }
>>>>>>> main
        stage('Build and Unit Test') {
            steps {
                echo "Build and Unit Test"
                sh "mvn -B -nsu clean install"
            }
            post {
                always {
                    junit "**/surefire-reports/*.xml"
                }
            }
        }
<<<<<<< HEAD

=======
>>>>>>> main
    }
    post {
        failure {
            echo "Build POST  FAILURE action "
        }
        always {
            echo "Build POST action"
        }
    }
}
<<<<<<< HEAD

=======
>>>>>>> main
