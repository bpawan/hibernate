FROM openjdk:10-jdk

MAINTAINER "Pawan Bhattarai <pawawn_bhattarai@hotmail.com>"

VOLUME /tmp

ADD hibernate-0.0.1-SNAPSHOT.jar app.jar

ADD wrapper.sh wrapper.sh

RUN bash -c 'chmod +x /wrapper.sh'

RUN bash -c 'touch /app.jar'

ENTRYPOINT ["/bin/bash", "/wrapper.sh"]
