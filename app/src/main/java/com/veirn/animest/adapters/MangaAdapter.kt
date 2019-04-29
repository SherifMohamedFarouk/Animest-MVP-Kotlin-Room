package com.veirn.animest.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.veirn.animest.R
import com.veirn.animest.databinding.TopMangaBinding
import com.veirn.animest.model.topmanga.Top
import com.veirn.animest.ui.details.MangaDetails

class MangaAdapter(var items : ArrayList<Top>, val context: FragmentActivity?) : RecyclerView.Adapter<MangaAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: com.veirn.animest.databinding.TopMangaBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.top_manga, parent, false)

        return MangaAdapter.ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items.get(position))
    }
    fun updatelist(list:List<Top>){
        items.addAll(list)
        notifyDataSetChanged()

    }

    override fun getItemCount(): Int {
        return items.size
    }



    class ViewHolder(private val view: TopMangaBinding) : RecyclerView.ViewHolder(view.root) {
        fun bind(item: Top) {
            view.top = item
//            if (item.score != null)
//                itemView.ratingbar.rating = (item.score /2.0).toFloat()
//            }
            itemView.setOnClickListener {
                itemView.context.startActivity(Intent(itemView.context, MangaDetails::class.java)
                    .putExtra("Value1", item));
            }
        }

        }




}