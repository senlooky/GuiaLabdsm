class Inmutable {
    var lista1: List<Int> = List(100) {

           val valor = (Math.random() * 20).toInt()
        valor
    }
    fun contar(){
        for (i in 1..4 ){
            println()
        }
        //println(lista1)
    }
}

fun main(){
    val inmu= Inmutable()

    inmu.contar()
}
