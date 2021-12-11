fun main(){
    // Aturan pembelian pakaian
    // 1. Jika pembeli merupakan member -> diskon 5%,
    // dan jika melakukan pembelian diatas Rp.500.000 maka akan mendapatkan diskon 10%

    // Diket : Pembeli membeli pakaian dengan total harga = Rp.625.000
    //         Pembeli memiliki member

    val statuspembeli : String = "Member"
    val pembelian : Int = 500000
    val hargaPembelian : Double = 625000.0
    val diskon5Persen : Double = hargaPembelian*0.05
    val diskon10Persen : Double = hargaPembelian*0.1
    val diskon15Persen : Double = hargaPembelian*0.15


    if (statuspembeli == "Member" && hargaPembelian <= pembelian){
        println("Pembeli 1 mendapat diskon 5% dari $hargaPembelian ,Jadi totalnya : $hargaPembelian - $diskon5Persen = "+(hargaPembelian-diskon5Persen))
    }else if (statuspembeli != "Member" && hargaPembelian >= pembelian){
        println("Pembeli 1 mendapat diskon 10% dari $hargaPembelian ,Jadi totalnya : $hargaPembelian - $diskon10Persen = "+(hargaPembelian-diskon10Persen))
    }else if(statuspembeli == "Member" && hargaPembelian >= pembelian ){
        println("Pembeli 1 mendapat diskon 15% dari $hargaPembelian ,Jadi totalnya : $hargaPembelian - $diskon15Persen = "+(hargaPembelian-diskon15Persen))
    }else{

    }


    // MENGETAHUI BERAT BADAN IDEAL
    // rumus berat badan ideal -> tinggi badan - 110
    val beratBadan : Int = 45
    val tinggiBadan : Int =161
    val beratBadanIdeal : Int = tinggiBadan - 110

    if(beratBadan <= beratBadanIdeal){
        println("Kurus")
    }else if (beratBadan == beratBadanIdeal){
        println("ideal")
    }else if (beratBadan >= beratBadan){
        println("gemuk")
    }else{

    }

}