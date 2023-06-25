FROM openjdk:8

ADD /var/lib/jenkins/workspace/catalogmanagementpipeline/catalogmanagement/target/catalogmanagement-0.0.1-SNAPSHOT.jar catalogmanagement.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","catalogmanagement.jar"]
