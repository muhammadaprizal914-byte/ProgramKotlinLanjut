package Oop

// Kelas Induk
open class Hewan {                                    //kata kunci open artinya kelas ini boleh diturunkan (di-inherit) oleh kelas lain.
    open val suara: String = "Suara hewan secara umum" //properti ini dibuat open agar bisa di-override (ditimpa) oleh kelas turunan.
}

// Kelas Anak (override properti suara)
class Anjing : Hewan() {    //berarti kelas Anjing mewarisi sifat dari kelas Hewan.
    // Override properti suara dari induk Hewan
    override val suara: String = "Guk! Guk!" //properti suara ditimpa dengan nilai baru "Guk! Guk!".
}

class Kucing : Hewan() {
    override val suara: String = "Meong! Meong!"
}

class Sapi : Hewan() {                                                                              //open → memberi izin properti/kelas untuk di-override.
    override val suara: String = "Moo! Moo!"                                                         // override → menimpa isi/properti dari kelas induk
}

// Fungsi untuk menampilkan suara hewan
fun infoHewan(hewan: Hewan) {
    println("${hewan.javaClass.simpleName} bersuara = ${hewan.suara}")
}

// Fungsi main sebagai titik masuk program
fun main() {
    val hewan = Hewan() //Membuat objek dari Hewan, Anjing, Kucing, dan Sapi.
    infoHewan(hewan) //Setiap objek dikirim ke fungsi infoHewan().

    val anjing = Anjing()
    infoHewan(anjing)

    val kucing = Kucing()
    infoHewan(kucing)

    val sapi = Sapi()
    infoHewan(sapi)
}