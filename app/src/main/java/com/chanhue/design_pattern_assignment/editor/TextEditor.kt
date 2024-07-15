package com.chanhue.design_pattern_assignment.editor

import com.chanhue.design_pattern_assignment.strategy.TextAlignmentStrategy

class TextEditor(private var strategy: TextAlignmentStrategy) {
    fun setAlignmentStrategy(strategy: TextAlignmentStrategy) {
        this.strategy = strategy
    }

    fun publishText(text: String, width: Int): String {
        return strategy.alignText(text, width)
    }
}