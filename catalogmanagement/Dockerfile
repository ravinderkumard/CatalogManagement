FROM openjdk:8

ADD /var/lib/jenkins/workspace/catalogmanagementpipeline/catalogmanagement/target/*.jar .

EXPOSE 18080

ENTRYPOINT ["java","-jar","catalog-management-docker.jar"]
