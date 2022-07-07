/*
 * Java 17 and checks.
 */

plugins {
    java
    checkstyle
    pmd
    jacoco
}

pmd {
    isConsoleOutput = true
    toolVersion = "6.39.0"
    rulesMinimumPriority.set(5)
    ruleSets = emptyList()
    ruleSetConfig = resources.text.fromFile("../common-plgn/config/pmd/ruleset.xml")
}

checkstyle {
	toolVersion = "9.0"
    configFile = File("../common-plgn/config/checkstyle/checkstyle.xml")
}

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies  {
    compileOnly("jakarta.enterprise:jakarta.enterprise.cdi-api:3.0.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
    testImplementation("org.mockito:mockito-core:3.12.4")
    testImplementation("org.jboss.weld:weld-junit5:3.0.0.Final")
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)
}

jacoco {
    toolVersion = "0.8.7"
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
}
