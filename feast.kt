fun feast(beast: String, dish: String): Boolean {
  val arg = beast.take(1) == dish.take(1) && beast.takeLast(1) == dish.takeLast(1)
  return if (arg) true else false
}


# other solutions
fun feast(beast: String, dish: String) = beast.first() == dish.first() && beast.last() == dish.last()

