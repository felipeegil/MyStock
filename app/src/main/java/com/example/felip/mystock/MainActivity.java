package com.example.felip.mystock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        criarTest();
        criarTest2();
    }

    public void criarTest(){
        String tipo = "notebook";
        int fornecedorId = 4;
        String marca = "dell";
        firebaseCRUD test = new firebaseCRUD();
        test.createProdutosTipo(tipo, fornecedorId, marca);
    }
    public void criarTest2(){
        String tipo = "noBreak";
        int fornecedorId = 4;
        String marca = "MIE";
        firebaseCRUD test = new firebaseCRUD();
        test.createProdutosTipo(tipo, fornecedorId, marca);
    }
}
