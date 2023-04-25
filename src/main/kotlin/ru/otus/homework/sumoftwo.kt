package ru.otus.homework

fun main() {

    fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
        val array1 = Array(2) { 0 }
        for (x in numbers.copyOfRange(0, numbers.size - 1)) {
            for (y in numbers.copyOfRange(x + 1, numbers.size)) {
                if (numbers[x] + numbers[y] == target) {
                    array1[0] = x
                    array1[1] = y
                }
            }
        }

        return if (array1[0] == 0 && array1[1] == 0) {
            throw Exception("IllegamentException")
        } else {
            val toIntArray: IntArray = array1.toIntArray()
            toIntArray
        }


    }
}
