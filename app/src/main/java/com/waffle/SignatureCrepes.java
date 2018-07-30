package com.waffle;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SignatureCrepes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signature_crepes);
    }

    private Intent custom;

    String num;

    public void Banoffe(View view) {
        custom = new Intent(this,CustomOrderCre.class);
        num = "1";
        custom.putExtra("waffletag",num);
        startActivity(custom);
    }

    public void Lemon(View view) {
        custom = new Intent(this,CustomOrderCre.class);
        num = "2";
        custom.putExtra("waffletag",num);
        startActivity(custom);
    }

    public void Nutella(View view) {
        custom = new Intent(this,CustomOrderCre.class);
        num = "3";
        custom.putExtra("waffletag",num);
        startActivity(custom);
    }

    public void Strawandchoco(View view) {
        custom = new Intent(this,CustomOrderCre.class);
        num = "4";
        custom.putExtra("waffletag",num);
        startActivity(custom);
    }

    public void SweetCinna(View view) {
        custom = new Intent(this,CustomOrderCre.class);
        num = "5";
        custom.putExtra("waffletag",num);
        startActivity(custom);
    }


}
