package Exercise4


/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */

fun main(){
    try {
        // pernyataan yang berpotensi mengakibatkan Exception
        val hasil = 6/0
        println("Hasilnya adalah : $hasil")
    } catch (e: Exception) {
        // pernyataan disini akan di eksekusi jika terjadi Exception
        println("Terjadi error. Pembagian dengan penyebut nol (0) tidak diperbolehkan")
    }
}