FROM openjdk:8

COPY /var/lib/jenkins/workspace/catalogmanagementpipeline/catalogmanagement/target/catalog-management-docker.jar .

EXPOSE 18080

ENTRYPOINT ["java","-jar","catalog-management-docker.jar"]
