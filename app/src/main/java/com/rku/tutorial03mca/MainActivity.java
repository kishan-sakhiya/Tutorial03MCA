package com.rku.tutorial03mca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    EditText edtLEmail, edtLPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnClick = findViewById(R.id.btnlogin);
        edtLEmail = findViewById(R.id.edtLemail);
        edtLPassword = findViewById(R.id.edtLPassword);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = edtLEmail.getText().toString().trim();
                String pass = edtLPassword.getText().toString();

                if (email.equals("admin@gmail.com") && pass.equals("admin")){

                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}