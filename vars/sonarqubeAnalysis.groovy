def call(){
  withSonarQubeEnv('sonar-server') {
    sh ''' $SCANNER_HOME/bin/sonar-scanner \
    -Dsonar.projectKey=Youtube \
    -Dsonar.projectName=Youtube
    '''
  }
}