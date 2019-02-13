package jorgedavid.cecyt9.mx.ipn.reservajorge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    EditText name, ape, mail, fecha, tel;

    Button btnEnviar;

    SeekBar barrita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         name = findViewById(R.id.Name);
         ape = findViewById(R.id.Apellidos);
         mail = findViewById(R.id.mail);
         fecha = findViewById(R.id.Fecha);
         tel = findViewById(R.id.Tel);

         barrita = findViewById(R.id.Barra);

         btnEnviar = findViewById(R.id.Save);



    }

    @Override
    public void onClick(View v) {

        if(name.getText().toString().equals("")){
            Toast.makeText(this, "Falta llenar el espacio de nombre", Toast.LENGTH_LONG).show();
        }else if(ape.getText().toString().equals("")){
            Toast.makeText(this, "Falta llenar el espacio de apellidos", Toast.LENGTH_LONG).show();
        }else if(mail.getText().toString().equals("")){
            Toast.makeText(this, "Falta ingresar correo electronico", Toast.LENGTH_LONG).show();
        }else if(fecha.getText().toString().equals("")){
            Toast.makeText(this, "Falta ingresar fecha", Toast.LENGTH_LONG).show();
        }else if(tel.getText().toString().equals("")){
            Toast.makeText(this, "Falta ingresar un telefono", Toast.LENGTH_LONG).show();
        }else if(barrita.getProgress() == 0){
            Toast.makeText(this, "Falta seleccionar el numero de personas", Toast.LENGTH_LONG).show();
        }else{
            Guardar(v);
        }

    }

    public void Guardar(View v){
        Intent envia = new Intent(this, Main2Activity.class);
        Bundle datitos = new Bundle();

        datitos.putString("Nombre", name.getText().toString());
        datitos.putString("Apellidos", ape.getText().toString());
        datitos.putString("Email", mail.getText().toString());
        datitos.putString("Fecha", fecha.getText().toString());
        datitos.putString("Telefono", tel.getText().toString());
        datitos.putString("Numero", String.valueOf(barrita.getProgress()));
        envia.putExtras(datitos);
        finish();
        startActivity(envia);
    }
}
