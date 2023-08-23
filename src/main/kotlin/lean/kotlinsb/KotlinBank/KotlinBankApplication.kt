package lean.kotlinsb.KotlinBank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBankApplication

fun main(args: Array<String>) {
	runApplication<KotlinBankApplication>(*args)
}
