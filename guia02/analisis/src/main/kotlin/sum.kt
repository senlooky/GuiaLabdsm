fun main(){
    println("Ingrese el primer valor")
    val va1 = readLine()!!.toInt()
    println("Ingrese el segundo valor")
    val va2 = readLine()!!.toInt()
    println("Ingrese el tercer valor")
    val va3 = readLine()!!.toInt()

    if (va1 + va2 == va3)
        println("La suma de $va1 y $va2 es igual a $va3")
    else
        print("la suma de $va1 y $va2 es diferente a $va3" )
}