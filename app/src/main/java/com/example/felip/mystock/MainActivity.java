package com.example.felip.mystock;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.felip.mystock.adapter.PagerAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    Button btnSave;
    EditText edtName;
    DatabaseReference databaseReference;
    ListView listViewProdutos;
    List<Produto> produtoList;
    public static String produtoId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 2);
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
//        produtoList = new ArrayList<Produto>();
//        databaseReference = FirebaseDatabase.getInstance().getReference("produtos");
//
//        edtName = (EditText) findViewById(R.id.edtName);
//        btnSave = (Button) findViewById(R.id.btnSave);
//        listViewProdutos = (ListView) findViewById(R.id.listViewProdutos);
//        btnSave.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                String name = edtName.getText().toString();
//
//                if (TextUtils.isEmpty((produtoId))) {
//                    //save
//                    String produtoId = databaseReference.push().getKey();
//                    Produto produto = new Produto(produtoId, name);
//                    databaseReference.child(produtoId).setValue(produto);
//
//                    Toast.makeText(MainActivity.this, "Produto Criado com Sucesso", Toast.LENGTH_SHORT).show();
//                } else {
//                    //update
//                    databaseReference.child(produtoId).child("name").setValue(name);
//
//                    Toast.makeText(MainActivity.this, "Produto Atualizado com Sucesso", Toast.LENGTH_SHORT).show();
//                }
//
//                edtName.setText(null);
//            }
//        });
    }


    @Override
    protected void onStart(){
        super.onStart();

//        databaseReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                produtoList.clear();
//
//                for(DataSnapshot postSnapshot: dataSnapshot.getChildren()){
//                    Produto produto = postSnapshot.getValue(Produto.class);
//                    produtoList.add(produto);
//                }
//
//                ProdutosAdapter produtoAdapter = new ProdutosAdapter(MainActivity.this, produtoList, databaseReference, edtName);
//                listViewProdutos.setAdapter(produtoAdapter);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
    }

}
