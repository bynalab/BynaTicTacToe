package com.example.bynalab.bynatictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Bynalab on 3/27/18.
 */

public class multiplayer extends Activity implements View.OnClickListener {

    Button multi_tbyt, multi_fbyf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplayer);

        multi_tbyt = findViewById(R.id.multi_tbyt);
        multi_fbyf = findViewById(R.id.multi_fbyf);

        multi_tbyt.setOnClickListener(this);
        multi_fbyf.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.multi_tbyt:
                Intent multi_tbyt = new Intent(multiplayer.this, multi_tbyt.class);
                startActivity(multi_tbyt);
                break;

            case R.id.multi_fbyf:
                Intent multi_fbyf = new Intent(multiplayer.this, multi_fbyf.class);
                startActivity(multi_fbyf);
                break;
        }
    }
}
