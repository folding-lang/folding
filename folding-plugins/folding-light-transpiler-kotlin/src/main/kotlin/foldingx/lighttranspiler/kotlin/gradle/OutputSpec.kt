package foldingx.lighttranspiler.kotlin.gradle

import foldingx.gradle.base.FoldingSourceSet

data class OutputSpec(val outputPath: String, val sourceSets: List<FoldingSourceSet>) {
}