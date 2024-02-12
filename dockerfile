FROM ubuntu:latest
EXPOSE 8080
RUN apt-get update && \
    apt-get install -y openjdk-11-jre
ADD target/spe_mini_image.jar spe_mini_image.jar
ENTRYPOINT ["java","-jar","/spe_mini_image.jar"]
