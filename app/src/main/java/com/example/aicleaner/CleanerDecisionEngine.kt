package com.example.aicleaner

object CleanerDecisionEngine {

    fun isGreeting(text: String): Boolean {
        val greetings = listOf(
            "good morning",
            "good night",
            "good evening",
            "have a nice day",
            "शुभ प्रभात",
            "शुभ रात्रि",
            "जय श्री राम"
        )
        val lower = text.lowercase()
        return greetings.any { lower.contains(it) }
    }

    fun isImportant(text: String): Boolean {
        val keywords = listOf(
            "exam", "school", "college",
            "notice", "date", "time",
            "venue", "contact"
        )
        val lower = text.lowercase()
        return keywords.any { lower.contains(it) }
    }

    fun shouldSuggestDelete(text: String): Boolean {
        return isGreeting(text) && !isImportant(text)
    }
}
