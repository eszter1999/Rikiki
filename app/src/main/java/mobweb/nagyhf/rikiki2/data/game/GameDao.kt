package mobweb.nagyhf.rikiki2.data.game

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GameDao{
    @Insert
    fun insertRow(players_round: Game)

    @Query ("SELECT * FROM game WHERE round = :r")
    fun getRound(r :Int) : List<Game>
}