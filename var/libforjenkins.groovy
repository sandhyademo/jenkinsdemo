
 def call() {
    emailext(
        subject: "SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
        body: """
            <h2>Jenkins Build Successful</h2>
            <p><b>Job:</b> ${env.JOB_NAME}</p>
            <p><b>Build:</b> #${env.BUILD_NUMBER}</p>
            <p><b>Status:</b> SUCCESS</p>
            <p><b>Application:</b> Port 8081</p>
            <p><b>Build URL:</b> ${env.BUILD_URL}</p>
        """,
        to: "kalikirisandhya@gmail.com"
    )
}
