// TODO 1c: Langkah ketiga untuk dapat membuat Affirmation Recyclerview tahap data yakni,
//  membuat sebuah package dengan nama data,melalui:meng-klik kanan app > java > com.maylinda.affirmations,
//  lalu pilih New > Package > com.maylinda.affirmations.data>enter.
//  Dalam package data dibuat class bernama Datasource dengan cara :klik kanan paket com.maylinda.affirmations.data
//  dan pilih New > Kotlin File/Class > Datasource.kt > enter.



package com.maylinda.affirmations.data

import com.maylinda.affirmations.R
import com.maylinda.affirmations.model.Affirmation

//  Pada class  Datasource.kt ini yang mengantisispasi terjadinya ketidak tepatan dalam format yang sama persis dengan yang butuhkan.
//  Maka didalam class ini dituliskan kode, yakni: memaut fungsi loadAffirmations() untuk dapat menampilkan daftar Affirmations,
//  yang didalamnya dideklarasikan List<Affirmation> sebagai jenis nilai yang ditampilkan,ditambahkan pernyataan return,
//  serta memanggil listOf<>() untuk membuat List.
class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}
