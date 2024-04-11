package devandroid.andre.appe.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.andre.appe.model.CadastroKit;

public class CadastroKitController {

   public void salvar (CadastroKit cadastroKit){
       Log.i("MVC_Controller","salvo"+ cadastroKit.toString());


   }


    @NonNull
    @Override
    public String toString() {


        Log.i("MVC_Controller","controller iniciada");

        return super.toString();
    }
}
