pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build World'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy World'
            }
        }
          stage('Test') {
            steps {
                echo 'Test World'
            }
        }
    }
	post
	{
		always
		{
			emailext body: 'Summary', subject: 'Pipeline Status', to: 'ritiksahu0322@gmail.com'
		}
	}
}
