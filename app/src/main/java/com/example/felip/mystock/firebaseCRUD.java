package com.example.felip.mystock;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class firebaseCRUD {
    //Referenciamento ao Firebase, para exibição de produtos ou fornecedores, dependendo da escolha do usuario
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRefProdutos = database.getReference("produtos");
    DatabaseReference myRefFornecedores = database.getReference("fornecedores");

    public void createProdutosTipo(String tipo, int fornercedorId, String marca){
        myRefProdutos = database.getReference("produtos/"+ tipo);
        String dataReference = ("produtos/"+ tipo);
        myRefProdutos.setValue(tipo);
        createProdutosId(dataReference, fornercedorId);
        createProdutosMarca(dataReference, marca);
    }

    public void createProdutosId(String data, int fornecedorId){
        myRefProdutos = database.getReference(data + "/fornercedorId");
        myRefProdutos.setValue(fornecedorId);
    }

    public void createProdutosMarca(String data, String marca){
        myRefProdutos = database.getReference(data + "/marca");
        myRefProdutos.setValue(marca);
    }

    public DatabaseReference getMyRefProdutos() {
        return myRefProdutos;
    }

    public void updateProdutos(String tipo, int fornecedorId, String marca){

    }

    public void deleteProdutos(String tipo, int fornecedorId, String marca){

    }

    public void createFornecedores(String nome, String cidade, int fornecedorId, String sexo, int telefone){

    }

    public DatabaseReference getMyRefFornecedores() {
        return myRefFornecedores;
    }

    public void updateFornecedores(String nome, String cidade, int fornecedorId, String sexo, int telefone){

    }

    public void deleteFornecedores(String nome, String cidade, int fornecedorId, String sexo, int telefone){

    }
}
