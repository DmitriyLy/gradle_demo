package org.dmly.groovy

set = ['java', 'js', 'python'] as Set
println(set)
println(set.class)


map = [courseName: 'Gradle', rating: 5]
println(map)
println(map.getClass())

map.each {
    k,v ->
        println(k.class)
        println(v.class)
}

println(map.courseName)
println(map['courseName'])
println(map.get("courseName"))