package devandroid.andre.appe.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.andre.appe.R;
import devandroid.andre.appe.controller.CadastroKitController;
import devandroid.andre.appe.model.CadastroKit;
import devandroid.andre.appe.model.Jurado;

public class MainActivity extends AppCompatActivity {



    CadastroKitController cadastroController;
    CadastroKit cadastroKit;
    Jurado jurado;

    EditText editFabricante;
    EditText editEscala;
    EditText editModelo;
    EditText editCategoria;
    Button btnSalvar;
    Button btnLimpar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        cadastroController = new CadastroKitController(MainActivity.this);
        cadastroKit = new CadastroKit();






        editFabricante = findViewById(R.id.editFabricante);
        editEscala = findViewById(R.id.editEscala);
        editModelo = findViewById(R.id.editModelo);
        editCategoria = findViewById(R.id.editCategoria);

        btnLimpar = findViewById(R.id.btnlimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);


        editFabricante.setText(cadastroKit.getFabricante());
        editModelo.setText(cadastroKit.getModelo());
        editEscala.setText(cadastroKit.getEscala());
        editCategoria.setText(cadastroKit.getCategoria());




        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editFabricante.setText("");
                editModelo.setText("");
                editEscala.setText("");
                editCategoria.setText("");

                cadastroController.limpar();
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "OBRIGADO", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastroKit.setFabricante(editFabricante.getText().toString());
                cadastroKit.setModelo(editModelo.getText().toString());
                cadastroKit.setEscala(editEscala.getText().toString());
                cadastroKit.setCategoria(editCategoria.getText().toString());
                Toast.makeText(MainActivity.this, "salto" + cadastroKit.toString(), Toast.LENGTH_LONG).show();

                cadastroController.salvar(cadastroKit);

            }
        });


        Log.i("POO android", "cadastro kits: " + cadastroKit.toString());


    }
}