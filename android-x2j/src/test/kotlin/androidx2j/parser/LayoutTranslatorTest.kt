package androidx2j.parser

import org.junit.Test
import java.io.File

/**
 * @author 7hens
 */
class LayoutTranslatorTest {
    @Test
    fun test() {
        StyleParser.load(File("../sample/src/main/res/values/styles.xml"))

        val xmlFile = File("../sample/src/main/res/layout/activity_main.xml")
        val translator = LayoutTranslator("androidxj2.sample")
        translator.translate(xmlFile, 123)
    }
}