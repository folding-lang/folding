package foldingx.lighttranspiler.kotlin.gradle

import foldingx.gradle.base.FoldingExtension
import foldingx.gradle.base.FoldingPlatformContainer

val FoldingExtension.kotlin
    get() = platforms.findByName("kotlin")!!