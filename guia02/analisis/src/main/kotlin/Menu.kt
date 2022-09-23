class Menu {
var op: Int=0
var peri: Double=0.0
    var base: Double=0.0
var val1: Double=0.0
var val2: Double=0.0
var cua: Double=0.0

    fun menu(){


        println("....................................................................")
        println("........... FAVOR INGRESAR UNA DE LAS SIGUIENTES OPCIONES ..........")
        println("....................................................................")
        println("1. -Equilatero")
        println("2. -Isoceles")
        println("3. -Escaleno")
        println("4. -salir del sistema")

        op = readLine()!!.toInt()

        when(op){

            1 ->{
                println("ingrese el valor de los lados")
                val1 = readLine()!!.toDouble()
                peri = 3 * val1
                    print(impresion())
            }
            2 ->{
                println("Ingrese el valor de los lados")
                val1 = readLine()!!.toDouble()
                println("Ingrese el valor de la base")
                base = readLine()!!.toDouble()
                peri= (2*val1) + base
                //impresion
                print(impresion())
            }
            3 ->{
                println("Ingrese el valor de un lado")
                val1 = readLine()!!.toDouble()
                println("Ingrese el valor del segundo lado")
                val2 = readLine()!!.toDouble()
                cua = Math.pow(val1,2.0) + Math.pow(val2,2.0)
                peri= val1 + val2 + Math.sqrt(cua)
                print(impresion())
            }
        }

    }

    fun impresion(){
        println("....................................................................")
        println("........... El valor del perimetro es $peri...............")
        println("....................................................................")
    }

}

fun main(){
    val co = Menu()
    co.menu()
}