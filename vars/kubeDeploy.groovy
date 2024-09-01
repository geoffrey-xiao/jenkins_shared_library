def call(){
  withKubeConfig(caCertificate:'',clusterName:'',contextName:'',namespace:'', restrictKubeConfigAccess:false, serverUrl:''){
    sh "kubectl apply -f deployment.yml"
  }
}