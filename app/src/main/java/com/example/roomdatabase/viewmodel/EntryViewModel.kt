package com.example.roomdatabase.viewmodel

import com.example.roomdatabase.room.Siswa

data class DetailSiwa(
    val id: Int = 0,
    val nama: String ="",
    val alamat: String= "",
    val telpon: String = ""
)

fun DetailSiwa.toSiswa(): Siswa = Siswa(
    id = id,
    nama = nama,
    alamat = alamat,
    telpon = telpon
)