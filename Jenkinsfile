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
        }
        stage('reports') {
                allure([
                    includeProperties: false,
                    jdk: '',
                    properties: [],
                    reportBuildPolicy: 'ALWAYS',
                    results: [[path: 'target/surefire-reports']]
            	])
		}
    }
}