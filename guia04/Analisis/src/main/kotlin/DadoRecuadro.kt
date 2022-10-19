class DadoRecuadro: Dado() {
    override fun imprimir() {
        println(".............")
        println("*$valor*")
        println(".............")
    }
    fun imprimirAs(){
        println("Resultado con asterisco")
        if(valor == 1){
            println("*")
        }else if(valor == 2){
            println("**")
        }else if(valor == 3){
            println("***")
        }else if(valor == 4){
            println("****")
        }else if(valor == 5){
            println("*****")
        }else if(valor == 6){
            println("******")
        }
    }

    fun imprifor(){
        for (i in 1..6){
            if(valor ===i){
                println("***")
                valor++
            }
        }
    }
}