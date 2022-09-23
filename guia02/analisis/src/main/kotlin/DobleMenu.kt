import kotlin.system.exitProcess

class DobleMenu {

    //variables usadas en los metodos
    var op: Int = 0
    var opt: String =""
    var colon: Double = 0.0
    var dolar: Double = 0.0
    var milla: Double = 0.0
    var km: Double = 0.0
    var cel: Double = 0.0
    var far: Double = 0.0
    var base:Double=0.0
    var altura: Double=0.0
    var area: Double=0.0

    //menu principal
    fun dosMenu() {
        println("....................................................................")
        println("........... FAVOR INGRESAR UNA DE LAS SIGUIENTES OPCIONES ..........")
        println("....................................................................")
        println("a. -Conversion de colones a dolares")
        println("b. -conversion de millas a kms")
        println("c. -Conversion de Celsius a Fahrenheit")
        println("d. -menu dos")
        println("e. -salir del menu")

        opt = readLine()!!.toString()

        when (opt) {
            "a" -> {
                this.conversionColon()
            }

            "b" -> {
                this.conversionKm()
            }

            "c"-> {
                this.conversionGrado()
            }

            "d" -> {
                this.menudos()
            }



            "e" ->{
                println("*************************")
                println("Pase un feliz dia y vuelva pronto")
                println("*************************")
                    exitProcess(0)


            } else ->{
            println("Ingrese una opcion valida")
            this.dosMenu()
            }
        }
    }

//funcion para conversion de colones a dolares
    fun conversionColon() {
        println("Ingrese la cantidad de colones a convertir")
        colon = readLine()!!.toDouble()

        dolar = colon * 0.11
        println("El resultado es $$dolar")
      this.regresar()
    }
//funcion para conversion de millas a km
    fun conversionKm() {
        println("Ingrese las millas a convertir")
        milla = readLine()!!.toDouble()

        km = milla * 1.61
        println("El resultado es $km km")
       this.regresar()
    }
//funcion para crear una conversion de grados celsius a fahrenheit
    fun conversionGrado() {
        println("Ingrese los grados celsius a convertir")
        cel = readLine()!!.toDouble()

        far = (cel * 9 / 5) + 32
        println("El resultado es $far F")
        this.regresar()
    }
//funcion para la primera opcion del segundo menu la cual es de saber si es negativo o positivo
    fun posionega() {

        println("Se siente positivo o negativo maitron?")
        val res = readLine()
        if (res == "positivo") {
            println("Eso!!! no se ahueve por nada, usted puede con todo")
        } else if (res == "negativo") {
            println("Como va a creer que va a estar triste nombre tan perron y se me ahueva u.u Animos tiene que agarrar actitud")
        }
    this.regresar()
    }
//funcion para regresar al menu anterior o salirse de la app
        fun regresar() {
            println("*************************")
            println("desea regresar al menu? s/n")
            println("*************************")
            val leer = readLine()!!
            if (leer == "s") {
                this.dosMenu()
            } else {
                println("feliz dia")
                exitProcess(0)
            }
        }
//metodo para segundo menu que estaria en nuestra 4 opcion del menu principal
    fun menudos(){
        println("....................................................................")
        println("........... Submenu, ingrese una de las siguientes opciones ..........")
        println("....................................................................")
        println("1. -Positivo o negativo")
        println("2. -Area de un triangulo")
        println("3. -regresar al primer menu")
        println("4. -salir")

        op= readLine()!!.toInt()
        when (op) {
            1 -> {
                this.posionega()
                }
            2 ->{
                this.areaTriangulo()
            }
            3 ->{
                this.dosMenu()
            }

            4 ->{
                println("feliz dia y gracias por usar la app")
                exitProcess(0)
            }
            else ->{
                println("Ingrese una opcion valida")
                this.menudos()
            }

            }
        }


        fun areaTriangulo(){
            println("Ingrese la base del triangulo")
            base=readLine()!!.toDouble()

            println("Ingrese la altura del triangulo")
            altura =readLine()!!.toDouble()

            area= base * altura/2

            println("El area del triangulo es $area")

            this.regresar()
        }



    }

fun main(){
    val menu1=DobleMenu()

    menu1.dosMenu()
}
