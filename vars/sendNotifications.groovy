def call() {
  
 
  def subject = "Notification"
  def summary = "${subject} (${env.BUILD_URL})"
  //def details = 'SonarQube result URL: ${BUILD_LOG_REGEX, regex=".*ANALYSIS SUCCESSFUL, you can browse (.*)", showTruncatedLines=false, substText="$1"}'
  def details = "This is for testing"
   //emailext body: 'SonarQube result URL: ${BUILD_LOG_REGEX, regex=".*ANALYSIS SUCCESSFUL, you can browse (.*)", showTruncatedLines=false, substText="$1"}', mimeType: 'text/html', subject: 'Notification', to: 'rajesh.gangoni@sunrise.net , rajeshgangoni@gmail.com'
              // } 

  emailext (
      //to: 'rajesh.gangoni@sunrise.net , rajeshgangoni@gmail.com',
      mimeType: 'text/html',
      subject: subject,
      body: details,
      //recipientProviders:  emailextrecipients([developers()])
      //recipientProviders: [[$class: 'DevelopersRecipientProvider']]
      recipientProviders:  emailextrecipients([[$class: 'DevelopersRecipientProvider']])
    )
  //emailext body: 'Test', recipientProviders: [developers()], subject: 'Test'
}
