package devandroid.andre.appe.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.andre.appe.R;
import devandroid.andre.appe.model.CadastroKit;
import devandroid.andre.appe.model.Jurado;

public class MainActivity extends AppCompatActivity {
    CadastroKit cadastroKit;
    Jurado jurado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cadastroKit = new CadastroKit();
        jurado = new Jurado("andre","30");
        System.out.println("olá");
        System.out.println("jurado:"+ jurado.getNome());








    }
}