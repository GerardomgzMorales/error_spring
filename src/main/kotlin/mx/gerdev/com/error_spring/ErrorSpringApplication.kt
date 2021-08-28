package mx.gerdev.com.error_spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ErrorSpringApplication

fun main(args: Array<String>) {
    runApplication<ErrorSpringApplication>(*args)
}
