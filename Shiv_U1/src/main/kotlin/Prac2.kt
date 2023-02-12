//Pyramid pattern of CSE224
import  java.util.*;
fun main(args:Array<String>){
    for(i in 1 .. 37) {
        if(i==6||i==7||i==8||i==14||i==15||i==16||i==22||i==23||i==24||i==30||i==31||i==32){
            print(" ")
        }
        else
        print("*");
    }
    println();
    println("*       *       *           *       *")
    for(i in 1 .. 37) {
        if(i==2||i==3||i==4||i==5||i==6||i==7||i==8||i==14||i==15||i==16||i==22||i==23||i==24||i==30||i==31||i==32){
            print(" ")
        }
        else
            print("*");
    }
    println()
    println("*           *   *       *       *")
    for(i in 1 .. 37) {
        if(i==6||i==7||i==8||i==14||i==15||i==16||i==22||i==23||i==24||i==30||i==31||i==32){
            print(" ")
        }
        else
            print("*");
    }
}