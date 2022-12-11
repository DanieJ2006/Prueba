package idat.dami.prueba.retrofit

import idat.dami.prueba.retrofit.response.ResponseConsignado
import idat.dami.prueba.retrofit.response.ResponseEntrega
import idat.dami.prueba.retrofit.response.ResponseRemitente
import retrofit2.Call
import retrofit2.http.GET

interface AzCourierServicio {

    @GET("consignado/listar")
    fun lsitarConsignados(): Call<List<ResponseConsignado>>

    @GET("entrega/listar")
    fun listarEntregas(): Call<List<ResponseEntrega>>

    @GET("remitente/listar")
    fun listarRemitentes(): Call<List<ResponseRemitente>>

    @GET("entrega/historial/")
    fun listarHistorial(): Call<List<ResponseEntrega>>

}