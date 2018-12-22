package com.example.bynalab.bynatictactoe;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Bynalab on 3/28/18.
 */

public class leaderboard extends Activity {

    Button clear;
    ListView leaderboard;
    TextView textView3;
    private ArrayList<String>arrayList;
    private ArrayAdapter<String>adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leaderboard);

        clear = findViewById(R.id.clear);
        leaderboard = findViewById(R.id.leaderboard);
        String[] items = {"3      -     1", "4      -     2", "0      -     2", "1      -     1","3      -     1", "4      -     2", "0      -     2", "1      -     1"};

        arrayList = new ArrayList<>(Arrays.asList(items));

        adapter = new ArrayAdapter<String>(this,R.layout.list_items, R.id.txtItem, arrayList);
        leaderboard.setAdapter(adapter);



    }
}