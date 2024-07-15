package com.chanhue.design_pattern_assignment.strategy

class RightAlignmentStrategy : TextAlignmentStrategy {
    override fun alignText(text: String, width: Int): String {
        return text.padStart(width)
    }
}