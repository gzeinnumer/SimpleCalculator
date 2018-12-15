package com.example.gzeinnumer.zeinbelajar;

import android.icu.lang.UCharacterEnums;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button Tambah, Kurang, Kali,Bagi;
    private EditText et1, et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tambah=(Button)findViewById(R.id.btnTambah);
        Kurang=(Button)findViewById(R.id.btnKurang);
        Kali=(Button)findViewById(R.id.btnKali);
        Bagi=(Button)findViewById(R.id.btnBagi);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);

        Tambah.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(et1.getText().toString().equals("")||et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Masukan Angka",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 = Double.valueOf(et1.getText().toString());
                    double a2 = Double.valueOf(et2.getText().toString());
                    double a3;
                    a3= a1+a2;
                    et3.setText(String.valueOf(a3));
                }
            }

        });
        Kurang.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(et1.getText().toString().equals("")||et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Masukan Angka",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 = Double.valueOf(et1.getText().toString());
                    double a2 = Double.valueOf(et2.getText().toString());
                    double a3;
                    a3= a1-a2;
                    et3.setText(String.valueOf(a3));
                }
            }

        });
        Kali.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(et1.getText().toString().equals("")||et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Masukan Angka",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 = Double.valueOf(et1.getText().toString());
                    double a2 = Double.valueOf(et2.getText().toString());
                    double a3;
                    a3= a1*a2;
                    et3.setText(String.valueOf(a3));
                }
            }

        });
        Bagi.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                if(et1.getText().toString().equals("")||et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Masukan Angka",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1 = Double.valueOf(et1.getText().toString());
                    double a2 = Double.valueOf(et2.getText().toString());
                    double a3;
                    a3= a1/a2;
                    et3.setText(String.valueOf(a3));
                }
            }

        });
    }
}
