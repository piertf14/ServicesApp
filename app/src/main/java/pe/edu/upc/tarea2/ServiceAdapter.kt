package pe.edu.upc.tarea2

import android.content.ClipData
import android.content.Intent
import android.support.v4.content.ContextCompat
import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.view.LayoutInflater
import android.widget.Toast


class ServiceViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val text_title = view.findViewById<TextView>(R.id.text_service_title)
    val cover_service = view.findViewById<ImageView>(R.id.image_service_cover)

    fun bind(service: Service) {
        text_title.text = service.name
        cover_service.setImageDrawable(ContextCompat.getDrawable(itemView.context, service.image))

        itemView.setOnClickListener{
            val intent = Intent(it.context, ServiceDetailActivity::class.java)
            intent.putExtra(ServiceDetailActivity.Service, service)
            it.context.startActivity(intent)
        }
    }
}


class ServiceAdapter(val list: List<Service>) : RecyclerView.Adapter<ServiceViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServiceViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_service, parent, false)

        return ServiceViewHolder(itemView)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ServiceViewHolder, position: Int) {
        holder.bind(list.get(position))
    }
}