fun main() {
    for (i in 1..100) {
        fizzBuzz(i)
    }
}

private fun fizzBuzz(num: Int) {
    if (num % 15 == 0) {
        println("FizzBuzz")
    } else if (num % 3 == 0) {
        println("Fizz")
    } else if (num % 5 == 0) {
        println("Buzz")
    } else {
        println(num)
    }
}