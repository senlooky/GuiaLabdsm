class Punto(var x: Int, var y: Int) {


    fun inicializar(){
        println("Ingrese coordenada x: ")
        x= readLine()!!.toInt()

        println("Ingrese coordenada y: ")
        y= readLine()!!.toInt()
    }

    fun verificarCuadrante(){
        if(x >0 && y >0){
            println("Se encuentra en el primer cuadrante")
        }
        else if(x < 0 && y > 0){
            println("Se encuentra en el segundo cuadrante")
        }
        else if(x < 0 && y < 0){
            println("Se encuentra en el tercer cuadrante")
        }
        else if(x > 0 && y < 0){
            println("Se encuentra en el cuarto cuadrante")
        }
        else{
            println("Se encuentra en un eje")
        }
    }
}