package devandroid.andre.appe.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import devandroid.andre.appe.R;
import devandroid.andre.appe.controller.CadastroCategoriaController;
import devandroid.andre.appe.controller.CadastroKitController;
import devandroid.andre.appe.model.CadastroKit;
import devandroid.andre.appe.model.Jurado;

public class MainActivity extends AppCompatActivity {

    CadastroCategoriaController cadastroCategoriaController;
    List<String> nomeDasCategorias;

    CadastroKitController cadastroController;
    CadastroKit cadastroKit;
    Jurado jurado;
    Spinner spinner;
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
        setContentView(R.layout.activity_spinner);



        cadastroController = new CadastroKitController(MainActivity.this);
        cadastroKit = new CadastroKit();

        cadastroCategoriaController = new CadastroCategoriaController();
        nomeDasCategorias = cadastroCategoriaController.dadosParaSpinner();







        editFabricante = findViewById(R.id.editFabricante);
        editEscala = findViewById(R.id.editEscala);
        editModelo = findViewById(R.id.editModelo);
        editCategoria = findViewById(R.id.editCategoria);
        spinner = findViewById(R.id.spinner);


        btnLimpar = findViewById(R.id.btnlimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);


        editFabricante.setText(cadastroKit.getFabricante());
        editModelo.setText(cadastroKit.getModelo());
        editEscala.setText(cadastroKit.getEscala());
        editCategoria.setText(cadastroKit.getCategoria());

        cadastroController.buscar(cadastroKit);

        //adapter
        //layout
        //injetar o adapter ao Spinner  - a lista sera gerada

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                cadastroCategoriaController.dadosParaSpinner());
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spinner.setAdapter(adapter);





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