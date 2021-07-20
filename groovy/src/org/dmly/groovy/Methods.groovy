package org.dmly.groovy

static int product(int x = 3, int y) {
    return  x * y
}

println(product(10, 5))
println(product(5))

static void display(Map productDetail) {
    println(productDetail)
}

display([name:'IPhone'])