def call(String Project, String ImageTag, String DockerhubUser){
  withcredentials([usernamepassword(credentialsId: 'dockerHubCred',passwordVariable: 'dockerHubPass',usernameVariable: 'dockerHubUser')]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "docker push ${DockerHubUser}/${Project}/${ImageTag}"
}
