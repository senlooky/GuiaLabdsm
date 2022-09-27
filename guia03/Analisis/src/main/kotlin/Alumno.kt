class Alumno {

var nombre: String = ""
var nota: Double = 0.0

    fun inicializar(){
        println("Ingrese el nombre del alumno")
        nombre= readLine()!!.toString()

        println("Ingrese la nota de $nombre")
        nota= readLine()!!.toDouble()
    }

    fun imprimir() {
        if (nota >= 4) {
            println("El alumno $nombre es regular debido a su nota $nota")
        }else{
            println("Gracias por ingresar los datos")
        }
    }
}