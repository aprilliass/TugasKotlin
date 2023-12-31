package Exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile(){
    val namaDepan:String="Aprillia"
    val namaBelakang:String="Sekarningrum"
    val umur:Int=21
    val statustrue = "=Single"
    val statusfalse = "=Tidak"

    println("Nama lengkap: $namaDepan $namaBelakang")
    println("Umur: $umur tahun")
    println("Status : $statustrue")
}


/** Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId:Int, groupMember:List<Any>, session:String): Any{

    println("Group Id: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")

    return arrayOf(groupId, groupMember,session)
}

/** Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
fun myGroup(): String{
    val groupMember = listOf("April","Mahsha", "Miftah", "Mitha", "Sutan")
    val myGroup = groupMember[0]
    return myGroup
}

/** Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMentor():Int{
    val mentor= listOf("Dian","Hasan","Reza", "Shasa")
    val countOfGroup= 5

    return mentor.size + countOfGroup
}

fun main() {
    myProfile()

    val myGroup = myGroup()
    println("My group is $myGroup")

    val totalMember = totalMentor()
    println("Total member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */

    groupDetail(6, listOf("April", "Mahsha", "Miftah", "Mitha", "Sutan"), "Afternoon")
}
