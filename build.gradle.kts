plugins {
    kotlin("jvm") version "1.8.10"
}

repositories {
    mavenCentral()
}

dependencies {
    // Selenium для автоматизации браузера
    testImplementation("org.seleniumhq.selenium:selenium-java:4.4.0")

    // Selenide - упрощенная обертка над Selenium
    testImplementation("com.codeborne:selenide:6.4.0")

    // JUnit для тестов
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")

    // Зависимость для стандартных тестов в Kotlin
    testImplementation(kotlin("test"))

    // Selenide для работы с браузером
    testImplementation("com.codeborne:selenide:6.4.0")

    // JUnit для запуска тестов
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)  // Устанавливаем JVM версию 17
}
