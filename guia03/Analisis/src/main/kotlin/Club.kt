class Club {

    val socio1= Socio("pepe Guardiola",1989)
    val socio2= Socio("martin janchito",2005)
    val socio3= Socio("carlos Bonaparte",2020)


    fun imprimir() {
        if (socio1.antiguedad < socio2.antiguedad && socio1.antiguedad < socio3.antiguedad) {
            println("El socio mas antiguo es ${socio1.nombre}")
        }else if(socio2.antiguedad<socio3.antiguedad){
            println("EL socio mas antiguo es ${socio2.nombre}")
        }else {
            println("El socio mas antiguo es ${socio3.nombre}")
        }
    }
}