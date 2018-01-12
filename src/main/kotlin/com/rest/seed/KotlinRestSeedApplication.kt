package com.rest.seed

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinRestSeedApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinRestSeedApplication::class.java, *args)
}
