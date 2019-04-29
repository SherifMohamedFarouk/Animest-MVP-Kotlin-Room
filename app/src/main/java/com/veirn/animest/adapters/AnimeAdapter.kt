package com.veirn.animest.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.veirn.animest.R
import com.veirn.animest.databinding.TopItemBinding
import com.veirn.animest.model.topanime.TopAnime
import com.veirn.animest.ui.details.AnimeDetails

class AnimeAdapter(var items : ArrayList<TopAnime>, val context: FragmentActivity?) : RecyclerView.Adapter<AnimeAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     val binding: TopItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.top_item, parent, false)

        return AnimeAdapter.ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items.get(position))
    }
    fun updatelist(list:List<TopAnime>){
        items.addAll(list)
        notifyDataSetChanged()

    }
    fun clearlist(){
        items.clear()
        notifyDataSetChanged()

    }

    override fun getItemCount(): Int {
        return items.size
    }



    class ViewHolder(private val view: TopItemBinding) : RecyclerView.ViewHolder(view.root) {
        fun bind(item: TopAnime) {
            view.top = item
//            if (item.score != null) {
//                itemView.ratingbar.rating = (item.score /2.0).toFloat()
//            }

            itemView.setOnClickListener {
                itemView.context.startActivity(
                    Intent(itemView.context, AnimeDetails::class.java)
                        .putExtra("Value", item.malId));
            }
        }



    }
}