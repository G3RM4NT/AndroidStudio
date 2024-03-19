package German.app.visual.germancalculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val num1 = findViewById<EditText>(R.id.txtbase)
        val num2 = findViewById<EditText>(R.id.txtaltura)
        val Btncalcular = findViewById<Button>(R.id.btncalcular)
        val Txtresultado = findViewById<TextView>(R.id.txtresultado)

        val objcalcularArea = CalcularArea()
Btncalcular.setOnClickListener {

    val result = objcalcularArea.calcular(num1.text.toString().toInt(),num2.text.toString().toInt())

    Toast.makeText(this, "Este es el resultado: $result", Toast.LENGTH_LONG).show()

    Txtresultado.text = result.toString()

}


    }



}
