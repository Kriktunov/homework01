package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
  
  val arrout = Array(n, {""})
        for ( i in  arrout.indices) {
            if (i % 3 == 1 ) {
                arrout[i] = "Fizz"
            } else if (i % 5 == 1 )  arrout[i] = "Buzz"

            else if (i % 3 == 1 && i % 5 == 1) arrout[i] ="FizzBuzz"

            else arrout[i] = "$i"
        }
        return arrout
}
