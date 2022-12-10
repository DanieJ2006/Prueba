package idat.dami.prueba.view.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
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
                binding.tvDireccion.text = paquete.consignado.direccion.toString()
                binding.tvConsignado.text = paquete.consignado.nombre.toString()

            }
        }

    }

    override fun getItemCount() = lstentregas.size
}