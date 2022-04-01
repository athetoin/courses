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
    implementation(project(":ch01-solution"))
    implementation(project(":output-api"))
		compileOnly("jakarta.ws.rs:jakarta.ws.rs-api:3.0.0")
		implementation("org.glassfish.jersey.containers:jersey-container-servlet:3.0.4")
		implementation("org.glassfish.jersey.inject:jersey-hk2:3.0.4")
  	implementation("org.glassfish.jersey.media:jersey-media-moxy:3.0.4")
  	implementation("org.glassfish.jersey.ext.cdi:jersey-cdi1x-servlet:3.0.4")
  	implementation("org.jboss.weld.servlet:weld-servlet-core:4.0.3.Final")
}

description = "Static output"
