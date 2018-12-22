package com.example.bynalab.bynatictactoe;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Bynalab on 3/27/18.
 */

public class multi_fbyf extends Activity implements View.OnClickListener {

    Button fbtn1,fbtn2,fbtn3,fbtn4,fbtn5,fbtn6,fbtn7,fbtn8,fbtn9,fbtn10,fbtn11,fbtn12,fbtn13,fbtn14,fbtn15,fbtn16,fbtn17,fbtn18,fbtn19,fbtn20,fbtn21,fbtn22,fbtn23,fbtn24,fbtn25;
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
        setContentView(R.layout.multi_fbyf);

        oscore = findViewById(R.id.yours);
        xscore = findViewById(R.id.comps);

        fbtn1 = findViewById(R.id.btn1);
        fbtn2 = findViewById(R.id.btn2);
        fbtn3 = findViewById(R.id.btn3);
        fbtn4 = findViewById(R.id.btn4);
        fbtn5 = findViewById(R.id.btn5);
        fbtn6 = findViewById(R.id.btn6);
        fbtn7 = findViewById(R.id.btn7);
        fbtn8 = findViewById(R.id.btn8);
        fbtn9 = findViewById(R.id.btn9);
        fbtn10 = findViewById(R.id.btn10);
        fbtn11 = findViewById(R.id.btn11);
        fbtn12 = findViewById(R.id.btn12);
        fbtn13 = findViewById(R.id.btn13);
        fbtn14 = findViewById(R.id.btn14);
        fbtn15 = findViewById(R.id.btn15);
        fbtn16 = findViewById(R.id.btn16);
        fbtn17 = findViewById(R.id.btn17);
        fbtn18 = findViewById(R.id.btn18);
        fbtn19 = findViewById(R.id.btn19);
        fbtn20 = findViewById(R.id.btn20);
        fbtn21 = findViewById(R.id.btn21);
        fbtn22 = findViewById(R.id.btn22);
        fbtn23 = findViewById(R.id.btn23);
        fbtn24 = findViewById(R.id.btn24);
        fbtn25 = findViewById(R.id.btn25);
        reset = findViewById(R.id.reset);

        fbtn1.setOnClickListener(this);
        fbtn2.setOnClickListener(this);
        fbtn3.setOnClickListener(this);
        fbtn4.setOnClickListener(this);
        fbtn5.setOnClickListener(this);
        fbtn6.setOnClickListener(this);
        fbtn7.setOnClickListener(this);
        fbtn8.setOnClickListener(this);
        fbtn9.setOnClickListener(this);
        fbtn10.setOnClickListener(this);
        fbtn11.setOnClickListener(this);
        fbtn12.setOnClickListener(this);
        fbtn13.setOnClickListener(this);
        fbtn14.setOnClickListener(this);
        fbtn15.setOnClickListener(this);
        fbtn16.setOnClickListener(this);
        fbtn17.setOnClickListener(this);
        fbtn18.setOnClickListener(this);
        fbtn19.setOnClickListener(this);
        fbtn20.setOnClickListener(this);
        fbtn21.setOnClickListener(this);
        fbtn22.setOnClickListener(this);
        fbtn23.setOnClickListener(this);
        fbtn24.setOnClickListener(this);
        fbtn25.setOnClickListener(this);
        reset.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn1:

