package com.chanhue.design_pattern_assignment

import com.chanhue.design_pattern_assignment.editor.TextEditor
import com.chanhue.design_pattern_assignment.strategy.CenterAlignmentStrategy
import com.chanhue.design_pattern_assignment.strategy.LeftAlignmentStrategy
import com.chanhue.design_pattern_assignment.strategy.RightAlignmentStrategy

fun main(){



    Logger.log("hi")



    val text = "Hello! my name is chan"
    val width = 3

    val editor = TextEditor(LeftAlignmentStrategy())
    Logger.log("hi")

    editor.setAlignmentStrategy(RightAlignmentStrategy())
    Logger.log("hi")

    editor.setAlignmentStrategy(CenterAlignmentStrategy())
}