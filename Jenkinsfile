pipeline{
    agent any
    tools {
        maven 'Maven3.9'
    }
    stages{
        stage('Git Checkout'){
        steps{
            git branch: 'main', credentialsId: 'GithubCredential', url: 'https://github.com/skillupwithdinesh/java-sample-repo.git'
        }
        }
        
        stage('Maven Build'){
            steps{
                sh "mvn clean install"
            }
        }
        
    }
}
