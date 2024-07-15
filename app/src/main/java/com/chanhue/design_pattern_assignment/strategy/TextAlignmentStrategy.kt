package com.chanhue.design_pattern_assignment.strategy

interface TextAlignmentStrategy {
    fun alignText(text: String, width: Int): String
}