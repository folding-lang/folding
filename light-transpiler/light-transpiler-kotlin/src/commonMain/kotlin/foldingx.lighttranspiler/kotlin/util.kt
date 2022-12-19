package foldingx.lighttranspiler.kotlin

fun String.insertMargin(length: Int) = replace("\n","\n"+" ".repeat(length))


