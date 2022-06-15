package mobweb.nagyhf.rikiki2.data.game

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "game")
data class Game(
    @PrimaryKey val id: Long?,
    val players_Id: Long?,
    val round: Int,
    val bet: Int
)