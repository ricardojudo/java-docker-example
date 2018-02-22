pipeline {
    agent any
    tools { 
        maven 'M3' 
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.skip=true clean install' 
            }
        }
        stage ('Test') {
            
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true test' 
            }
            
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }            
        }
    }
}

