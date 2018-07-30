package com.waffle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class CustomOrder extends AppCompatActivity {

    String num;
    CheckBox marsh,sprink,nutella,nut,oreo,banana,exmarsh,exsprink;
    TextView textmarsh,textsprink,textnutel,textnuts,textoreo,textbanana;
    ImageView pic;
    TextView title;
    RadioButton milkrb,darkrb,whiterb;
    Button milkb,darkb,whiteb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_custom_order);
        marsh=(CheckBox)findViewById(R.id.checkmarsh);
        sprink=(CheckBox)findViewById(R.id.checkspri);
        nutella=(CheckBox)findViewById(R.id.checknut);
        banana=(CheckBox)findViewById(R.id.checkban);
        nut=(CheckBox)findViewById(R.id.checknuts);
        oreo=(CheckBox)findViewById(R.id.checkoreo);
        exmarsh=(CheckBox)findViewById(R.id.checkmarshex);
        exsprink=(CheckBox)findViewById(R.id.checksprinkex);
        pic = (ImageView)findViewById(R.id.imageinitial);
        title = (TextView)findViewById(R.id.textInitial);
        milkrb = (RadioButton)findViewById(R.id.checkmilk);
        darkrb = (RadioButton)findViewById(R.id.checkdark);
        whiterb = (RadioButton)findViewById(R.id.checkwhite);
        milkb = (Button)findViewById(R.id.buttonmilk);
        darkb = (Button)findViewById(R.id.buttondark);
        whiteb = (Button)findViewById(R.id.buttonwhite);
        num = getIntent().getStringExtra("waffletag");
        Hide();
        if (num.equals(null)){
            num="1000";
        }
        switch(num){
            case "1":
                pic.setImageResource(R.drawable.waffleclassic);
                title.setText("Classic Waffle");
                milkrb.setChecked(true);
                break;
            case "2":
                pic.setImageResource(R.drawable.wafflecookies);
                oreo.setVisibility(View.VISIBLE);
                textoreo.setVisibility(View.VISIBLE);
                title.setText("Cookies and Cream Waffle");
                milkrb.setChecked(true);
                break;
            case "3":
                pic.setImageResource(R.drawable.waffleau);
                title.setText("Waffle AU chocolate");
                milkrb.setChecked(true);
                break;
            case "4":
                pic.setImageResource(R.drawable.wafflegobananas);
                textbanana.setVisibility(View.VISIBLE);
                banana.setVisibility(View.VISIBLE);
                textnuts.setVisibility(View.VISIBLE);
                nut.setVisibility(View.VISIBLE);
                milkrb.setChecked(true);
                title.setText("Go Bananas Waffle");
                break;
            case "5":
                pic.setImageResource(R.drawable.wafflemarshmellow);
                textmarsh.setVisibility(View.VISIBLE);
                marsh.setVisibility(View.VISIBLE);
                sprink.setVisibility(View.VISIBLE);
                textsprink.setVisibility(View.VISIBLE);
                title.setText("Marshmellow Surprise");
                milkrb.setChecked(true);
                marsh.setChecked(true);
                break;
            default:
                break;


        }
    }


    private void Hide(){
        textmarsh = (TextView)findViewById(R.id.textmarsh);
        textsprink = (TextView)findViewById(R.id.textsprin);
        textnutel = (TextView)findViewById(R.id.textnut);
        textbanana = (TextView)findViewById(R.id.textban);
        textnuts = (TextView)findViewById(R.id.textnuts);
        textoreo = (TextView)findViewById(R.id.textoreo);
        textmarsh.setVisibility(View.GONE);
        textsprink.setVisibility(View.GONE);
        textnutel.setVisibility(View.GONE);
        textbanana.setVisibility(View.GONE);
        textnuts.setVisibility(View.GONE);
        textoreo.setVisibility(View.GONE);
        marsh.setVisibility(View.GONE);
        sprink.setVisibility(View.GONE);
        nutella.setVisibility(View.GONE);
        banana.setVisibility(View.GONE);
        nut.setVisibility(View.GONE);
        oreo.setVisibility(View.GONE);


    }
    public void addOrder(View view) {

        String code = "";
        Intent createitem;
        if (marsh.isChecked()) {
            code = code + "marsh" + ",";
        }
        if (!marsh.isChecked() && marsh.isShown()) {
            code = code + "no marsh" + ",";
        }
        if (sprink.isChecked()) {
            code = code + "sprink" + ",";
        }
        if (!sprink.isChecked() && sprink.isShown()) {
            code = code + "no sprinkles" + ",";
        }
        if (nutella.isChecked()) {
            code = code + "nutel" + ",";
        }
        if (!nutella.isChecked() && nutella.isShown()) {
            code = code + "no nutel" + ",";
        }
        if (banana.isChecked()) {
            code = code + "banana" + ",";
        }
        if (!banana.isChecked() && banana.isShown()) {
            code = code + "no banana" + ",";
        }
        if (oreo.isChecked()) {
            code = code + "oreo" + ",";
        }
        if (!oreo.isChecked() && oreo.isShown()) {
            code = code + "no oreo" + ",";
        }
        if (nut.isChecked()) {
            code = code + "nut" + ",";
        }
        if (!nut.isChecked() && nut.isShown()) {
            code = code + "no nut" + ",";
        }
        if (milkrb.isChecked()) {
            code = code + "milk" + ",";
        }
        if (darkrb.isChecked()) {
            code = code + "dark" + ",";
        }
        if (whiterb.isChecked()) {
            code = code + "white" + ",";
        }
        if (exmarsh.isChecked()) {
            code = code + "exmarsh" + ",";
        }
        if (exsprink.isChecked()) {
            code = code + "exsprink" + ",";
        }


        createitem = new Intent(this, ShopingCart.class);
        createitem.putExtra("code", code);
        createitem.putExtra("title", title.getText().toString());
        createitem.putExtra("image", num);
        createitem.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(createitem);

    }



}
