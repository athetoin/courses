plugins {
		java
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies{
    implementation(project(":output-api"))
		testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
}

description = "Solutions for Chapter 1"
