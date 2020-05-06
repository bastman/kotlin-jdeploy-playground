/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.example

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required

class App:CliktCommand() {
    private val from by option("-f", "--from", help = "from").required()
    private val to by option("-t", "--to", help = "to").required()

    override fun run() {
        println("hello from $from to $to")
    }
}

fun main(args: Array<String>) {
    App().main(args)
}
