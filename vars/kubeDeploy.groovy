def call(){
  withKubeConfig(caCertificate:'',clusterName:'',contextName:'',namespace:'',
  credentialsId: 'k8s', restrictKubeConfigAccess:false, serverUrl:''){
    sh "kubectl apply -f deployment.yml"
  }
}