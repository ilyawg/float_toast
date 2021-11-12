package com.kalmar.floattoast

import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(city: City) {
        val cityTextView: TextView = itemView.findViewById(R.id.city_text_view)
        cityTextView.text = city.name

        val stateTextView: TextView = itemView.findViewById(R.id.state_text_view)
        stateTextView.text = "state: ${city.state}"


        val toastButton:Button=itemView.findViewById(R.id.toast_button)
        toastButton.setOnClickListener{
//            val toast = Toast.makeText(itemView.context, city.population.toString(), Toast.LENGTH_SHORT)

            val toastView: View = LayoutInflater.from(itemView.context).inflate(R.layout.custom_toast,null)
            val toastTextView: TextView = toastView.findViewById(R.id.toast_text)
            toastTextView.text = city.population.toString()
            val toast = Toast(itemView.context)
            toast.view = toastView

            val location :IntArray=IntArray(2)
            toastButton.getLocationInWindow(location)
            val location1 = IntArray(2)
//           Log.d("DEBUG_MSG", location[1].toString())
            toast.setGravity(Gravity.TOP,0,location[1]-135)
            toast.show()
        }
    }
}