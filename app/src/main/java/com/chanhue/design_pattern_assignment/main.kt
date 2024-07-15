package com.chanhue.design_pattern_assignment

import com.chanhue.design_pattern_assignment.editor.TextEditor
import com.chanhue.design_pattern_assignment.strategy.CenterAlignmentStrategy
import com.chanhue.design_pattern_assignment.strategy.LeftAlignmentStrategy
import com.chanhue.design_pattern_assignment.strategy.RightAlignmentStrategy

fun main(){



    Logger.log("hi")



    val text = "Hello! World"
    val width = 30

    val editor = TextEditor(LeftAlignmentStrategy())

    editor.setAlignmentStrategy(RightAlignmentStrategy())

    editor.setAlignmentStrategy(CenterAlignmentStrategy())
}