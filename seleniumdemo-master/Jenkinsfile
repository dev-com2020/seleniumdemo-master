pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // To run Maven on a Windows agent, use
                echo "Hello master"
                 bat "mvn clean test"
            }

        }
    }
}
