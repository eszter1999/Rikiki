package mobweb.nagyhf.rikiki2.adaper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mobweb.nagyhf.rikiki2.R
import mobweb.nagyhf.rikiki2.adaper.CardsAdapter.CardsViewHolder
import mobweb.nagyhf.rikiki2.data.PlayerForCard

class CardsAdapter (private val listener: CardsClickListener) :
    RecyclerView.Adapter<CardsViewHolder>(){

    private var players = mutableListOf<PlayerForCard>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardsViewHolder {
        val itemView: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.row_player_cards, parent, false)
        return CardsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CardsViewHolder, position: Int) {
        val activePlayer = players[position]
        holder.nameTV.text = activePlayer.name
        holder.bCard.text = activePlayer.card.toString()

        holder.item = activePlayer
    }

    override fun getItemCount() = players.size

    fun update(listOfPlayerForCard: List<PlayerForCard>) {
        players.clear()
        players.addAll(listOfPlayerForCard)
        notifyDataSetChanged()
    }

    inner class CardsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTV : TextView
        val bCard : Button

        var item :PlayerForCard? = null
        init {
            nameTV = itemView.findViewById(R.id.tv_player_name)
            bCard = itemView.findViewById(R.id.buttonCard)
            bCard.setOnClickListener {
                item?.let {listener.cardButtonPushed(it) }
            }
        }
    }

    interface CardsClickListener{
        fun cardButtonPushed(player: PlayerForCard)
    }
}
