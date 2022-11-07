// 2022-11-7
// How to use variable args
fun vars(vararg v:Int) {
    for(vt in v)
        print(vt)
}

// How to use lambda expression
fun testLambda() {
    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
    println(sumLambda(10, 20))
}

fun main(args : Array<String>) {
    vars(1, 3, 5, 7, 9)
    println()
    testLambda()
}