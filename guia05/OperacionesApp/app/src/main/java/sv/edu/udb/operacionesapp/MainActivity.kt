package sv.edu.udb.operacionesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Que pedo mi rony", Toast.LENGTH_LONG).show()


        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val tv1=findViewById<TextView>(R.id.tv1)
        val bSumar=findViewById<Button>(R.id.bSumar)
        val bRestar=findViewById<Button>(R.id.bRestar)
        val bMultiplicar=findViewById<Button>(R.id.bMultiplicar)
        val bDividir=findViewById<Button>(R.id.bDividir)

        bSumar.setOnClickListener {
        val et1=findViewById<EditText>(R.id.et1)
        val nro1=et1.text.toString().toInt()
        val nro2=et2.text.toString().toInt()
        val suma=nro1 + nro2
        tv1.text ="Resultado: ${suma.toString()}"
        }

        bRestar.setOnClickListener{
            val et1=findViewById<EditText>(R.id.et1)
            val nro1=et1.text.toString().toInt()
            val nro2=et2.text.toString().toInt()
            val resta=nro1 - nro2
            tv1.text ="Resultado: ${resta.toString()}"
        }

        bMultiplicar.setOnClickListener {
            val et1=findViewById<EditText>(R.id.et1)
            val nro1=et1.text.toString().toInt()
            val nro2=et2.text.toString().toInt()
            val multi=nro1 * nro2
            tv1.text ="Resultado: ${multi.toString()}"
        }
        bDividir.setOnClickListener {
            val et1=findViewById<EditText>(R.id.et1)
            val nro1=et1.text.toString().toInt()
            val nro2=et2.text.toString().toInt()
            val divi=nro1 / nro2
            tv1.text ="Resultado: ${divi.toString()}"
        }
    }
}