dependencies {
    implementation(project(":detekt-api"))
    testImplementation(project(":detekt-test"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.6.2")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
