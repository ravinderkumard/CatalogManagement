FROM openjdk:8
RUN echo "PWD is: $PWD"
COPY /catalog-management-docker.jar .

EXPOSE 18080

ENTRYPOINT ["java","-jar","catalog-management-docker.jar"]
