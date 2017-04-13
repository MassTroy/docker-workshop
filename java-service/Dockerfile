FROM alpine:latest

# install JRE. Make sure we use --no-cache to keep image small
RUN apk add --no-cache openjdk8-jre

COPY build/libs/java-helloworld-*.jar /myapp/application.jar

EXPOSE 8080

# set the run command for the container and pass the env variable
CMD java -DgreetingFile=$GREETING_FILE -jar /myapp/application.jar

