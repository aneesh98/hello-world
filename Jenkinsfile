pipeline {
    agent any

    tools {
        maven 'Maven'  // Name you gave to Maven in Global Tool Configuration
    }
    
    stages {

        stage('Build') {
            steps {
                // Running Maven build
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Running tests with Maven
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                // Packaging the application (e.g., generating a JAR file)
                sh 'mvn package'
            }
        }

        stage('Archive Results') {
            steps {
                // Archive build artifacts (JAR, test reports, etc.)
                archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: true
                junit 'target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            // Clean up workspace
            cleanWs()
        }
    }
}
