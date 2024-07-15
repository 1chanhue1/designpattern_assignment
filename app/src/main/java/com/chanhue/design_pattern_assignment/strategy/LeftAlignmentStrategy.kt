package com.chanhue.design_pattern_assignment.strategy

class LeftAlignmentStrategy : TextAlignmentStrategy {
    override fun alignText(text: String, width: Int): String {
        return text.padEnd(width)
    }
}