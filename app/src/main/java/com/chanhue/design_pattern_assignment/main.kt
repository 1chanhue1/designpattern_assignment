package com.chanhue.design_pattern_assignment

import com.chanhue.design_pattern_assignment.editor.TextEditor
import com.chanhue.design_pattern_assignment.strategy.CenterAlignmentStrategy
import com.chanhue.design_pattern_assignment.strategy.LeftAlignmentStrategy
import com.chanhue.design_pattern_assignment.strategy.RightAlignmentStrategy

fun main(){



    Logger.log("hi")



    val str = "Hello! World"
    val width = 30

    val editor = TextEditor(LeftAlignmentStrategy())


    println("왼쪽 정렬: ${editor.publishText(str, width)}")

    editor.setAlignmentStrategy(RightAlignmentStrategy())
    println("오른쪽 정렬: ${editor.publishText(str, width)}")

    editor.setAlignmentStrategy(CenterAlignmentStrategy())
    println("가운데 정렬: ${editor.publishText(str, width)}")
}