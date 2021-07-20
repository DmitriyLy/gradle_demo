package org.dmly.groovy

list = [1, 2, 3]
println(list)
println(list.class)

LinkedList linkedList = [45, 46, 78]
println(linkedList)
println(linkedList.class)

list << 4
println(list)

list = list + [5, 6, 7]

println(list)

println(list - [3, 5])

list.each {println(it)}
println("---------------")
list.reverseEach {println(it)}
println("---------------")
//list.eachPermutation {println(it)}