/*
 Instructions
Your task is to determine what Bob will reply to someone when they say something to him or ask him a question.

Bob only ever answers one of five things:

"Sure." This is his response if you ask him a question, such as "How are you?" The convention used for questions is that it ends with a question mark.
"Whoa, chill out!" This is his answer if you YELL AT HIM. The convention used for yelling is ALL CAPITAL LETTERS.
"Calm down, I know what I'm doing!" This is what he says if you yell a question at him.
"Fine. Be that way!" This is how he responds to silence. The convention used for silence is nothing, or various combinations of whitespace characters.
"Whatever." This is what he answers to anything else
 */

fun answers(question: String) {
    if (question != question.uppercase() && question.endsWith("?")) {
        println("Sure.")
    } else if (question == "") {
        println("Fine. Be that way!")
    } else if (question == question.uppercase() && question.endsWith("?")) {
        println("Calm down, I know what I'm doing!")
    } else if (question == question.uppercase()) {
        println("Whoa, chill out!")
    } else {
        println("Whatever.")
    }
}

fun main() {
    answers("Hello, world!!!") // Whatever
    answers("Whats your name?") // Sure.
    answers("I ASKED YOU A QUESTION!") // Whoa, chill out!
    answers("ARE YOU HEARING ME?") // Calm down, I know what I'm doing!
    answers("") //Fine. Be that way!
}
