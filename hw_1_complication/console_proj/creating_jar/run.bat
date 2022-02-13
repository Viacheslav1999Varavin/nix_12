@echo compile program
call javac -sourcepath ./object -d output -cp ./libs/commons-lang3-3.11.jar object/figure/approx/samples/elem/Main.javaa

@echo run program
call java -cp output/;./libs/commons-lang3-3.11.jar;. figure.approx.samples.elem.Main

@echo create manifest
echo Main-Class: figure.approx.samples.elem.Main>MANIFEST.MF

@echo create jar
call jar cfm result/Global.jar MANIFEST.MF -C output/up/ .

@echo run jar
call java -jar result/Global.jar