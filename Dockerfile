FROM openjdk:11.0

COPY target/demo-jenkins-1.0-SNAPSHOT.jar .

CMD java -jar demo-jenkins-1.0-SNAPSHOT.jar