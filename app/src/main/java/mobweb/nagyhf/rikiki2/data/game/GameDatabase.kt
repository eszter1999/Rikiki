package mobweb.nagyhf.rikiki2.data.game

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Game::class], version = 2)
abstract class GameDatabase : RoomDatabase() {
    abstract fun gameDao(): GameDao
}