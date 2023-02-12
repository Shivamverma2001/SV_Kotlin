fun main(args:Array<String>){
    for(i in 1 .. 21){
        if(i<=5)
            print("*")
        else if(i>8&&i<=13)
            print("!")
        else if(i>16&&i<=21)
            print("^")
        else
            print(" ")
    }
    println()
    for(i in 1 .. 2){
        for(j in 1 .. 21){
            if(j==1)
                print("*")
            if(j==8)
                print("!")
            if(j==15)
                print("^")
            else
                print(" ")
        }
        println()
    }
    for(i in 1 .. 21){
        if(i==1)
            print("*")
        else if(i>8&&i<=13)
            print("!")
        else if(i>16&&i<=21)
            print("^")
        else print(" ")
    }
    println()
    for(i in 1 .. 2){
        for(j in 1 .. 21){
            if(j==1)
                print("*")
            if(j==12)
                print("!")
            if(j==15)
                print("^")
            else print(" ")
        }
        println()
    }
    for(i in 1 .. 21){
        if(i<=5)
            print("*")
        else if(i>8&&i<=13)
            print("!")
        else if(i>16&&i<=21)
            print("^")
        else print(" ")
    }
}