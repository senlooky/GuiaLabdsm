import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {

println("Ingrse su fecha de nacimiento en el siguiente formato dd/mm/aaaa")
    var feNac= readLine()

    var feNacDate: Date = SimpleDateFormat("dd/mm/aaaa").parse(feNac)

    var fechaActual= Date(System.currentTimeMillis())
    var diferenciaFechasMili= fechaActual.getTime()-feNacDate.getTime()
    var segundos= diferenciaFechasMili/1000
    var minutos= segundos/60
    var horas= minutos/60
    var dias=horas/24
    var anios=dias/365

    println("La edad es de: ${anios}")
}