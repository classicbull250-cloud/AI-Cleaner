package com.example.aicleaner

object CleanerDecisionEngine {

    private val greetingWords = listOf(
        "good morning",
        "good night",
        "good evening",
        "have a nice day",
        "शुभ प्रभात",
        "शुभ रात्रि",
        "जय श्री राम",
        "happy birthday",
        "happy anniversary"
    )

    private val importantKeywords = listOf(
        "exam",
        "school",
        "college",
        "institute",
        "notice",
        "admission",
        "date",
        "time",
        "venue",
        "contact"
    )

    fun isGreeting(text: String): Boolean {
        val lowerText = text.lowercase()
        return greetingWords.any { lowerText.contains(it) }
    }

    fun isImportant(text: String): Boolean {
        val lowerText = text.lowercase()
        return importantKeywords.any { lowerText.contains(it) }
    }

    fun shouldSuggestDelete(text: String): Boolean {
        return isGreeting(text) && !isImportant(text)
    }
}
