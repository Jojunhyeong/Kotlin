class Song(val title: String, val artist: String, val publishYear: Int, val playCount: Int){
    val isPopular: Boolean
        get() {
            return playCount >= 1000
        }


    fun explainSong(){
        println("The song title is [$title], the artist is [$artist], and published in [$publishYear]")
    }
}

fun main() {
    val  checkSong = Song("queencard", "idle", 2023, 10020)

    checkSong.explainSong()

    println(checkSong.isPopular)
}