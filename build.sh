rm *.class
rm *.jar
rm dl

javac Utility.java
jar cvfM dl.jar Utility.class
mv dl.jar dl