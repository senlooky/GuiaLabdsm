import kotlin.system.exitProcess

class Masa {
var op: Int=0
var kg: Double=0.0
var lb: Double=0.0
var oz: Double=0.0
var ton: Double=0.0

    fun menuMasa() {


        println(".......................................................................................................")
        println("...........ingrese una de las siguientes opciones para la medida de masa que desea convertir ..........")
        println(".......................................................................................................")
        println("1. -kg a libras")
        println("2. -kg a onzas")
        println("3. -kg a toneladas")
        println("4. -salir")

        op = readLine()!!.toInt()
        when (op) {
            1 -> {
                this.conversionLibra()
            }

            2 -> {
                this.conversionOnza()
            }

            3 -> {
                this.conversionTon()
            }

            4 -> {
                println("feliz dia y gracias por usar la app")
                exitProcess(0)
            }

            else -> {
                println("Ingrese una opcion valida")
                this.menuMasa()
            }

        }
    }
    //metodo para conversion de kg a libras
    fun conversionLibra(){
        println("Ingrese los kg a convertir")
        kg= readLine()!!.toDouble()

        lb= kg * 2.2

        println("el resultado de la conversion es $lb")

        this.regresar()
    }

    //metodo para conversion de kg a onzas
    fun conversionOnza(){

        println("Ingrese los kg a convertir")
        kg= readLine()!!.toDouble()

        oz= kg * 35.27

        println("el resultado de la conversion es $oz")

        this.regresar()
    }

    fun conversionTon(){
        println("Ingrese los kg a convertir")
        kg= readLine()!!.toDouble()

        ton= kg/1000

        println("el resultado de la conversion es $ton")

        this.regresar()
    }

    fun regresar() {
        println("*************************")
        println("desea regresar al menu? s/n")
        println("*************************")
        val leer = readLine()!!
        if (leer == "s") {
            this.menuMasa()
        } else {
            println("Pase un feliz dia")
            exitProcess(0)
        }
    }
}

fun main(){
    val masa= Masa()

    masa.menuMasa()
}