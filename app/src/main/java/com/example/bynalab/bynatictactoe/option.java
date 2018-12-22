package com.example.bynalab.bynatictactoe;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Bynalab on 3/27/18.
 */

public class option extends Activity implements View.OnClickListener {

    Button singleP, multiP, leaderboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option);

        singleP = findViewById(R.id.singleP);
        multiP = findViewById(R.id.multiP);
        leaderboard = findViewById(R.id.leaderboard);

        singleP.setOnClickListener(this);
        multiP.setOnClickListener(this);
        leaderboard.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.singleP:

                Intent single = new Intent(option.this, singleplayer.class);
                startActivity(single);
                break;

            case R.id.multiP:

                Intent multi = new Intent(option.this, multiplayer.class);
                startActivity(multi);
                break;

            case R.id.leaderboard:

                Intent leaderboard = new Intent(option.this, leaderboard.class);
                startActivity(leaderboard);
                break;
        }
    }
}
