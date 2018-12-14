plugins {
	val springBootVersion = "2.1.1.RELEASE"
	java
	id("org.springframework.boot") version springBootVersion
	id("io.spring.dependency-management") version "1.0.6.RELEASE"
}

group = "com.stripe"
version = "0.0.1-SNAPSHOT"
configure<JavaPluginExtension> {
	sourceCompatibility = JavaVersion.VERSION_11
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	annotationProcessor("org.projectlombok:lombok:1.18.4")
	compileOnly("org.projectlombok:lombok:1.18.4")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}
