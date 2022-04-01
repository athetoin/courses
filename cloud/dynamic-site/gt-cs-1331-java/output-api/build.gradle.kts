plugins {
		java
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies{
	compileOnly("jakarta.xml.bind:jakarta.xml.bind-api:3.0.1")
}

description = "Output API"
