class Fecha {
    var dia: Int = 0
    var mes: String = ""
    var anio: Int = 0


    fun carga() {

        println("....................................................................")
        println("...........Ingrese cualquier fecha que desee...............")
        println("....................................................................")

        //pedir los datos
        println("Ingrese el dia")
        dia = readLine()!!.toInt()

        println("Ingrese el mes")
        mes = readLine()!!.toString()

        println("Ingrese el año")
        anio = readLine()!!.toInt()

    }



    fun impresion() {
        if (mes == "enero") {
            println("...........la Fecha es $dia, 01, $anio...............")
        } else if (mes == "febrero") {
            println("...........la Fecha es $dia, 02, $anio...............")
        } else if (mes == "marzo") {
            println("...........la Fecha es $dia, 03, $anio...............")
        } else if (mes == "abril") {
            println("...........la Fecha es $dia, 04, $anio...............")
        } else if (mes == "mayo") {
            println("...........la Fecha es $dia, 05, $anio...............")
        } else if (mes == "junio") {
            println("...........la Fecha es $dia, 06, $anio...............")
        } else if (mes == "julio") {
            println("...........la Fecha es $dia, 07, $anio...............")
        } else if (mes == "agosto") {
            println("...........la Fecha es $dia, 08, $anio...............")
        } else if (mes == "septiembre") {
            println("...........la Fecha es $dia, 09, $anio...............")
        } else if (mes == "octubre") {
            println("...........la Fecha es $dia, 10, $anio...............")
        } else if (mes == "noviembre") {
            println("...........la Fecha es $dia, 11, $anio...............")
        } else if (mes == "diciembre") {
            println("...........la Fecha es $dia, 12, $anio...............")
        } else {
            println("Ingrese un mes valido")
        }

    }
}

fun main(){
    val fecha1=Fecha()

    fecha1.carga()

    fecha1.impresion()
}