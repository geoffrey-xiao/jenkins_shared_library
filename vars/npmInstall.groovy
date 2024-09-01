def call(){
  sh "npm config set registry https://registry.npmmirror.com"
  sh "npm install"
}