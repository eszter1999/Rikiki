package mobweb.nagyhf.rikiki2.adaper

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mobweb.nagyhf.rikiki2.R
import mobweb.nagyhf.rikiki2.data.Player.Player

class PlayerAdapter(private val listener: PlayerClickListener) :
    RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    private val players = mutableListOf<Player>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val itemView: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.row_player_name, parent, false)
        return PlayerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val activePlayer = players[position]
        holder.nameTextView.text = activePlayer.name

        holder.item = activePlayer
    }

    override fun getItemCount() = players.size

    fun addPlayer(newPlayer: Player){
        Log.i("playerAdapter", "player added")
        players.add(newPlayer)
        notifyItemInserted(players.size - 1)
    }

    fun removePlayer(player: Player){
        players.remove(player)
        notifyDataSetChanged()
    }

    fun update(changedPlayers: List<Player>){
        players.clear()
        players.addAll(changedPlayers)
        notifyDataSetChanged()
    }

    interface PlayerClickListener{
        fun onPlayerRemoved(player: Player)
    }

    inner class PlayerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val nameTextView : TextView
        val removeButton : ImageButton

        var item: Player? = null

        init{
            nameTextView = itemView.findViewById(R.id.playerName)
            removeButton = itemView.findViewById(R.id.deletePlayer)
            removeButton.setOnClickListener {
                item?.let {listener.onPlayerRemoved(it)}
            }
        }
    }
}