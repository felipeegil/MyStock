package com.example.felip.mystock;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

import java.util.List;

public class ProdutosAdapter extends BaseAdapter {
    private Context context;
    private List<Produto> produtoList;
    DatabaseReference databaseReference;
    EditText editName;


    public ProdutosAdapter(@NonNull Context context, List<Produto> produtoList, DatabaseReference databaseReference, EditText editName) {
        this.context = context;
        this.produtoList = produtoList;
        this.databaseReference = databaseReference;
        this.editName = editName;
    }

    @Override
    public int getCount() {
        return produtoList.size();
    }

    @Override
    public Object getItem(int i) {
        return produtoList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public View getView(int pos, View view, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View ListViewItem = inflater.inflate(R.layout.layout_product_list, null, true);

        TextView textName = (TextView) ListViewItem.findViewById(R.id.textName);
        Button btnUpdate = (Button) ListViewItem.findViewById(R.id.btnUpdate);
        Button btnDelete = (Button) ListViewItem.findViewById(R.id.btnDelete);

        final Produto produto = produtoList.get(pos);
        textName.setText(produto.getName());

        btnDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                databaseReference.child(produto.getProductId()).removeValue();
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
//                editName.setText(produto.getName());
                MainActivity.produtoId = produto.getProductId();
            }
        });

        return ListViewItem;
    }
}