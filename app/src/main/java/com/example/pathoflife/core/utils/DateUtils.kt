package com.example.pathoflife.core.utils

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

fun getFormattedToday(): String {
    val today = LocalDate.now()

    val formatter = DateTimeFormatter.ofPattern(
        "EEEE, d 'de' MMMM",
        Locale.forLanguageTag("pt-BR")
    )

    val formatted = today.format(formatter)

    return formatted.replaceFirstChar { it.uppercase() }
}
