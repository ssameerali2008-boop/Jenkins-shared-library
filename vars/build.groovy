def call(String DockerhubUser, String ProjectName, String ImageTag){
    sh "docker build -t ${DockerhubUser}/${ProjectName}:${ImageTag} ."
}
