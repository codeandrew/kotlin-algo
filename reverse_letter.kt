fun reverseLetter(str: String): String 
   = str.split("").reversed().joinToString("").replace("[^a-zA-Z]".toRegex(), "")

# Other Solutions

fun reverseLetter(str: String): String {
    return str.filter(Char::isLetter).reversed()
}


fun reverseLetter(str: String)= str.filter { it in 'a'..'z' || it in 'A'..'Z' }.reversed()

fun reverseLetter(str: String): String = str.filter { it.isLetter() }.reversed()

fun reverseLetter(str: String): String = str.replace(Regex("[^a-zA-Z]"), "").reversed()

