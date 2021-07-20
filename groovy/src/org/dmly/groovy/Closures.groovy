package org.dmly.groovy

c = {
    println("Inside closure")
}
c.call()

checker = {
    n = 0 -> println(n % 2 == 0 ? "even" : "odd")
}

checker.call(1)
checker.call(2)
checker.call()


4.times { n -> print(n + " ")}
println("\n")
4.times { print it }
