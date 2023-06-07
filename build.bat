del *.class
del *.jar
del dl

javac Utility.java
jar cvfM dl.jar Utility.class
move dl.jar dl