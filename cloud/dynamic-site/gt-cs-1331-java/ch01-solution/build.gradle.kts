plugins {
    id("use")
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies{
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
}

description = "Solutions for Chapter 1"
group = "com._4meonweb.gt.cs1331"
