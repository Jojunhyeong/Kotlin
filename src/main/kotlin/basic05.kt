fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?){
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby == null){
            println("$name has no hobby")
        } else {
            if (referrer == null) {
                println("Like to $hobby. Doesn't have a referrer\n")
            } else {
                println("Likes to $hobby. Has a referrer named ${referrer.name}, who likes to play play ${referrer.hobby}")
            }
        }
    }
}