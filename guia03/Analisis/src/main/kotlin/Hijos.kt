class Hijos {

    val edad = IntArray(5)
    var prome: Double = 0.0
    var suma: Double = 0.0
    var mayor: Int = 0

    fun cargar() {
        for (i in 0..edad.size - 1) {
            println("Ingrese la edad de 5 personas aleatorias")
            edad[i] = readLine()!!.toInt()

            suma += edad[i]

            edad.forEach {
                if (it > mayor)
                    mayor = it

            }
        }
    }


    fun mayorEdad() {

        println("La edad mayor de las ingresadas es $mayor")

    }

    fun promedio() {


        prome = suma / edad.size
            println("El promedio de las edades es $prome")
        }
    }
