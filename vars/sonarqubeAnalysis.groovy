def call(){
  withSonarQubeEnv('sonar-server') {
    sh ''' $SONAR_SCANNER_HOME/bin/sonar-scanner \
    -Dsonar.projectKey=Youtube \
    -Dsonar.projectName=Youtube
    '''
  }
}