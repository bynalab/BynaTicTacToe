package com.example.bynalab.bynatictactoe;

import java.util.Random;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Bynalab on 3/31/18.
 */



public class tbyt extends Activity implements View.OnClickListener {


    int c[][];
    int i, j, k = 0;
    Button b[][];
    Button reset;
    AI ai;
    int turn = 0;
    private Handler mHandler = new Handler();
    TextView xoro, hscore, cscore;
    String choose;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tbyt);

        xoro = findViewById(R.id.xoro);
        hscore = findViewById(R.id.yours);
        cscore = findViewById(R.id.comps);
        xoro.setOnClickListener(this);

        setBoard();

        reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAlert("Are you sure you want to reset this board?.", "Reset Board");
            }
        });

        if(xoro.getText().toString().equals("O")){
            choose = "y";
        }
        else {
            choose = "n";
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuItem item = menu.add("New Game");
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        setBoard();
        return true;
    }


    // Set up the game board.
    private void setBoard() {
        ai = new AI();
        b = new Button[4][4];
        c = new int[4][4];


        b[1][3] = findViewById(R.id.btn1);
        b[1][2] = findViewById(R.id.btn2);
        b[1][1] = findViewById(R.id.btn3);


        b[2][3] = findViewById(R.id.btn4);
        b[2][2] = findViewById(R.id.btn5);
        b[2][1] = findViewById(R.id.btn6);


        b[3][3] = findViewById(R.id.btn7);
        b[3][2] = findViewById(R.id.btn8);
        b[3][1] = findViewById(R.id.btn9);

        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++)
                c[i][j] = 2;
        }


        // add the click listeners for each button
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                b[i][j].setOnClickListener(new MyClickListener(i, j));
                if(!b[i][j].isEnabled()) {
                    b[i][j].setText(" ");
                    b[i][j].setEnabled(true);
                }
            }
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.xoro:

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(tbyt.this);
                View mView = getLayoutInflater().inflate(R.layout.settings, null);
                final EditText select = mView.findViewById(R.id.select);
                mBuilder.setTitle("Settings");
                mBuilder.setCancelable(false);

                mBuilder.setNegativeButton(
                        "Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                mBuilder.setPositiveButton(
                        "Save",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                String xoros = select.getText().toString();

                                if((xoros.equals("O")) || (xoros.equals("X"))){

                                    xoro.setText(xoros);
                                    dialog.cancel();

                                    Toast.makeText(getApplicationContext(), "Your settings has been saved.",
                                            Toast.LENGTH_SHORT).show();

                                }
                                else {

                                    Toast.makeText(getApplicationContext(), "You can only select O or X",
                                            Toast.LENGTH_SHORT).show();

                                }




                            }
                        });

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
                break;
        }
    }


    class MyClickListener implements View.OnClickListener {
        int x;
        int y;


        public MyClickListener(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void onClick(View view) {

            if(turn == 0) {
                if (b[x][y].isEnabled()) {
                    b[x][y].setEnabled(false);
                    if(choose.toString().equals("y")) {
                        b[x][y].setText("O");
                    }
                    else {
                        b[x][y].setText("X");
                    }
                    c[x][y] = 0;
                    turn = 1;
                    if (!checkBoard()) {
                        ai.takeTurn();
                    }
                }
            }
        }
    }



    private class AI {
int m,n,dlay = 500;
        private Runnable mDelay = new Runnable() {
            @Override
            public void run() {
                markSquare(m,n);
                turn = 0;
            }
        };

        public void takeTurn() {
            if(c[1][1]==2 &&
                    ((c[1][2]==0 && c[1][3]==0) ||
                            (c[2][2]==0 && c[3][3]==0) ||
                            (c[2][1]==0 && c[3][1]==0))) {
                m=1;n=1;
                mHandler.postDelayed(mDelay,dlay);

            } else if (c[1][2]==2 &&
                    ((c[2][2]==0 && c[3][2]==0) ||
                            (c[1][1]==0 && c[1][3]==0))) {
                m=1;n=2;
                mHandler.postDelayed(mDelay,dlay);
            } else if(c[1][3]==2 &&
                    ((c[1][1]==0 && c[1][2]==0) ||
                            (c[3][1]==0 && c[2][2]==0) ||
                            (c[2][3]==0 && c[3][3]==0))) {
                m=1;n=3;
                mHandler.postDelayed(mDelay,dlay);
            } else if(c[2][1]==2 &&
                    ((c[2][2]==0 && c[2][3]==0) ||
                            (c[1][1]==0 && c[3][1]==0))){
                m=2;n=1;
                mHandler.postDelayed(mDelay,dlay);
            } else if(c[2][2]==2 &&
                    ((c[1][1]==0 && c[3][3]==0) ||
                            (c[1][2]==0 && c[3][2]==0) ||
                            (c[3][1]==0 && c[1][3]==0) ||
                            (c[2][1]==0 && c[2][3]==0))) {
                m=2;n=2;
                mHandler.postDelayed(mDelay,dlay);
            } else if(c[2][3]==2 &&
                    ((c[2][1]==0 && c[2][2]==0) ||
                            (c[1][3]==0 && c[3][3]==0))) {
                m=2;n=3;
                mHandler.postDelayed(mDelay,dlay);
            } else if(c[3][1]==2 &&
                    ((c[1][1]==0 && c[2][1]==0) ||
                            (c[3][2]==0 && c[3][3]==0) ||
                            (c[2][2]==0 && c[1][3]==0))){
                m=3;n=1;
                mHandler.postDelayed(mDelay,dlay);
            } else if(c[3][2]==2 &&
                    ((c[1][2]==0 && c[2][2]==0) ||
                            (c[3][1]==0 && c[3][3]==0))) {
                m=3;n=2;
                mHandler.postDelayed(mDelay,dlay);
            }else if( c[3][3]==2 &&
                    ((c[1][1]==0 && c[2][2]==0) ||
                            (c[1][3]==0 && c[2][3]==0) ||
                            (c[3][1]==0 && c[3][2]==0))) {
                m=3;n=3;
                mHandler.postDelayed(mDelay,dlay);
            } else {
                Random rand = new Random();

                int a = rand.nextInt(4);
                int b = rand.nextInt(4);
                while(a==0 || b==0 || c[a][b]!=2) {
                    a = rand.nextInt(4);
                    b = rand.nextInt(4);
                }
                m=a;n=b;
                mHandler.postDelayed(mDelay,dlay);
                //markSquare(a,b);
            }
        }


        private void markSquare(int x, int y) {
            b[x][y].setEnabled(false);
            if(choose.toString().equals("n")) {
                b[x][y].setText("O");
            }
            else{
                b[x][y].setText("X");
            }
            c[x][y] = 1;
            checkBoard();
        }
    }


    // check the board to see if someone has won
    private boolean checkBoard() {
        boolean gameOver = false;
        if ((c[1][1] == 0 && c[2][2] == 0 && c[3][3] == 0)
                || (c[1][3] == 0 && c[2][2] == 0 && c[3][1] == 0)
                || (c[1][2] == 0 && c[2][2] == 0 && c[3][2] == 0)
                || (c[1][3] == 0 && c[2][3] == 0 && c[3][3] == 0)
                || (c[1][1] == 0 && c[1][2] == 0 && c[1][3] == 0)
                || (c[2][1] == 0 && c[2][2] == 0 && c[2][3] == 0)
                || (c[3][1] == 0 && c[3][2] == 0 && c[3][3] == 0)
                || (c[1][1] == 0 && c[2][1] == 0 && c[3][1] == 0)) {
            winAlert("Congrats, you win","We have a winner!");
            int hscoreadd = Integer.parseInt(hscore.getText().toString());
            ++hscoreadd;
            hscore.setText(hscoreadd+"");
            gameOver = true;


        } else if ((c[1][1] == 1 && c[2][2] == 1 && c[3][3] == 1)
                || (c[1][3] == 1 && c[2][2] == 1 && c[3][1] == 1)
                || (c[1][2] == 1 && c[2][2] == 1 && c[3][2] == 1)
                || (c[1][3] == 1 && c[2][3] == 1 && c[3][3] == 1)
                || (c[1][1] == 1 && c[1][2] == 1 && c[1][3] == 1)
                || (c[2][1] == 1 && c[2][2] == 1 && c[2][3] == 1)
                || (c[3][1] == 1 && c[3][2] == 1 && c[3][3] == 1)
                || (c[1][1] == 1 && c[2][1] == 1 && c[3][1] == 1)) {
            winAlert("Computer wins!","We have a winner!");
            int cscoreadd = Integer.parseInt(cscore.getText().toString());
            ++cscoreadd;
            cscore.setText(cscoreadd+"");
            gameOver = true;

        } else {
            boolean empty = false;
            for(i=1; i<=3; i++) {
                for(j=1; j<=3; j++) {
                    if(c[i][j]==2) {
                        empty = true;
                        break;
                    }
                }
            }
            if(!empty) {
                winAlert("Game over. It's a draw!","DRAW!");
                gameOver = true;
            }
        }
        return gameOver;
    }

    public void reset(){

        b[1][1].setText("");b[1][2].setText("");b[1][3].setText("");b[2][1].setText("");b[2][2].setText("");b[2][3].setText("");b[3][1].setText("");b[3][2].setText("");b[3][3].setText("");
        setBoard();
        turn = 0;

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
                        hscore.setText("0");
                        cscore.setText("0");

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
                        setBoard();
                        dialog.cancel();

                        Toast.makeText(getApplicationContext(), "Board has been reset.",
                                Toast.LENGTH_SHORT).show();

                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();

    }

}

