package com.mcm.kotlinserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinserverApplication

fun main(args: Array<String>) {
	runApplication<KotlinserverApplication>(*args)
}
