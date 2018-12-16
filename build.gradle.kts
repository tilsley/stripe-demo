plugins {
	val springBootVersion = "2.1.1.RELEASE"
	java
	application
	id("org.springframework.boot") version springBootVersion
	id("io.spring.dependency-management") version "1.0.6.RELEASE"
}

subprojects {
	version = rootProject.version
}
group = "com.stripe"

apply(from = rootProject.file( "docker.gradle.kts"))

configure<ApplicationPluginConvention> {
	mainClassName = "com.stripe.StripeApplication"
}

configure<JavaPluginExtension> {
	sourceCompatibility = JavaVersion.VERSION_11
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	annotationProcessor("org.projectlombok:lombok:1.18.4")
	compileOnly("org.projectlombok:lombok:1.18.4")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}
