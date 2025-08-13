package com.example.musicappui

import androidx.annotation.DrawableRes

data class Lib(
    @DrawableRes val icon: Int,
    val name:String,

)

val libraries = listOf<Lib>(
    Lib(R.drawable.baseline_music_note_24, "Playlist"),
    Lib(R.drawable.baseline_music_note_24, "Playlist"),
    Lib(R.drawable.baseline_music_note_24, "Playlist"),
    Lib(R.drawable.baseline_music_note_24, "Playlist"),
    Lib(R.drawable.baseline_music_note_24, "Playlist")

)