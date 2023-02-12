package com.example.kotlindemobasics
//functions
fun main(args:Array<String>)
{
    println("call no arg no ret sum()")
    suma()

    println("call with arg no ret sum()")
    sum1a(5,10)

    println("call no arg with ret sum()")
    var a:Int=sum2a()
    println("out of with return type method is: "+a)

    println("call with arg with ret sum()")
    var b=sum3a(50,10)
    println("output of with return type method is: "+a)

}

//no arg no ret
fun suma():Unit //Unit means void return type mentioning it is optional
{
    var a=9
    var b=10
    var result=a+b
    print("sum of adding $a and $b is : $result")
}

//with arg no ret
fun sum1a(x:Int,y:Int)
{
    var result=x+y
    print("sum of adding $x and $y is : $result")
}

//no arg with ret
fun sum2a():Int
{
    var a=9
    var b=10
    return a+b
}

fun sum3a(x:Int,y:Int):Int
{
    return x+y
}