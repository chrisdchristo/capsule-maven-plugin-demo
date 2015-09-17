Capsule Maven Plugin Demo
=========================

[![Version](http://img.shields.io/badge/version-0.10.8-blue.svg?style=flat)](https://github.com/chrischristo/capsule-maven-plugin-demo/releases)
[![License](http://img.shields.io/badge/license-MIT-blue.svg?style=flat)](http://opensource.org/licenses/MIT)

This a demo project of how you can use the [capsule-maven-plugin](https://github.com/chrischristo/capsule-maven-plugin).

See more at [capsule](https://github.com/puniverse/capsule) and [capsule-maven-plugin](https://github.com/chrischristo/capsule-maven-plugin).

#### Building from source
Clone the project and run a maven install:

```
git clone https://github.com/chrischristo/capsule-maven-plugin-demo.git
cd capsule-maven-plugin-demo
mvn clean install
```

Then you can run any of the three capsules:

```
java -jar target/capsule-maven-plugin-demo-0.10.8-capsule-empty.jar
java -jar target/capsule-maven-plugin-demo-0.10.8-capsule-thin.jar
java -jar target/capsule-maven-plugin-demo-0.10.8-capsule-fat.jar
```

Note that when running the 'empty' version you will need to tell capsule to look in the local repo (as it does not do this by default).
Run `export CAPSULE_REPOS=local,central` to add the `local` and `central` repos to the environment. Or you can include them in the manifest entry `Repositories` like so:

```
<property>
	<key>Repositories</key>
	<value>local,central</value>
</property>
```

And if you added the `<chmod>true</chmod>` parameter and are on a Mac/Unix system you can run the jars as executables like so:

```
./target/capsule-maven-plugin-demo-0.10.8-capsule-empty.x
./target/capsule-maven-plugin-demo-0.10.8-capsule-thin.x
./target/capsule-maven-plugin-demo-0.10.8-capsule-fat.x
```

## License

This project is released under the [MIT license](http://opensource.org/licenses/MIT).
