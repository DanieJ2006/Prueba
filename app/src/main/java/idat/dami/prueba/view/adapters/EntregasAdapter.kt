package idat.dami.prueba.view.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import idat.dami.prueba.databinding.ItemEntregasBinding
import idat.dami.prueba.retrofit.response.ResponseEntrega

class EntregasAdapter(private var lstentregas: List<ResponseEntrega>)
    : RecyclerView.Adapter<EntregasAdapter.ViewHolder>(){

    inner class ViewHolder(val binding: ItemEntregasBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemEntregasBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(lstentregas[position]){
                binding.iventrega.drawable
                binding.tvnombresRemitente.text = paquete.remitente.nombre.toString()+" " + paquete.remitente.apellido.toString()
                binding.tvnombresConsignado.text = paquete.consignado.nombre.toString()+" " + paquete.consignado.apellido.toString()
                binding.tvdireccionConsignado.text = paquete.consignado.direccion.toString()
            }
        }

    }

    override fun getItemCount() = lstentregas.size
}