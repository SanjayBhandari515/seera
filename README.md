<h1>Scenarios Automated:</h1>
<h2>1- Perform the below: Method: GET</h2>
<ul>
   <li>URI: https://www.tajawal.ae/api/hotel/ahs/v2/geo-suggest</li>
</ul>   
   <h3>Header params:</h3>
   <li>parameter name: Content-Type</li>
   <li>parameter value: application/json</li>
  
   <h3>Query params:</h3>
    <li>parameter name: query</li>
    <li>parameter value: paris</li>
    <li>Response validations: Perform needed validations on response</li>
</ul>
  
<h2>2- Perform the below: Method: POST</h2>
 <ul>
   <li>URI: https://www.tajawal.ae/api/hotel/ahs/search/request</li>
   <li>Header params: parameter name: Content-Type parameter value: application/json</li>
  
  <h3>Conditions:</h3>
   <li>Dates should be dynamic</li>
   <li>Room and guest array should be created dynamically</li>
</ul>
<ul>
   <li>Response validations: Perform needed validations on API response</li>
 </ul>
<h3>Programming Language and Automation Tools</h3>
<ul>
  <li>Programming Language:Java</li>
  <li> Build Tool: Maven</li>
  <li> <b>rest-assured : 4.0.0</b></li>
  <li> <b>Junit 4.12</b></li>
  <li> IDE: IntelliJ IDEA 2019.3</li>
</ul>
<h3>Folder Structure Overview</h3>
<p>The major components of this projects are:</p>
 <ul>
  <li>src/main/java/api/pages/AdvancedPage.java: Contains common methods for pages as all pages extend this class <b>list</b> api</li>
  <li>src/main/java/api/pages: All the page classes are kept in this location</li>
  <li>src/main/java/api/request: Contains request POJO classes</li>
  <li>src/main/java/api/response: Contains response POJO classes</li>
  <li>src/main/java/api/utils: In this location common method for API's are kept like GET, POST, also enums and setup for property class is there</li>
  <li>src/test/java/junit : In this locations our tests are kept we can execute our test from here</li>
  <li>src/test/resources/properties : In this location properties files are kept for each page we have a respective property file where we will keep the hardcoded data</li>
  <li>target/site: Contains generated html report</li>
  </ul>
  <a href="https://ibb.co/BLSjZkP"><img src="https://i.ibb.co/NxHpjR3/Project-Structure.png" alt="Screenshot-2020-09-21-at-00-02-31" border="0"></a>

<h3>Running Tests:</h3>
<ul>
    <li>Import the project as a maven Project in IDE such as InteliJ IDEA</li>
    <li>Run the "src/test/java/junit/regresssion/JunitTestSuite.java" class to run both the case</li>

</ul>
  <a href="" alt="Screenshot-2020-09-21-at-00-08-53" border="0"></a>
<h3> Html output:</h3>
 <p> After running the tests, execute the maven goal <b> mvn surefire-report:report</b> and it will generate a HTML output report<b>"target/site"</b> folder.</p>
<a href="https://ibb.co/rywd3tH"><img src="https://i.ibb.co/3hCRvsc/surefire-report.png" alt="Screenshot-2020-09-21-at-00-02-31" border="0"></a>
