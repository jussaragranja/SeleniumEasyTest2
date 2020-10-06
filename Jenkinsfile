pipeline {
    agent {
        docker {
            image 'jussaragranja/java_maven_git'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Test') { 
            steps {
                sh 'mvn test -Dmaven.test.failure.ignore=true'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}