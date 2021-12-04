FROM lpicanco/java11-alpine
MAINTAINER Jibbu <jibran.iqbal90@gmail.com>
EXPOSE 8080
ENV PORT 8080
RUN mkdir -p /app/csvfile
COPY build/libs/product-synchronizer.jar product-synchronizer.jar
ENTRYPOINT ["java","-jar","product-synchronizer.jar"]
