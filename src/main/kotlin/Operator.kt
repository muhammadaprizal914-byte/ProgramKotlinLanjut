fun main() {
    // Contoh variabel nullable bertipe Int
    var maybeNumber: Int? = 15
    maybeNumber = null

    // Menghindari NullPointerException dengan safe call atau elvis operator
    println("Hasil perkalian: ${(maybeNumber ?: 0) * 2}")

    // Contoh variabel non-nullable String
    var s1: String = "Hello"

    // Contoh variabel nullable String
    var s2: String? = "World"

    // Cetak panjang string
    println("Panjang s1: ${s1.length}")

    // Menggunakan safe call untuk s2
    println("Panjang s2: ${s2?.length ?: "s2 is null"}")
}
