package io.tjohander.exceptiondemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExceptiondemoApplication

fun main(args: Array<String>) {
    runApplication<ExceptiondemoApplication>(*args)
}
