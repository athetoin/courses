plugins {
    war
    id("org.gretty") version "4.0.1"
}

repositories {
    mavenCentral()
}

gretty {
    servletContainer="jetty11"
}

dependencies{
    implementation("com._4meonweb.gt.cs1331.shell:web-output:")
    implementation("com._4meonweb.gt.cs1331:ch01-solution:")
}

description = "Web output"

tasks.war {
    webAppDirectory.set(file("../web-output/src/main/webapp"))
}