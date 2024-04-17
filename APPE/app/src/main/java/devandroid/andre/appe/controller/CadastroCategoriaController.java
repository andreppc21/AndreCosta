package devandroid.andre.appe.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.andre.appe.model.Categoria;

public class CadastroCategoriaController {


    public List listCategorias;

    public List getListaDeCategorias(){
        listCategorias = new ArrayList<Categoria>();

        listCategorias.add(new Categoria());
        listCategorias.add(new Categoria());
        listCategorias.add(new Categoria());
        listCategorias.add(new Categoria());
        listCategorias.add(new Categoria());
        listCategorias.add(new Categoria());
        listCategorias.add(new Categoria());
        listCategorias.add(new Categoria());
        listCategorias.add(new Categoria());
        listCategorias.add(new Categoria());

        return listCategorias;

    }









}
