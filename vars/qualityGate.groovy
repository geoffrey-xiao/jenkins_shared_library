def call(credentialId){
  waitForQualityGate abortPipeline: false, credentialId: credentialId
}