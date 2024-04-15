package devandroid.andre.appe.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.andre.appe.model.CadastroKit;
import devandroid.andre.appe.view.MainActivity;

public class CadastroKitController {
    SharedPreferences preferences;
    SharedPreferences.Editor listaKit;
    public final static String APPE_PREFERENCE = "pref_appe";

    public CadastroKitController(MainActivity mainActivity){
        preferences = mainActivity.getSharedPreferences(APPE_PREFERENCE,0);
        listaKit = preferences.edit();


    }


   public void salvar (CadastroKit cadastroKit){
       Log.i("MVC_Controller","salvo"+ cadastroKit.toString());
       listaKit.putString("fabricante:",cadastroKit.getFabricante());
       listaKit.putString("modelo:", cadastroKit.getModelo());
       listaKit.putString("escala:", cadastroKit.getEscala());
       listaKit.putString("categoria:", cadastroKit.getCategoria());
       listaKit.apply();

   }
    public void limpar (){
        listaKit.clear();
        listaKit.apply();

    }

    public CadastroKit buscar(CadastroKit cadastroKit){
        cadastroKit.setCategoria(preferences.getString("categoria",""));
        cadastroKit.setFabricante(preferences.getString("fabricante",""));
        cadastroKit.setModelo(preferences.getString("modelo",""));
        cadastroKit.setEscala(preferences.getString("escala",""));
        return cadastroKit;
    }

    @NonNull
    @Override
    public String toString() {


        Log.i("MVC_Controller","controller iniciada");

        return super.toString();
    }
}
