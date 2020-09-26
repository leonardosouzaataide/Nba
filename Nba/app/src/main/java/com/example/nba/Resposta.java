package com.example.nba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resposta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        setContentView(R.layout.activity_resposta);
        setContentView(R.layout.activity_cestinhas);
        TextView tx1 = findViewById(R.id.txt1);
        TextView tx2 = findViewById(R.id.txt2);
        TextView tx3 = findViewById(R.id.txt3);
        TextView tx4 = findViewById(R.id.txt4);
        TextView tx5 = findViewById(R.id.txt5);
        TextView tx6 = findViewById(R.id.txt6);
        TextView tx7 = findViewById(R.id.txt7);
        TextView tx8 = findViewById(R.id.txt8);
        TextView tx9 = findViewById(R.id.txt9);
        TextView tx10 = findViewById(R.id.txt10);
        String l = extras.getString(Activity_cestinhas.EXTRA_MESSAGE_TXT1);
        String m = extras.getString(Activity_cestinhas.EXTRA_MESSAGE_TXT2);
        String n = extras.getString(Activity_cestinhas.EXTRA_MESSAGE_TXT3);
        String o = extras.getString(Activity_cestinhas.EXTRA_MESSAGE_TXT4);
        String p = extras.getString(Activity_cestinhas.EXTRA_MESSAGE_TXT5);
        String q = extras.getString(Activity_cestinhas.EXTRA_MESSAGE_TXT6);
        String r = extras.getString(Activity_cestinhas.EXTRA_MESSAGE_TXT7);
        String s = extras.getString(Activity_cestinhas.EXTRA_MESSAGE_TXT8);
        String t = extras.getString(Activity_cestinhas.EXTRA_MESSAGE_TXT9);
        String u = extras.getString(Activity_cestinhas.EXTRA_MESSAGE_TXT10);
        tx1.setText(l);
        tx2.setText(m);
        tx3.setText(n);
        tx4.setText(o);
        tx5.setText(p);
        tx6.setText(q);
        tx7.setText(r);
        tx8.setText(s);
        tx9.setText(t);
        tx10.setText(u);


    }
}

