package devandroid.andre.appe.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import devandroid.andre.appe.R;
import devandroid.andre.appe.model.CadastroKit;
import devandroid.andre.appe.model.Jurado;

public class MainActivity extends AppCompatActivity {
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
        cadastroKit = new CadastroKit();
        jurado = new Jurado();
        String dadosKit;
        String dadosJurado;

        jurado.setNome("andré");
        jurado.setIdade("30");
        System.out.println("olá");

        cadastroKit.setFabricante("tamiya");
        cadastroKit.setModelo("F15 alguma coisa");
        cadastroKit.setEscala("1/48");
        cadastroKit.setCategoria("aviação jato 1/48");

        editFabricante = findViewById(R.id.editFabricante);
        editEscala = findViewById(R.id.editEscala);
        editModelo = findViewById(R.id.editModelo);
        editCategoria = findViewById(R.id.editCategoria);

        btnLimpar = findViewById(R.id.btnlimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);






        dadosJurado = "primeiro nome: ";
        dadosJurado += jurado.getNome();
        dadosJurado += " idade:";
        dadosJurado += jurado.getIdade();

        dadosKit = "fabricante: ";
        dadosKit += cadastroKit.getFabricante();
        dadosKit += " modelo: ";
        dadosKit += cadastroKit.getModelo();
        dadosKit += " escala: ";
        dadosKit += cadastroKit.getEscala();
        dadosKit += "categoria: ";
        dadosKit += cadastroKit.getCategoria();


        editFabricante.setText(cadastroKit.getFabricante());
        editModelo.setText(cadastroKit.getModelo());
        editEscala.setText(cadastroKit.getEscala());
        editCategoria.setText(cadastroKit.getCategoria());


        Log.i("POOAndroid","info jurados:"+jurado.toString());
        Log.i("POO android","cadastro kits: "+cadastroKit.toString());












    }
}