plugins {
    java
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies{
    implementation("com._4meonweb.gt.cs1331.shell:solution-api:")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
}

description = "Solutions for Chapter 1"
group = "com._4meonweb.gt.cs1331"
