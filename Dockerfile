FROM maven:3.8.1-openjdk-17-slim AS build

RUN mkdir /home/ipl-stats
copy . /home/ipl-stats
RUN cd /home/ipl-stats && mvn package
RUN cp /home/ipl-stats/target/*.jar iplstats.jar

ENTRYPOINT [ "java","-jar","iplstats.jar" ]

EXPOSE 8092