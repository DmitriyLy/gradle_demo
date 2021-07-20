package org.dmly.groovy

def a = 10
println a
println a.class

def b = 10.24F
println b
println b.class

def s =  'hello'
println s

name = 'dmly'
def s1 = "hello ${name}"
println(s1)
println(s1.class)
println(s.class)


def multiString = '''
Multi string example.
Works in Groovy.
'''

println(multiString)
println(multiString.class)

emailPattern = /[A-Za-z0-9+_.-]+@(.+)/
println("test@gmail.com"==~emailPattern)
println("testgmail.com"==~emailPattern)
println(emailPattern.class)