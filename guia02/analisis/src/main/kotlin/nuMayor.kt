fun main() {
    println("Ingrese el primer valor")
    val va1 = readLine()!!.toInt()
    println("Ingrese el segundo valor")
    val va2 = readLine()!!.toInt()
    println("Ingrese el tercer valor")
    val va3 = readLine()!!.toInt()

    //valorar cual de los 3 numeros es el mayor
    if (va1 > va2 && va1 > va3)
        println("el mayor valor es $va1 y ")
    else
        if (va2 > va3)
            print("el valor mayor es $va2 y ")
        else
            print("el valor mayor es $va3 y ")

    //valor cual de los 3 numeros es el menor
    if (va1 < va2 && va1 < va3)
        print("el valor menor es $va1")
    else
        if(va2 < va3)
            print("el valor menor es $va2")
    else
        print("el valor menor es $va3")
}