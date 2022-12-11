package idat.dami.prueba.repository

import androidx.lifecycle.MutableLiveData
import idat.dami.prueba.retrofit.AzCourierCliente
import idat.dami.prueba.retrofit.response.ReponseHistorial
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HistorialRepository {

    var responseEntrega = MutableLiveData<List<ReponseHistorial>>()

    fun listarHistorial(): MutableLiveData<List<ReponseHistorial>> {
        val call: Call<List<ReponseHistorial>> =
            AzCourierCliente.retrofitSErvice.listarHistorial()
        call.enqueue(object : Callback<List<ReponseHistorial>> {
            override fun onResponse(
                call: Call<List<ReponseHistorial>>,
                response: Response<List<ReponseHistorial>>
            ) {
                responseEntrega.value = response.body()
            }

            override fun onFailure(call: Call<List<ReponseHistorial>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
        return responseEntrega
    }
}