@Library("Shared") _
pipeline{
    agent { label "vinod" }
    stages{
        stage("Code"){
            steps{
                script{
                    clone("https://github.com/LondheShubham153/django-notes-app.git","main")
                }
            }
        }
        stage("build"){
            steps{
                echo"helo"
            }
        }
        stage("push to hub"){
            steps{
                echo "kok"
            }
        }
        stage("deploy"){
            steps{
                echo "This is deploying the code"
            }
        }
    }
}
