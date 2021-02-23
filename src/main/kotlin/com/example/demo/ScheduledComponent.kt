package com.example.demo

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.Random

@Component
class ScheduledComponent {

    val logger : Logger = LoggerFactory.getLogger(ScheduledComponent::class.java)

    @Scheduled(fixedRate = 5000)
    fun scheduled() {
        val random = Random().nextInt()
        if (random % 3 == 0) {
            logger.info("INFO Log printed")
        }
        if (random % 5 == 0) {
            logger.error("Error log printed")
        }
        if (random % 2 == 0) {
            logger.trace("Trace log printed")
        }
    }
}