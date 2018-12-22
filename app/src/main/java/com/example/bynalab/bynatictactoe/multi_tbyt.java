package com.example.bynalab.bynatictactoe;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Bynalab on 3/27/18.
 */

public class multi_tbyt extends Activity implements View.OnClickListener {

    Button tbtn1,tbtn2,tbtn3,tbtn4,tbtn5,tbtn6,tbtn7,tbtn8,tbtn9;
    Button reset;
    int chance = 0;
    String player0 = "Congrats Player O, You Won!";
    String playerX = "Congrats Player X, You Won!";
    String winAlertTitle = "...and we have a winner!";
    String drawAlert = "Game is draw (No more legal move!)";
    TextView oscore, xscore;;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multi_tbyt);

        oscore = findViewById(R.id.yours);
        xscore = findViewById(R.id.comps);

        tbtn1 = findViewById(R.id.btn1);
        tbtn2 = findViewById(R.id.btn2);
        tbtn3 = findViewById(R.id.btn3);
        tbtn4 = findViewById(R.id.btn4);
        tbtn5 = findViewById(R.id.btn5);
        tbtn6 = findViewById(R.id.btn6);
        tbtn7 = findViewById(R.id.btn7);
        tbtn8 = findViewById(R.id.btn8);
        tbtn9 = findViewById(R.id.btn9);
        reset = findViewById(R.id.reset);

        tbtn1.setOnClickListener(this);
        tbtn2.setOnClickListener(this);
        tbtn3.setOnClickListener(this);
        tbtn4.setOnClickListener(this);
        tbtn5.setOnClickListener(this);
        tbtn6.setOnClickListener(this);
        tbtn7.setOnClickListener(this);
        tbtn8.setOnClickListener(this);
        tbtn9.setOnClickListener(this);
        reset.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn1:

                if(tbtn1.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        tbtn1.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        tbtn1.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn2:

                if(tbtn2.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        tbtn2.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        tbtn2.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn3:

                if(tbtn3.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        tbtn3.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        tbtn3.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn4:

                if(tbtn4.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        tbtn4.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        tbtn4.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn5:

                if(tbtn5.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        tbtn5.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        tbtn5.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn6:

                if(tbtn6.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        tbtn6.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        tbtn6.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn7:

                if(tbtn7.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        tbtn7.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        tbtn7.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn8:

                if(tbtn8.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        tbtn8.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        tbtn8.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn9:

                if(tbtn9.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        tbtn9.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        tbtn9.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.reset:

                resetAlert("Are you sure you want to reset this board?.", "Reset Board");

                break;

        }

    }

    public void reset(){

        tbtn1.setText("");tbtn2.setText("");tbtn3.setText("");tbtn4.setText("");tbtn5.setText("");tbtn6.setText("");tbtn7.setText("");tbtn8.setText("");tbtn9.setText("");
        chance = 0;

    }

    public void resetAlert(String message, String title){

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage(message);
        builder1.setTitle(title);
        builder1.setCancelable(false);

        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        reset();
                        oscore.setText("0");
                        xscore.setText("0");

                        dialog.cancel();

                        Toast.makeText(getApplicationContext(), "Board has been reset.",
                                Toast.LENGTH_SHORT).show();

                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();

    }

    public void winAlert(String message, String title){

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage(message);
        builder1.setTitle(title);
        builder1.setCancelable(false);

        builder1.setPositiveButton(
                "Okay",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        reset();
                        dialog.cancel();

                        Toast.makeText(getApplicationContext(), "Board has been reset.",
                                Toast.LENGTH_SHORT).show();

                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();

    }

    public void winning(){

        //Winning decision for Player O.

        if(tbtn1.getText().toString().equals("O") && tbtn2.getText().toString().equals("O") && tbtn3.getText().toString().equals("O")
                || (tbtn1.getText().toString().equals("O") && tbtn4.getText().toString().equals("O") && tbtn7.getText().toString().equals("O"))
                || (tbtn1.getText().toString().equals("O") && tbtn5.getText().toString().equals("O") && tbtn9.getText().toString().equals("O"))
                || (tbtn2.getText().toString().equals("O") && tbtn5.getText().toString().equals("O") && tbtn8.getText().toString().equals("O"))
                || (tbtn3.getText().toString().equals("O") && tbtn6.getText().toString().equals("O") && tbtn9.getText().toString().equals("O"))
                || (tbtn3.getText().toString().equals("O") && tbtn5.getText().toString().equals("O") && tbtn7.getText().toString().equals("O"))
                || (tbtn4.getText().toString().equals("O") && tbtn5.getText().toString().equals("O") && tbtn6.getText().toString().equals("O"))
                || (tbtn7.getText().toString().equals("O") && tbtn8.getText().toString().equals("O") && tbtn9.getText().toString().equals("O"))){

            winAlert(player0, winAlertTitle);
            int oscoreadd = Integer.parseInt(oscore.getText().toString());
            ++oscoreadd;
            oscore.setText(oscoreadd+"");


        }

        //Winning decision for Player X.

        else if(tbtn1.getText().toString().equals("X") && tbtn2.getText().toString().equals("X") && tbtn3.getText().toString().equals("X")
                ||(tbtn1.getText().toString().equals("X") && tbtn4.getText().toString().equals("X") && tbtn7.getText().toString().equals("X"))
                ||(tbtn1.getText().toString().equals("X") && tbtn5.getText().toString().equals("X") && tbtn9.getText().toString().equals("X"))
                ||(tbtn2.getText().toString().equals("X") && tbtn5.getText().toString().equals("X") && tbtn8.getText().toString().equals("X"))
                ||(tbtn3.getText().toString().equals("X") && tbtn6.getText().toString().equals("X") && tbtn9.getText().toString().equals("X"))
                ||(tbtn3.getText().toString().equals("X") && tbtn5.getText().toString().equals("X") && tbtn7.getText().toString().equals("X"))
                ||(tbtn4.getText().toString().equals("X") && tbtn5.getText().toString().equals("X") && tbtn6.getText().toString().equals("X"))
                ||(tbtn7.getText().toString().equals("X") && tbtn8.getText().toString().equals("X") && tbtn9.getText().toString().equals("X"))){

            winAlert(playerX, winAlertTitle);
            int xscoreadd = Integer.parseInt(xscore.getText().toString());
            ++xscoreadd;
            xscore.setText(xscoreadd+"");


        }

        //Draw decision


       else if(tbtn1.getText().length() > 0 && tbtn2.getText().length() > 0 && tbtn3.getText().length() > 0 && tbtn4.getText().length() > 0 && tbtn5.getText().length() > 0 && tbtn6.getText().length() > 0 && tbtn7.getText().length() > 0 && tbtn8.getText().length() > 0 && tbtn9.getText().length() > 0){

            winAlert(drawAlert, "Draw");

        }


    }
}