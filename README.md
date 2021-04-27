# LabForward Project

## To execute the APP
### Changes application.properties
  * Create a new Folder in you PC
  * Put text files, the notebooks of users (check examples in /src/main/resources/notebook)
  * change the path.notebooks with your path folder
  
### RUN the APP
  * JAVA version: 8
  * run maven clean install
  * run the FrequencyApplication class
  
### test call the web Service
For the test you need to specify two Params: word and fileName
- Example of Call: http://localhost:8080/frequency?word=word&fileName=2.txt

