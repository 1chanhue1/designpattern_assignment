package com.chanhue.design_pattern_assignment.strategy

class CenterAlignmentStrategy : TextAlignmentStrategy {
    override fun alignText(text: String, width: Int): String {
        val padding = (width - text.length) / 2
        return text.padStart(padding + text.length).padEnd(width)
    }
}