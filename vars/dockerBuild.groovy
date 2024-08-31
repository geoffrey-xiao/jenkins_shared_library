def call(String dockerHubUsername, String dockerImageName) {
  sh "docker build --build-arg REACT_APP_RAPID_API_KEY=d6c622a8b8msh73798ba27b77ce8p15e572jsnc3e9cb1e6aa7 -t ${dockerImageName}"
  sh "docker tag ${dockerImageName} ${dockerHubUsername}/${dockerImageName}:latest"

  withDockerRegistry([credentialsId: 'docker',url: "https://index.docker.io/v1/"]) {
    sh "docker push ${dockerHubUsername}/${dockerImageName}:latest"
}