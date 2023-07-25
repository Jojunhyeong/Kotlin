class Song(val title: String, val artist: String, val publishYear: Int, val playCount: Int){
    val isPopular: Boolean
        get() {
            return playCount >= 1000
        }


    fun explainSong(){
        println("[$title], 연주한 [$artist], 출시한 [$publishYear]")
    }
}

fun main() {
    val  checkSong = Song("queencard", "idle", 2023, 10020)

    checkSong.explainSong()

    println(checkSong.isPopular)
}