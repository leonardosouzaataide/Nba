package com.example.nba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

class Activity_cestinhas extends AppCompatActivity {

    public final static String EXTRA_MESSAGE_TXT1 = "com.example.intent TXT1";
    public final static String EXTRA_MESSAGE_TXT2 = "com.example.intent TXT2";
    public final static String EXTRA_MESSAGE_TXT3 = "com.example.intent TXT3";
    public final static String EXTRA_MESSAGE_TXT4 = "com.example.intent TXT4";
    public final static String EXTRA_MESSAGE_TXT5 = "com.example.intent TXT5";
    public final static String EXTRA_MESSAGE_TXT6 = "com.example.intent TXT6";
    public final static String EXTRA_MESSAGE_TXT7 = "com.example.intent TXT7";
    public final static String EXTRA_MESSAGE_TXT8 = "com.example.intent TXT8";
    public final static String EXTRA_MESSAGE_TXT9 = "com.example.intent TXT9";
    public final static String EXTRA_MESSAGE_TXT10 = "com.example.intent TXT10";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Answer (View view){

        EditText TXT1 = findViewById(R.id. txt1);
        EditText TXT2 = findViewById(R.id. txt2);
        EditText TXT3 = findViewById(R.id. txt3);
        EditText TXT4 = findViewById(R.id. txt4);
        EditText TXT5 = findViewById(R.id. txt5);
        EditText TXT6 = findViewById(R.id. txt6);
        EditText TXT7 = findViewById(R.id. txt7);
        EditText TXT8 = findViewById(R.id. txt8);
        EditText TXT9 = findViewById(R.id. txt9);
        EditText TXT10 = findViewById(R.id. txt10);

        String a = TXT1.getText().toString();
        String b = TXT2.getText().toString();
        String c = TXT3.getText().toString();
        String d = TXT4.getText().toString();
        String e = TXT5.getText().toString();
        String f = TXT6.getText().toString();
        String g = TXT7.getText().toString();
        String h = TXT8.getText().toString();
        String i = TXT9.getText().toString();
        String j = TXT10.getText().toString();


        Intent intent = new Intent(this, Resposta.class);
        intent.putExtra(EXTRA_MESSAGE_TXT1, a);
        intent.putExtra(EXTRA_MESSAGE_TXT2, b);
        intent.putExtra(EXTRA_MESSAGE_TXT3, c);
        intent.putExtra(EXTRA_MESSAGE_TXT4, d);
        intent.putExtra(EXTRA_MESSAGE_TXT5, e);
        intent.putExtra(EXTRA_MESSAGE_TXT6, f);
        intent.putExtra(EXTRA_MESSAGE_TXT7, g);
        intent.putExtra(EXTRA_MESSAGE_TXT8, h);
        intent.putExtra(EXTRA_MESSAGE_TXT9, i);
        intent.putExtra(EXTRA_MESSAGE_TXT10, j);
        startActivity(intent);
    }
}


