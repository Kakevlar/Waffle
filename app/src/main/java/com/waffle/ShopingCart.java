package com.waffle;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.security.Key;
import java.util.ArrayList;

public class ShopingCart extends AppCompatActivity {

    ListView listView;
    ArrayList<Info> arrayList;
    CustomAdapter myadapter;
    String flag="0" ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoping_cart);
        listView =(ListView)findViewById(R.id.listView);
        Toast.makeText(ShopingCart.this,"item created",Toast.LENGTH_LONG).show();
        arrayList = new ArrayList<Info>();
     //   String num = getIntent().getStringExtra("code");
     //   String title = getIntent().getStringExtra("title");
      //  String image = getIntent().getStringExtra("image");
     //   String Desc;
      //  int ImageToSet = 0;
      //  ImageToSet = BuildImage(image);
      //  Desc = BuildDescri(num);
      //  arrayList.add(new Info(ImageToSet,title.toString(),Desc));
        myadapter = new CustomAdapter(this, R.layout.row_shopingcart, arrayList);
        listView.setAdapter(myadapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                id = position;
                String title = arrayList.get(position).getTitle();
                String desc = arrayList.get(position).getDesc();
                Intent go = new Intent (ShopingCart.this,CustomOrder.class);
                go.putExtra("id" ,id);
                go.putExtra("title", title);
                go.putExtra("desc",desc);
                startActivity(go);
            }

        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                arrayList.remove(position);
                myadapter.notifyDataSetChanged();
                Toast.makeText(ShopingCart.this,"item erased",Toast.LENGTH_LONG).show();
                return false;
            }
        });

    }

    private int BuildImage(String num) {
        int img=0;
        if(num.equals("1")){
            img=R.drawable.waffleclassic;
        }
        if(num.equals("2")){
            img=R.drawable.wafflecookies;
        }
        if(num.equals("3")){
            img=R.drawable.waffleau;
        }
        if(num.equals("4")){
            img=R.drawable.wafflegobananas;
        }
        if(num.equals("5")){
            img=R.drawable.wafflemarshmellow;
        }
        return img;
    }

    public void AddItem (View view){
        Intent add = new Intent (ShopingCart.this,Wafflemeister.class);
        add.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(add);
        }

    @Override
    protected void onResume() {
        //3
        super.onResume();

        Toast.makeText(ShopingCart.this, "restarteame este",Toast.LENGTH_LONG).show();
        String num = getIntent().getStringExtra("code");
        String title = getIntent().getStringExtra("title");
        String image = getIntent().getStringExtra("image");
        String Desc;
        int ImageToSet = 0;
        ImageToSet = BuildImage(image);
        Desc = BuildDescri(num);
        arrayList.add(new Info(ImageToSet, title.toString(), Desc));
        listView.setAdapter(myadapter);
        myadapter.notifyDataSetChanged();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private String BuildDescri(String code){
            String Desc = null;
            Desc = code.replace(",","-"+"\n");
            return Desc;
        }

}

