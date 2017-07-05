#!/bin/env groovy

node {
    checkout scm

    echo env.JENKINS_URL
    if(env.JENKINS_URL ==~ /.*central-pipeline.*/) {
        echo "loading central"
        load "central/Jenkinsfile"
    } else {
        echo "loading local"
        load "local/Jenkinsfile"
    }
}()
