FROM openjdk:8

ADD /var/lib/jenkins/workspace/catalogmanagementpipeline/catalogmanagement/target/catalog-management-docker.jar .

EXPOSE 8080

ENTRYPOINT ["java","-jar","catalog-management-docker.jar"]
