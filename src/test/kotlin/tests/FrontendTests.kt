package tests

import com.codeborne.selenide.Condition.text
import com.codeborne.selenide.Selenide.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FrontendTests {

    @Test
    fun `verify Google title`() {
        // Открываем сайт
        open("https://www.google.com")

        // Проверяем, что заголовок содержит слово "Google"
        assertEquals("Google", title())
    }

    @Test
    fun `search in Google`() {
        // Открываем сайт Google
        open("https://www.google.com")

        // Вводим текст в строку поиска и нажимаем Enter
        `$`("[name=q]").setValue("Kotlin").pressEnter()

        // Проверяем, что результаты поиска содержат слово "Kotlin"
        `$`("#search").shouldHave(text("Kotlin"))

        // Альтернативная проверка с использованием встроенной функции assertTrue
        assertTrue(`$`("#search").text().contains("Kotlin"))
    }
}
