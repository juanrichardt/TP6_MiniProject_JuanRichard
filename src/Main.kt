
fun main() {
    println("================================")
    println("     TP6 MINI PROJECT")
    println("================================")
    println("1. Informasi Proyek")
    println("2. Nama Pembuat")
    println("3. Keluar")
    println("================================")
    print("Pilih menu: ")

    val pilihan = readlnOrNull()

    when (pilihan) {
        "1" -> println("Proyek ini dibuat untuk praktik Git.")
        "2" -> println("Dibuat oleh Juan Richard.")
        "3" -> println("Program selesai.")
        else -> println("Pilihan tidak valid.")
    }
}
