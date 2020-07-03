package com.example.eat_clean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChitiethucdonActivity extends AppCompatActivity {

    ImageView image;

    Toolbar toolbar;
    TextView tv_thucdon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitiethucdon);

        Intent intent=getIntent();
        thucdon a= (thucdon) intent.getSerializableExtra("thucdon");


        image=findViewById(R.id.image);
        tv_thucdon=findViewById(R.id.tv_nguyen_lieu);
        image.setImageResource(a.getIdimgae());
        tv_thucdon.setText(a.nguyenlieu);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}