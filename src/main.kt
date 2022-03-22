fun main(){

name(arrayOf("PEACE","HAPPINESS","HARDWORK"))
var word =name(arrayOf("nairobi","dodoma","kampala"))
    number(arrayOf(10,40,60,80,100,130))
    var names=names(arrayOf("Achievement","Optimistic","Courage"))
    println(names.contentToString())
    word("AkiraChix")
    var name=statement("MISKY",21)
    println(name)
    var math=length("MISKY")
    println(math)
    info("Tamara")
    var identity=greetings("Awino")
    println(identity)
    var like=fact("vacation")
    println(like)
    task(arrayOf("CodeHive","Women","Lead","Success"))

}
fun name(Name: Array<String>){
println(Name.contentToString())
}
fun cities(name: Array<String>){
    name.forEach {word ->
        println(word.capitalize())
    }
}
fun number(num: Array<Int>){
    var sum =num[3]+num[4]
    println(sum)
    var num=num.indexOf(100)
    println(num)
}
fun names(name: Array<String>):Array<String>{
    var names=name
    return names
}
fun word(name: String){
    var word=(name)
    print(word[0])
    print(word[2])
    println(word[3])
}
fun statement(name: String,num: Int):String{
    var statement=("Hi, my school is $name and I am $num years old.")
    return statement
}
fun length(name: String):Int{
    var math=name.length
    return math
}
fun info(name: String){
    if (name=="Nalenyi")
        println("That's me!")
    else
        println("That's not me!")
}

fun greetings(name: String):String{
    var greetings=("Hello $name?")
    return greetings
}
fun fact(name:String):String{
    var fact=("I like going for $name everytime.")
    return fact
}
fun task(name: Array<String>){
    var task=(name)
    println(name.contentToString())
}