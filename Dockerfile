FROM nimmis/java-centos:oracle-8-jdk

WORKDIR /opt/webapp

ADD build/libs/consul.jar /opt/webapp/consul.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/webapp/consul.jar"]


