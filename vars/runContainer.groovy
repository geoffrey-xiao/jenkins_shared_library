def call(){
  sh "docker run -d --name youtube1 -p 3000:3000 geoffreyxiao/youtube-clone-app:latest"
}