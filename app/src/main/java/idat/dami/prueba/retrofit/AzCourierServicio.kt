package idat.dami.prueba.retrofit

import idat.dami.prueba.retrofit.response.ResponseConsignado
import retrofit2.Call
import retrofit2.http.GET

interface AzCourierServicio {

    @GET("listar")
    fun lsitarConsignados(): Call<List<ResponseConsignado>>


}