package mx.itson.edu.examenu1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonCel: Button = findViewById(R.id.buttonCel)
        val botonFar: Button = findViewById(R.id.buttonFar)
        val botonKelvin: Button = findViewById(R.id.buttonKelvin)
        val botonLimpiar: Button = findViewById(R.id.buttonLimpiar)
        val txtCel: EditText = findViewById(R.id.editTextTextCel)
        val txtFar: EditText = findViewById(R.id.editTextFar)
        val txtKelvin: EditText = findViewById(R.id.editTextKelvin)

        botonCel.setOnClickListener{
            if(!txtFar.text.toString().isEmpty()){
                var valorFar= txtFar.text.toString().toFloat()
                var calculo= (valorFar-32)/1.8
                txtCel.setText(calculo.toString())
            }else if(!txtKelvin.text.toString().isEmpty()){
                var valorKel= txtKelvin.text.toString().toFloat()
                var calculo= valorKel-273.15
                txtCel.setText(calculo.toString())
            }else{

            }
        }

        botonFar.setOnClickListener{
            if(!txtCel.text.toString().isEmpty()){
                var valorCel= txtCel.text.toString().toFloat()
                var calculo= (valorCel*1.8)+32
                txtFar.setText(calculo.toString())
            }else if(!txtKelvin.text.toString().isEmpty()){
                var valorKel= txtKelvin.text.toString().toFloat()
                var calculo= ((9*(valorKel-273.15))/5)+32
                txtFar.setText(calculo.toString())
            }else{

            }
        }

        botonKelvin.setOnClickListener{
            if(!txtCel.text.toString().isEmpty()){
                var valorCel= txtCel.text.toString().toFloat()
                var calculo= valorCel+273.15
                txtKelvin.setText(calculo.toString())
            }else if(!txtFar.text.toString().isEmpty()){
                var valorFar= txtFar.text.toString().toFloat()
                var calculo= ((5*(valorFar-32))/9)+273.15
                txtKelvin.setText(calculo.toString())
            }else{

            }
        }

        botonLimpiar.setOnClickListener{
            txtFar.setText("")
            txtCel.setText("")
            txtKelvin.setText("")
        }

    }
}