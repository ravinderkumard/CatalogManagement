FROM openjdk:8

ADD /var/lib/jenkins/workspace/catalogmanagementpipeline/catalogmanagement/target/catalogmanagement*.jar catalogmanagement.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","catalogmanagement.jar"]
