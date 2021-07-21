package org.dmly.gradle

import org.gradle.api.*

public class MyAWSPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("copyToS3") {
            doLast {
                println "Copied to S3"
            }
        }

        project.task("deployToEC2") {
            doLast {
                println "Application is up and running on AWS EC2"
            }
        }
    }
}