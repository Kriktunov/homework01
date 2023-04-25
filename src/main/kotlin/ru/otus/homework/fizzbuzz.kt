package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
  
   val arrout = Array(n, {""})

        
        for ( i in  arrout.indices) {
            arrout[i] = "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0)     continue

            else if (i % 3 == 0 ) arrout[i] = "Fizz"
            else if (i % 5 == 0 )  arrout[i] = "Buzz"

           else arrout[i] = "$i"
       }
        return arrout

        }
  
  
}
