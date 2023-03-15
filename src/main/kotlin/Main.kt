
fun main() {
    //quz1
    numbers()
    //quiz2
  println(words(arrayOf("come","people","happy")))
    //quiz3
    drinks(4)
    drinks(12)
    drinks(20)
    //quiz4
    hundred()
}
//quiz1
fun numbers(){
    for (number in  1..100){
    if(number % 2 !=0){
        println(number)
    }
    }
}
//quiz2
fun words(word:Array<String>){

    for(word in word){
   if(word.length >5){
       println(word)
   }
   }
}
//quiz3
fun drinks(drink:Int){
    if(drink  in 0..5){
println("glass of milk")
    }
    else if(drink in 6..14){
        println("Fanta orange")
    }
else{
    println("coca cola")
    }
}
//quiz4
fun hundred(){
    for (hundred in 1..100) {
        if (hundred % 3 == 0) {
            println("Fizz")
        } else if (hundred % 5 == 0) {
            println("Buzz")
        } else {
            println("FizzBuzz")
        }
    }
}