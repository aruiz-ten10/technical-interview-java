# technical-interview-java
Java Technical Interview

Setup:
- Download & Install Java 1.8 [http://www.oracle.com/technetwork/java/javase/downloads/index.html]
- Download Maven [https://maven.apache.org/download.cgi]
  - Install Maven [https://maven.apache.org/install.html]
- Install the required dependencies
```
mvn clean install
```

### 1. Programming
- Navigate to the `technical-interview-java` directory
- Run the following:
```
mvn -Dtest=ProgrammingTest test
```

### 2. Web Front-End Test
- Download and install Chrome browser [https://www.google.co.uk/chrome/browser]
- Download and install the chromedriver [https://chromedriver.storage.googleapis.com/index.html?path=2.30/]
- Move the chromedriver file into a directory other than "Downloads", and add that directory to the $PATH system variable  
- Navigate to the `technical-interview-java` directory
- Run the following:
```
mvn clean test -Dcucumber.options="-t @ui"
```

### 3. Web Service Test
- Navigate to the `technical-interview-java` directory
- Run the following:
```
mvn clean test -Dcucumber.options="-t @soap"
```


#### Notes:
- In order to create the files in src/main/java/net/webservicex, I ran the following on the terminal:
```
wsimport -keep http://www.webservicex.net/uklocation.asmx?WSDL
```
