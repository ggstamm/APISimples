#Start with the base image
FROM java:8

#Make port 8080 visible to the world outside this container
EXPOSE 8082

ADD target/teste-0.0.1-SNAPSHOT.jar teste-0.0.1-SNAPSHOT.jar

#Run .jar file
ENTRYPOINT ["java", "-jar", "teste-0.0.1-SNAPSHOT.jar"]
