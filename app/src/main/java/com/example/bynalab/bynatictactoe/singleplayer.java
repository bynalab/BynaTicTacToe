package com.example.bynalab.bynatictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Bynalab on 3/27/18.
 */

public class singleplayer extends Activity implements View.OnClickListener {

    Button tbyt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleplayer);

        tbyt = findViewById(R.id.tbyt);

        tbyt.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.tbyt:
                Intent tbyt = new Intent(singleplayer.this, tbyt.class);
                startActivity(tbyt);
                break;

        }
    }
}
