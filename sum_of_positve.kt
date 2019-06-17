fun sum(numbers: IntArray): Int {
    var sum = 0
    for(number in numbers){
        if (number >= 1){
          sum += number
        }
    }
    return sum
}

# Other Answers
fun sum(numbers: IntArray) = numbers.filter { it > 0 }.sum()


fun sum(numbers: IntArray)
  = numbers.sumBy { it.coerceAtLeast(0) }


