FROM openjdk:8
RUN echo "PWD is: $PWD"
COPY /home/ec2-user/catalog-management-docker.jar .

EXPOSE 18080

ENTRYPOINT ["java","-jar","catalog-management-docker.jar"]
