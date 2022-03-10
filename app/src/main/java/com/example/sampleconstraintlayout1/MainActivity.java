package com.example.sampleconstraintlayout1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel untuk button
    Button btnlogin;

    //Deklarasi variabel untuk EditText
    EditText edEmail,edPassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnlogin dengan componen button pada layout
        btnlogin=findViewById(R.id.btSignin);

        //menghubungkan variabel edemail dengan componen button pada layout
        edEmail=findViewById(R.id.edEmail);

        //menghubungkan variabel edpassword dengan componen button pada layout
        edPassword=findViewById(R.id.edPassword)
    }
}