package com.sakin.datalist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountriesAdapter(
    private val countryNameList: ArrayList<String>,
    private val detailsList: ArrayList<String>,
    private val imageList: ArrayList<Int>,
    private val context: Context
) : RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>() {

    // ViewHolder Class
    inner class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewCountryName: TextView = itemView.findViewById(R.id.textViewCountryName)
        val textViewDetails: TextView = itemView.findViewById(R.id.textViewDetails)
        val imageView: CircleImageView = itemView.findViewById(R.id.imageViewFlag)
    }

    // Inflating the item layout and creating the ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_design, parent, false)
        return CountryViewHolder(view)
    }

    // Binding data to the ViewHolder
    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.textViewCountryName.text = countryNameList[position]
        holder.textViewDetails.text = detailsList[position]
        holder.imageView.setImageResource(imageList[position])
    }

    // Returning the total count of items
    override fun getItemCount(): Int {
        return countryNameList.size
    }
}
