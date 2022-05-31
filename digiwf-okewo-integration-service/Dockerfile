FROM registry.access.redhat.com/ubi8/openjdk-11:latest

EXPOSE 8080

ENV JAVA_OPTIONS="-Djavax.net.ssl.trustStore=/mnt/cacerts/cacerts-lhm -Djavax.net.ssl.trustStorePassword=changeit"

COPY target/*.jar /deployments/spring-boot-application.jar

CMD ["java","-jar","/deployments/spring-boot-application.jar"]