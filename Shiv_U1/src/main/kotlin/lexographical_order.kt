import  java.util.*;
import kotlin.collections.HashMap

fun main(args:Array<String>){
//    val words=arrayOf("Ruby","C","Python","Java");
//    words.sort();
//    for(i in words){
//        print("$i")
//    }

//    val rows=5;
//    var k=0;
//    for(i in 1 .. rows){
//        for(space in 1 .. rows-i){
//            print(" ");
//        }
//        while(k!=2*i-1){
//            print("*")
//            ++k
//        }
//        println()
//        k=0
//    }
    var s="aabbccA"
    s=s.lowercase()
    val map=HashMap<Char,Int>()
    for(i in s.toCharArray()){
        if(map.keys.contains(i)){
            var x=map[i]
            map[i]=1+x!!
        }
        else{
            map[i]=1
        }
    }
    for(c in map.keys){
        print(c+" "+map[c])
    }
    var i=5;

}