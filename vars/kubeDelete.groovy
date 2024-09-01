def call() {
    withKubeConfig(caCertificate: '', clusterName: '', contextName: '', namespace: '', restrictKubeConfigAccess: false, serverUrl: '') {
        sh "kubectl delete -f deployment.yml"
    }
}