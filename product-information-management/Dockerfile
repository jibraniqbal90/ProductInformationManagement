FROM lpicanco/java11-alpine
MAINTAINER Jibbu <jibran.iqbal90@gmail.com>
EXPOSE 8081
ENV PORT 8081
COPY build/libs/product-information-management.jar product-information-management.jar
ENTRYPOINT ["java","-jar","product-information-management.jar"]
