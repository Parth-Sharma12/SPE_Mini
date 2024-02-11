FROM ubuntu:latest
EXPOSE 8080
ADD target/spe_mini_image.jar spe_mini_image.jar

ENTRYPOINT ["java","-jar","/spe_mini_image.jar"]