                if(fbtn1.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn1.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn1.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn2:

                if(fbtn2.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn2.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn2.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn3:

                if(fbtn3.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn3.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn3.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn4:

                if(fbtn4.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn4.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn4.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn5:

                if(fbtn5.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn5.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn5.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn6:

                if(fbtn6.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn6.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn6.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn7:

                if(fbtn7.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn7.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn7.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn8:

                if(fbtn8.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn8.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn8.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn9:

                if(fbtn9.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn9.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn9.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn10:

                if(fbtn10.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn10.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn10.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn11:

                if(fbtn11.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn11.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn11.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn12:

                if(fbtn12.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn12.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn12.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn13:

                if(fbtn13.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn13.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn13.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn14:

                if(fbtn14.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn14.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn14.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn15:

                if(fbtn15.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn15.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn15.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn16:

                if(fbtn16.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn16.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn16.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn17:

                if(fbtn17.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn17.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn17.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn18:

                if(fbtn18.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn18.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn18.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn19:

                if(fbtn19.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn19.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn19.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn20:

                if(fbtn20.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn20.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn20.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn21:

                if(fbtn21.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn21.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn21.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn22:

                if(fbtn22.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn22.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn22.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn23:

                if(fbtn23.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn23.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn23.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn24:

                if(fbtn24.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn24.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn24.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.btn25:

                if(fbtn25.getText().toString().equals("")){

                    if(chance == 0){

                        chance = 1;
                        fbtn25.setText("O");
                        winning();
                    }
                    else {

                        chance = 0;
                        fbtn25.setText("X");
                        winning();
                    }
                }
                break;

            case R.id.reset:

                resetAlert("Are you sure you want to reset this board?.", "Reset Board");

                chance = 0;

                break;

        }

    }

    public void reset(){

        fbtn1.setText("");
        fbtn2.setText("");
        fbtn3.setText("");
        fbtn4.setText("");
        fbtn5.setText("");
        fbtn6.setText("");
        fbtn7.setText("");
        fbtn8.setText("");
        fbtn9.setText("");
        fbtn10.setText("");
        fbtn11.setText("");
        fbtn12.setText("");
        fbtn13.setText("");
        fbtn14.setText("");
        fbtn15.setText("");
        fbtn16.setText("");
        fbtn17.setText("");
        fbtn18.setText("");
        fbtn19.setText("");
        fbtn20.setText("");
        fbtn21.setText("");
        fbtn22.setText("");
        fbtn23.setText("");
        fbtn24.setText("");
        fbtn25.setText("");
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

        if(fbtn1.getText().toString().equals("O") && fbtn2.getText().toString().equals("O") && fbtn3.getText().toString().equals("O") && fbtn4.getText().toString().equals("O") && fbtn5.getText().toString().equals("O")
            ||(fbtn1.getText().toString().equals("O") && fbtn6.getText().toString().equals("O") && fbtn11.getText().toString().equals("O") && fbtn16.getText().toString().equals("O") && fbtn21.getText().toString().equals("O"))
            ||(fbtn1.getText().toString().equals("O") && fbtn7.getText().toString().equals("O") && fbtn13.getText().toString().equals("O") && fbtn19.getText().toString().equals("O") && fbtn25.getText().toString().equals("O"))
            ||(fbtn2.getText().toString().equals("O") && fbtn7.getText().toString().equals("O") && fbtn12.getText().toString().equals("O") && fbtn17.getText().toString().equals("O") && fbtn22.getText().toString().equals("O"))
            ||(fbtn3.getText().toString().equals("O") && fbtn8.getText().toString().equals("O") && fbtn13.getText().toString().equals("O") && fbtn18.getText().toString().equals("O") && fbtn23.getText().toString().equals("O"))
            ||(fbtn4.getText().toString().equals("O") && fbtn9.getText().toString().equals("O") && fbtn14.getText().toString().equals("O") && fbtn19.getText().toString().equals("O") && fbtn24.getText().toString().equals("O"))
            ||(fbtn5.getText().toString().equals("O") && fbtn10.getText().toString().equals("O") && fbtn15.getText().toString().equals("O") && fbtn20.getText().toString().equals("O") && fbtn25.getText().toString().equals("O"))
            ||(fbtn5.getText().toString().equals("O") && fbtn9.getText().toString().equals("O") && fbtn13.getText().toString().equals("O") && fbtn17.getText().toString().equals("O") && fbtn21.getText().toString().equals("O"))
            ||(fbtn6.getText().toString().equals("O") && fbtn7.getText().toString().equals("O") && fbtn8.getText().toString().equals("O") && fbtn9.getText().toString().equals("O") && fbtn10.getText().toString().equals("O"))
            ||(fbtn11.getText().toString().equals("O") && fbtn12.getText().toString().equals("O") && fbtn13.getText().toString().equals("O") && fbtn14.getText().toString().equals("O") && fbtn15.getText().toString().equals("O"))
            ||(fbtn16.getText().toString().equals("O") && fbtn17.getText().toString().equals("O") && fbtn18.getText().toString().equals("O") && fbtn19.getText().toString().equals("O") && fbtn20.getText().toString().equals("O"))
            ||(fbtn21.getText().toString().equals("O") && fbtn22.getText().toString().equals("O") && fbtn23.getText().toString().equals("O") && fbtn24.getText().toString().equals("O") && fbtn25.getText().toString().equals("O"))){


            winAlert(player0, winAlertTitle);
            int oscoreadd = Integer.parseInt(oscore.getText().toString());
            ++oscoreadd;
            oscore.setText(oscoreadd+"");

        }



        //Winning decision for Player X.

        else if(fbtn1.getText().toString().equals("X") && fbtn2.getText().toString().equals("X") && fbtn3.getText().toString().equals("X") && fbtn4.getText().toString().equals("X") && fbtn5.getText().toString().equals("X")
                ||(fbtn1.getText().toString().equals("X") && fbtn6.getText().toString().equals("X") && fbtn11.getText().toString().equals("X") && fbtn16.getText().toString().equals("X") && fbtn21.getText().toString().equals("X"))
                ||(fbtn1.getText().toString().equals("X") && fbtn7.getText().toString().equals("X") && fbtn13.getText().toString().equals("X") && fbtn19.getText().toString().equals("X") && fbtn25.getText().toString().equals("X"))
                ||(fbtn2.getText().toString().equals("X") && fbtn7.getText().toString().equals("X") && fbtn12.getText().toString().equals("X") && fbtn17.getText().toString().equals("X") && fbtn22.getText().toString().equals("X"))
                ||(fbtn3.getText().toString().equals("X") && fbtn8.getText().toString().equals("X") && fbtn13.getText().toString().equals("X") && fbtn18.getText().toString().equals("X") && fbtn23.getText().toString().equals("X"))
                ||(fbtn4.getText().toString().equals("X") && fbtn9.getText().toString().equals("X") && fbtn14.getText().toString().equals("X") && fbtn19.getText().toString().equals("X") && fbtn24.getText().toString().equals("X"))
                ||(fbtn5.getText().toString().equals("X") && fbtn10.getText().toString().equals("X") && fbtn15.getText().toString().equals("X") && fbtn20.getText().toString().equals("X") && fbtn25.getText().toString().equals("X"))
                ||(fbtn5.getText().toString().equals("X") && fbtn9.getText().toString().equals("X") && fbtn13.getText().toString().equals("X") && fbtn17.getText().toString().equals("X") && fbtn21.getText().toString().equals("X"))
                ||(fbtn6.getText().toString().equals("X") && fbtn7.getText().toString().equals("X") && fbtn8.getText().toString().equals("X") && fbtn9.getText().toString().equals("X") && fbtn10.getText().toString().equals("X"))
                ||(fbtn11.getText().toString().equals("X") && fbtn12.getText().toString().equals("X") && fbtn13.getText().toString().equals("X") && fbtn14.getText().toString().equals("X") && fbtn15.getText().toString().equals("X"))
                ||(fbtn16.getText().toString().equals("X") && fbtn17.getText().toString().equals("X") && fbtn18.getText().toString().equals("X") && fbtn19.getText().toString().equals("X") && fbtn20.getText().toString().equals("X"))
                ||(fbtn21.getText().toString().equals("X") && fbtn22.getText().toString().equals("X") && fbtn23.getText().toString().equals("X") && fbtn24.getText().toString().equals("X") && fbtn25.getText().toString().equals("X"))){


            winAlert(playerX, winAlertTitle);
            int xscoreadd = Integer.parseInt(xscore.getText().toString());
            ++xscoreadd;
            xscore.setText(xscoreadd+"");

        }


        //Draw decision


        else if(fbtn1.getText().length() > 0 && fbtn2.getText().length() > 0 && fbtn3.getText().length() > 0 && fbtn4.getText().length() > 0 && fbtn5.getText().length() > 0 && fbtn6.getText().length() > 0 && fbtn7.getText().length() > 0 && fbtn8.getText().length() > 0 && fbtn9.getText().length() > 0 && fbtn10.getText().length() > 0 && fbtn11.getText().length() > 0 && fbtn12.getText().length() > 0 && fbtn13.getText().length() > 0 && fbtn14.getText().length() > 0 && fbtn15.getText().length() > 0 && fbtn16.getText().length() > 0 && fbtn17.getText().length() > 0 && fbtn18.getText().length() > 0 && fbtn19.getText().length() > 0 && fbtn20.getText().length() > 0 && fbtn21.getText().length() > 0 && fbtn22.getText().length() > 0 && fbtn23.getText().length() > 0 && fbtn24.getText().length() > 0 && fbtn25.getText().length() > 0){

            winAlert(drawAlert, "Draw");

        }

    }

}