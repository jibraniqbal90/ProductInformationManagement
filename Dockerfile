FROM postgres:9.3
MAINTAINER Jibbu <jibran.iqbal90@gmail.com>
ENV POSTGRES_USER docker
ENV POSTGRES_PASSWORD docker
ENV POSTGRES_DB pim
ADD CreateDB.sql /docker-entrypoint-initdb.d/
