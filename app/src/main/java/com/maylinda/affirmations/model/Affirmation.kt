// TODO 1b: Langkah kedua untuk dapat membuat Affirmation Recyclerview tahap data yakni,
//  membuat sebuah package dengan nama model,melalui:meng-klik kanan app > java > com.maylinda.affirmations,
//  lalu pilih New > Package > com.maylinda.affirmations.model>enter.
//  Dalam package model dibuat class bernama Affirmation dengan cara :klik kanan paket com.maylinda.affirmations.model
//  dan pilih New > Kotlin File/Class > Affirmation.kt > enter.
//  Pada Affirmation.kt diberi kode dibawah ini , yakni menambahkan val parameter bilangan bulat stringResourceId.
package com.maylinda.affirmations.model

data class Affirmation(val stringResourceId: Int){
}