fun main(args:Array<String>){
    var a=arrayOf("Hyderabad","Chennai","Mubai","Kolkata","Bengaluru")
    for(i in a){
        println("$i")
        var p=i.lowercase()
        var c1=i[1]
        var c2=i[2]
        var count1=0
        var count2=0
        for(j in 0 .. i.length-1){
            if(c1==i[j])
                count1++
            if(c2==i[j])
                count2++
        }
        println("Frequency of $c1 - $count1")
        println("Frequency of $c2 - $count2")
    }
}