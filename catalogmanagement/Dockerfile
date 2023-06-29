FROM alpine AS builder
COPY /var/lib/jenkins/workspace/catalogmanagementpipeline/catalogmanagement/target/catalog-management-docker.jar /app/catalog-management-docker.jar

FROM openjdk:8

COPY --from=builder /app/catalog-management-docker.jar .

EXPOSE 18080

ENTRYPOINT ["java","-jar","catalog-management-docker.jar"]
