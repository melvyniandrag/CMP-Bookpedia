package com.plcoding.bookpedia.book.data.database

import androidx.room.RoomDatabaseConstructor

// This is kind of a hack.
// Room is going to generate the dependencies, Said at around 4:36:30 in the video.
// Hopefully this will go away because I don't see how anyone would know to do this without
// having watched this video or perhaps the room documentation.
@Suppress("NO_ACTUAL_FOR_EXPECT")
expect object BookDatabaseConstructor: RoomDatabaseConstructor<FavoriteBookDatabase> {
    override fun initialize(): FavoriteBookDatabase
}