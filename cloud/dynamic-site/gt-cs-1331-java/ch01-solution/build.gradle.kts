plugins {
		java
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies{
    implementation(project(":output-api"))
}

description = "Solutions for Chapter 1"
