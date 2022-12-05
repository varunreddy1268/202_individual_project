

### Command to Run the project 

mvn compile exec:java -Dexec.mainClass="com.cmpe202.individualproject.main.App" -Dexec.args="src/test/java/sampleFiles/json_input.json src/test/java/sampleFiles/json_output.json"


mvn compile exec:java -Dexec.mainClass="com.cmpe202.individualproject.main.App" -Dexec.args="src/test/java/sampleFiles/xml_input.xml src/test/java/sampleFiles/xml_output.xml"


mvn compile exec:java -Dexec.mainClass="com.cmpe202.individualproject.main.App" -Dexec.args="src/test/java/sampleFiles/csv_input.csv src/test/java/sampleFiles/csv_output.csv"

### Command to Run tests:
mvn test

### Command to recompile the project:
mvn clean




