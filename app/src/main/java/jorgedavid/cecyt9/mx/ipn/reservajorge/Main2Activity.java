package jorgedavid.cecyt9.mx.ipn.reservajorge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    TextView nom,ape,email,fecha,num,tel;

    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nom = findViewById(R.id.nom2);
        ape = findViewById(R.id.ape2);
        email = findViewById(R.id.email2);
        fecha = findViewById(R.id.fecha2);
        num = findViewById(R.id.numpersonas);
        tel = findViewById(R.id.telefono2);

        Bundle bundlito = new Bundle();
        bundlito = this.getIntent().getExtras();


        String uno = "Nombre: " + bundlito.getString("Nombre");
        String dos = "Apellidos: " + bundlito.getString("Apellidos");
        String tres = "E-mail: " + bundlito.getString("Email");
        String cuatro = "Fecha: " + bundlito.getString("Fecha");
        String cinco = "Numero de personas: " + bundlito.getString("Numero");
        String seis = "Telefono: " + bundlito.getString("Telefono");

        nom.setText(uno);
        ape.setText(dos);
        email.setText(tres);
        fecha.setText(cuatro);
        num.setText(cinco);
        tel.setText(seis);
    }

    @Override
    public void onClick(View v) {

        Intent envia = new Intent(this, Main3Activity.class);
        finish();
        startActivity(envia);

    }
}
