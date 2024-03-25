fun main() {
    mySentence("Barnie bakes brown bagels and buns")
   println(myNumbers(arrayOf(1,2,3,4,5)))
    myWord("madam")



}
fun mySentence(sentence:String){
    println(sentence.replace("b",""))
    sphere(1)


}
fun myNumbers(numbers:Array<Int>):Int{
    return numbers.count()



}





fun sphere(r:Int){
    var x = r*3
    var c = 4/3 *3.14159
    println(x*c)




}
fun myWord(word:String) {
    val palindrome = madam

    if (word == palindrome) {
        println(True)

    }
    else {
        println(False)
    }
}