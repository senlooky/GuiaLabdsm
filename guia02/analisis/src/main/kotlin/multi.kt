fun main (){
    print("Ingrese el primer valor")
    val valor1 =readLine()!!.toInt()
    print("Ingrese el segundo valor")
    val valor2 = readLine()!!.toInt()

    //validar que el primer numero sea multiplo del segundo

    if(valor1 % valor2 ==0 )
        print("el valor $valor1 es multiplo de $valor2 y ")
    else
        print("No son multiplos y ")

    if (valor1 %2 ==0 && valor2 %2 ==0)
        print("Los valores son pares")
    else
        print("los valores son impares")

}