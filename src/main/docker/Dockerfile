# from base image centos
FROM centos

#MAINTAINER lirenqing

#Java Version
#ENV JAVA_VERSION_MAJOR 7
#ENV JAVA_VERSION_MINOR 60
#ENV JAVA_PACKAGE       jdk

#install java
RUN yum -y install java

#inatall app
ADD tar /usr/project/

#start app
ENTRYPOINT ["java" ,"-jar","/usr/project/dockerdemo-0.0.1-SNAPSHOT.jar"]