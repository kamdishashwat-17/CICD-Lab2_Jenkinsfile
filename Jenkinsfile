pipeline {
	agent any
	tools {
	maven 'MAVEN_HOME'
	}
	stages {
		stage('Stage1: Hiii Clean Stage 1  testing') {
			steps {
				bat 'mvn clean'
				}
			}
	
		stage ('Stage 3: My Package'){
			steps {
				bat 'mvn package'
				}
			}			
		stage ('Stage 4: My Final Build Stage'){
			steps {
				bat 'mvn install'
				}
			}	
		stage ('Stage Final: Build Success'){
			steps {
				echo  'Build Success!'
				}
			}
		}
	}
