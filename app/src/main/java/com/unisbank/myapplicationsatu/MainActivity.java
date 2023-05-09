package com.unisbank.myapplicationsatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1= findViewById(R.id.tvHasil);
        EditText et1=findViewById(R.id.etPERTAMA);
        EditText et2=findViewById(R.id.etKEDUA);
        Button bt1=findViewById(R.id.btJUMLAHKAN);
        Button bt2=findViewById(R.id.btKURANG);
        Button bt3=findViewById(R.id.btKALI);
        Button bt4=findViewById(R.id.btBAGI);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String JUMLAH=" ";
                if(view.getId()==bt1.getId()){
                    int x1= Integer.parseInt(et1.getText().toString());
                    int x2= Integer.parseInt(et2.getText().toString());
                    int HASIL= x1 + x2;
                    JUMLAH=String.valueOf(HASIL);
                    tv1.setText(JUMLAH);
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String JUMLAH= " ";
                if(view.getId()==bt2.getId()){
                    int x1=Integer.parseInt(et1.getText().toString());
                    int x2=Integer.parseInt(et2.getText().toString());
                    int HASIL=x1-x2;
                    JUMLAH=String.valueOf(HASIL);
                    tv1.setText(JUMLAH);
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String JUMLAH= " ";
                if(view.getId()==bt3.getId()){
                    int x1=Integer.parseInt(et1.getText().toString());
                    int x2=Integer.parseInt(et2.getText().toString());
                    int HASIL=x1*x2;
                    JUMLAH=String.valueOf(HASIL);
                    tv1.setText(JUMLAH);
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String JUMLAH= " ";
                if(view.getId()==bt4.getId()){
                    int x1=Integer.parseInt(et1.getText().toString());
                    int x2=Integer.parseInt(et2.getText().toString());
                    float HASIL=x1/x2;
                    JUMLAH=String.valueOf(HASIL);
                    tv1.setText(JUMLAH);
                }
            }
        });
    }
}