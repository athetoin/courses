plugins {
    java
    application
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("org.jboss.weld.environment.se.StartMain")
    applicationDefaultJvmArgs = listOf(
        "-Dorg.jboss.logging.provider=jdk",
        "-Djava.util.logging.config.class=com._4meonweb.gt.cs1331.shell.console.LogConfiguration"
    )
}

dependencies {
    implementation("com._4meonweb.gt.cs1331.shell:solution-api:")
    implementation("org.jboss.weld.se:weld-se-core:4.0.2.Final")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation("org.mockito:mockito-core:4.4.0")
    testImplementation("org.jboss.weld:weld-junit5:3.0.0.Final")
}

description = "Console Shell"
group = "com._4meonweb.gt.cs1331.shell"

tasks.classes {
    doLast {
        copy {
            from("src/main/resources") {
            include("META-INF/beans.xml")
            include("logging.properties") }
            into("$buildDir/classes/java/main/")
        }
    }
}

tasks.jar{
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.withType<JavaExec>() {
    standardInput = System.`in`
}

tasks.test {
    useJUnitPlatform()
}
