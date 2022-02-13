@echo generate
call mvn archetype:generate -DgroupId=figure.approx.samples.elem -DartifactId=sample -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

@echo compile
call mvn compile

@echo package
call mvn package

@echo run jar
call java -jar target/sample-1.0-SNAPSHOT.jar