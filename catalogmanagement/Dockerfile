FROM openjdk:8
WORKDIR /var/lib/jenkins/workspace/catalogmanagementpipeline/catalogmanagement/target/
COPY catalog-management-docker.jar .

EXPOSE 18080

ENTRYPOINT ["java","-jar","catalog-management-docker.jar"]
