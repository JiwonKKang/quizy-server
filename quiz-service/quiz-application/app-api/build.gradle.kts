import org.springframework.boot.gradle.tasks.bundling.BootJar

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.named<BootJar>("bootJar") {
    enabled = true
}