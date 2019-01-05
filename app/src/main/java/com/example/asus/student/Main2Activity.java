package com.example.asus.student;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText edt_account;
    Button btnturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnturn=findViewById(R.id.btn_trun);
        btnturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                intent.putExtra("name",edt_account.getText().toString().trim());
                startActivity(intent);
            }
        });
    }
}
