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
    implementation("com._4meonweb.gt.cs1331.shell:solution-api:")
    implementation("org.glassfish.jersey.containers:jersey-container-servlet:3.0.4")
    implementation("org.glassfish.jersey.inject:jersey-hk2:3.0.4")
    implementation("org.glassfish.jersey.media:jersey-media-moxy:3.0.4")
    implementation("org.glassfish.jersey.ext.cdi:jersey-cdi1x-servlet:3.0.4")
    implementation("org.jboss.weld.servlet:weld-servlet-core:4.0.3.Final")
}

description = "Web output"
group = "com._4meonweb.gt.cs1331.shell"
