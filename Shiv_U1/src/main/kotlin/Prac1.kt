//purchasing 6 product and 1 input should be 100 and 1 is 200
//if total value goes above 500  then 20% discount
// if priya purchase product 100 rs 10 rs discount or more than 200 20rs discount
// sort the product price in the form of ascending order
//find total and average
//how much discount above 500 20%, less than 500 10%
import java.util.*;
fun main(args:Array<String>){
    var sc=Scanner(System.`in`);
    var product= arrayOf(0,0,0,0,0)
    product[0]=sc.nextInt()
    while(product[0]<=100){
        println("Enter the price greater than 100")
        product[0]=sc.nextInt();
    }
    product[0]-=10
    product[1]=sc.nextInt()
    while(product[1]<=200){
        println("Enter the price greater than 200")
        product[1]=sc.nextInt();
    }
    product[1]-=20
    product[2]=sc.nextInt()
    if(product[2]>=200)
        product[2]-=20
    else if(product[2]>=100)
        product[2]-=10
    product[3]=sc.nextInt()
    if(product[3]>=200)
        product[3]-=20
    else if(product[3]>=100)
        product[3]-=10
    product[4]=sc.nextInt()
    if(product[4]>=200)
        product[4]-=20
    else if(product[4]>=100)
        product[4]-=10
    var total=0
    for(i in 0 .. product.size-1){
        total+=product[i];
    }
    var dis=0;
    if(total>500){
        dis=total-(total*20)/100;
    }
    product.sort();
    dis=dis/total;
    for(i in 0 .. product.size-1)
        println("${product[i]}")
    println()
    println("Total price is ${total}");
    println("Average is ${total/4}")
    println("Discount is ${dis}")
}