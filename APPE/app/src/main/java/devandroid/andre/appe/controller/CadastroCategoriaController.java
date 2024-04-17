package devandroid.andre.appe.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.andre.appe.model.Categoria;

public class CadastroCategoriaController {


    private List listCategorias;

    public List getListaDeCategorias(){
        listCategorias = new ArrayList<Categoria>();

        listCategorias.add(new Categoria("aviação"));
        listCategorias.add(new Categoria("carros"));
        listCategorias.add(new Categoria("militaria"));
        listCategorias.add(new Categoria("naval"));
        listCategorias.add(new Categoria("barcos"));


        return listCategorias;

    }


    public ArrayList<String> dadosParaSpinner(){

        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaDeCategorias().size() ; i++) {

            Categoria objeto = (Categoria) getListaDeCategorias().get(i);
            dados.add(objeto.getCategoriaDesejada());

        }

        return dados;

    }








}
