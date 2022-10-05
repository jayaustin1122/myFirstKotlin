package com.tutorials

import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main(){

    logger.trace { "This is a trace log" }
    logger.debug { "This is a debug log" }
    logger.info { "This is a info log" }
    logger.warn { "This is a warn log" }
    logger.error { "This is a error log" }

}