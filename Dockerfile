FROM openjdk:11.0

COPY /target/my-calculator-version-1.0.0.jar my-calculator-version-1.0.0.jar

CMD java -jar my-calculator-version-1.0.0.jar