@echo compile
call mvn compile

@echo package
call mvn package

@echo run jar
call java -jar target/module_1-1.0-SNAPSHOT-shaded.jar