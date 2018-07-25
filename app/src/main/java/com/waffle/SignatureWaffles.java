package com.waffle;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class SignatureWaffles extends AppCompatActivity {
    private Intent custom;

    String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signature_waffles);

    }



    public void Leige(View view) {
        custom = new Intent(SignatureWaffles.this,CustomOrder.class);
        num = "1";
        custom.putExtra("waffletag",num);
        startActivity(custom);
    }

    public void Cookies(View view) {
        custom = new Intent(SignatureWaffles.this,CustomOrder.class);
        num = "2";
        custom.putExtra("waffletag",num);
        startActivity(custom);
    }

    public void AU(View view) {
        custom = new Intent(SignatureWaffles.this,CustomOrder.class);
        num = "3";
        custom.putExtra("waffletag",num);
        startActivity(custom);
    }

    public void Bananas(View view) {
        custom = new Intent(SignatureWaffles.this,CustomOrder.class);
        num = "4";
        custom.putExtra("waffletag",num);
        startActivity(custom);
    }

    public void Marshmellows(View view) {
        custom = new Intent(SignatureWaffles.this,CustomOrder.class);
        num = "5";
        custom.putExtra("waffletag",num);
        startActivity(custom);
    }
}
