FROM openjdk:17
EXPOSE 8989
ADD build/libs/capstone-employee-project-0.0.1-SNAPSHOT.jar capstone-employee-project-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/capstone-employee-project-0.0.1-SNAPSHOT.jar"]