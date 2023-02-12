fun main(args:Array<String>){
    var a= intArrayOf(1,2,4,6,5)
    a.sort();
    for(v in a){
        print(v);
    }
    println();
    var b= charArrayOf('a','c','b','g','d')
    b.sort();
    for(v in b)
        print(v)
    println()
    var c= arrayOf("Shivam ","verma ","my ","name ","is ")
    c.sort();
    for(v in c)
        print(v)
    println()
}