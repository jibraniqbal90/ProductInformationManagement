FROM postgres
MAINTAINER Jibbu <jibran.iqbal90@gmail.com>
ENV POSTGRES_USER docker
ENV POSTGRES_PASSWORD docker
ENV POSTGRES_DB postgres
ADD CreateDB.sql /docker-entrypoint-initdb.d/
