plugins {
    application
}


repositories {
    mavenCentral()
}

description = "Chapter one console solutions"

dependencies {
    implementation("com._4meonweb.gt.cs1331.shell:con-output:")
    implementation("com._4meonweb.gt.cs1331:ch02-solution:")
}

application {
    mainClass.set("org.jboss.weld.environment.se.StartMain")
    applicationDefaultJvmArgs = listOf(
        "-Dorg.jboss.logging.provider=jdk",
        "-Djava.util.logging.config.class=com._4meonweb.gt.cs1331.shell.console.LogConfiguration"
    )
}

tasks.withType<JavaExec>() {
    standardInput = System.`in`
}
