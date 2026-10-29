pipeline {
    agent {label 'Automation'}
        tools {
        maven "mvn"
        jdk "JAVA8"
    }
    environment{
        JAVA_HOME=setJAVAEnv()
        M2_HOME=setMAVENEnv()
    }
    parameters{
      choice choices: ['${MIAAPPAdmin}', '${TestEmails}'], description: 'These options are to send the mail to group of people based on the usecase', name: 'EmailGroupsSelection'
    }

    stages {
        stage('Initialize'){
            steps{
                script {
                    echo "JAVA_HOME = ${JAVA_HOME}"
                    echo "M2_HOME = ${M2_HOME}"
                    echo "PATH = ${PATH}"
                    if (isUnix()) {
                        sh '''#!/bin/bash mvn --version'''
                    }
                    else{
                        bat 'mvn --version'
                    }
                }
            }
        }
        stage ('Install') {
            steps {
                script {
                    if (isUnix()) {
                        sh '''#!/bin/bash mvn clean install -DskipTests'''
                    }
                    else{
                        bat 'mvn clean install -DskipTests'
                    }
                }
            }
        }
        stage ('Test') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        if (isUnix()) {
                            sh '''#!/bin/bash mvn test'''
                        }
                        else{
                            bat 'mvn test'
                        }
                    }
                }
            }
        }
        stage ('Reports') {
            steps {
                script {
                    if (isUnix()) {
                        sh '''#!/bin/bash mvn allure:report'''
                    }
                    else{
                        bat 'mvn allure:report'
                    }
                    allure([
                            includeProperties: false,
                            jdk: '',
                            properties: [],
                            reportBuildPolicy: 'ALWAYS',
                            results: [[path: 'target/allure-results']]
                    ])
                }
            }
        }

  stage('Send Summary'){
  			steps{
  				emailext body: '''${SCRIPT, template="groovy-html-sodales.template"}''',
  				mimeType: 'text/html',
  				subject: "[Jenkins] Test Execution Summary",
  				to:  "${params.EmailGroupsSelection}"
  		}}
  	}
   }

def setJAVAEnv() {
    if (isUnix()) {
        return "/Library/Java/JavaVirtualMachines/jdk-19.jdk/Contents/Home"
    }
    else{
        return "C:\\Program Files\\Java\\jdk-17"
    }
}
def setMAVENEnv() {
    if (isUnix()) {
        return "/usr/local/Cellar/maven/3.8.6"
    }
    else{
        return "C:\\Tools\\apache-maven-3.8.1"
    }
}
