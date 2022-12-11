package idat.dami.prueba.retrofit.response

data class ReponseHistorial(

    var idPaquete: Int,
    var remitente: ResponseRemitente,
    var consignado: ResponseConsignado
)
