## Get started with Kotlin

1. 2022-11-7 Different compilers: kotlinc vs kotlinc-native
kotlinc-native hello.kt -o hello // generate hello.exe out of hello.kt

kotlinc hello.kt -include-runtime -d hello.jar
java -jar hello.jar

(1) -include-runtime：链接kotlin runtime
(2) 若去掉-include-runtime, kotlinc hello.kt -d hello.jar 则生成可供其他app复用的jar包。
(3) 引用别人做好的jar包：kotlin -classpath hello.jar HelloKt
HelloKt是编译器为hello.kt生成的默认类名。
(4) 交互式解析器REPL: kotlinc-jvm，与Python中的python cli差不多
(5) kotlin还可作为脚本使用, .kts
运行命令：kotlinc -script list_folders.kts <path_to_folder>

2. 2022-11-7 Using kotlin compiler v1.7.20 from https://github.com/JetBrains/kotlin/releases/tag/v1.7.20
3. package declaration:
package com.wentau.main
import java.util.*

fun test() {}
class Test {}
默认会导入：
kotlin.*
kotlin.annotation.*
kotlin.collections.*
kotlin.comparisons.*
kotlin.io.*
kotlin.ranges.*
kotlin.sequences.*
kotlin.text.*
4. 用valarg标示可变长参数。
5. 用val表示const常量，var表示变量。
6. kotlin注释：//单行，/* */可跨多行成块注释。
7. $表示一个变量名或变量值。例：var a = 1
val s1 = "a is $a"
a = 2
val s2 = "${s1.replace("is", "was")}, but now is $a"
https://www.runoob.com/kotlin/kotlin-basic-syntax.html