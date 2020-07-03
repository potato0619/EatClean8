package com.example.eat_clean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView tvthucdon;
TextView tv_chedoan,tv_cacbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // find id
        tvthucdon=findViewById(R.id.tv_thucdon);
        tv_chedoan=findViewById(R.id.tv_chedoan);
        tv_cacbt=findViewById(R.id.tv_cacbt);

        //
        tvthucdon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ThucdonActivity.class));
            }
        });
        tv_chedoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ChedoanActivity.class));
            }
        });
        tv_cacbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CacbtActivity.class));
            }
        });


    }
}