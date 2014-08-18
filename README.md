Capsule Maven Plugin Demo
=========================

This a demo project of how you can use the [capsule-maven-plugin](https://github.com/christokios/capsule-maven-plugin).

See more at [capsule](https://github.com/puniverse/capsule) and [capsule-maven-plugin](https://github.com/christokios/capsule-maven-plugin).

## Building from source
Clone the project and run a maven install:

```
git clone https://github.com/christokios/capsule-maven-plugin-demo.git
cd capsule-maven-plugin
mvn clean install
```

Then you can run any of the three capsules:

```
java -jar target/capsule-maven-plugin-demo-0.7.0-capsule-empty.jar
java -jar target/capsule-maven-plugin-demo-0.7.0-capsule-thin.jar
java -jar target/capsule-maven-plugin-demo-0.7.0-capsule-full.jar
```

And if you added the `<buildExec>true</buildExec>` parameter and are on a Mac/Unix system you can run the jars as executables like so:
  
```
./target/capsule-maven-plugin-demo-0.7.0-capsule-empty.x
./target/capsule-maven-plugin-demo-0.7.0-capsule-thin.x
./target/capsule-maven-plugin-demo-0.7.0-capsule-full.x
```  

## License

This project is released under the [MIT license](http://opensource.org/licenses/MIT).