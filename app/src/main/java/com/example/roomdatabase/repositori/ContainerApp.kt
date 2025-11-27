package com.example.roomdatabase.repositori

import android.app.Application
import android.content.Context
import androidx.room.Database
import com.example.roomdatabase.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

