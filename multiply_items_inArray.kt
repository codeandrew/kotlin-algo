package reducebutgrow

fun grow(arr: IntArray): Int {
    var answer = 1
    for (i in arr) {
        answer *= i
    }

    return answer
}


# Other Answers
fun grow(arr: IntArray): Int = arr.reduce { a, b -> a * b }

