FROM lpicanco/java11-alpine
MAINTAINER Jibbu <jibran.iqbal90@gmail.com>
EXPOSE 8080
ENV PORT 8080
ARG JAR_FILE
COPY ${JAR_FILE} product-synchronizer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/product-synchronizer-0.0.1-SNAPSHOT.jar"]
