Remove-Item *.class
Remove-Item *.jar
Remove-Item dl

javac Utility.java
jar cvfM dl.jar Utility.class
Rename-Item dl.jar dl