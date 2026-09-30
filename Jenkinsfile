pipeline{
    agent any
    stages{
        stage('Hello World from GitHub'){
        steps{
            echo "Hello from pipeline!"
        }
        }
        
        stage('Bye World'){
            steps{
                echo "Bye from pipeline"
                sh "ls -l"
            }
        }
        
    }
}
