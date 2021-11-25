package com.example.progettoripasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTest = (Button)findViewById(R.id.btnTest);
    }


    public void test(View v)
    {
        Toast t = Toast.makeText(getApplicationContext(),"DexterMorgan",Toast.LENGTH_LONG);// tre parametri(dove viene invocato,messaggio visualizzato,durata)
        // oggetto TOAST ha anche una gravity per posizionarlo
        t.show();
    }



}