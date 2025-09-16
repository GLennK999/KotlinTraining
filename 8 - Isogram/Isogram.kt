/*
Determine if a word or phrase is an isogram.

An isogram (also known as a "non-pattern word") is a word or phrase without a repeating letter, however spaces and hyphens are allowed to appear multiple times.

Examples of isograms:

lumberjacks
background
downstream
six-year-old
The word isograms, however, is not an isogram, because the s repeats.
*/

object Isogram {
    fun isIsogram(input: String): Boolean {
        val inputArray: CharArray = input.toCharArray()
        for(i in 0..inputArray.size-1){
            if(input.uppercase().indexOf(inputArray[i].uppercase())!= -1){
                if(input.uppercase().indexOf(inputArray[i].uppercase()) != input.uppercase().lastIndexOf(inputArray[i].uppercase())){
                    return false
                }
            }
        }
        return true
    }
}

fun main () {
    if(Isogram.isIsogram("isogram") == true){
        println("É um isograma")
    }else{
        println("Não é um isograma")
    }
}