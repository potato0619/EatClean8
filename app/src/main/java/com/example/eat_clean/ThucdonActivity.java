package com.example.eat_clean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ThucdonActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thucdon);

        toolbar=findViewById(R.id.toolbar);
        recyclerView=findViewById(R.id.recycleview);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        // list
        ArrayList<thucdon> arrayList=new ArrayList<>();
        arrayList.add(new thucdon(R.drawable.thucdon1,"thực đơn cho ngày 1","Nguyên liệu gồm:\n" +
                "            - Canh cải nấu tôm \n" +
                "            - Thịt viên nấm sốt cà chua\n" +
                "            - Bánh mỳ cuộn tôm chiên\"","- Canh ngao mồng tơi\n" +
                "\n" +
                "- Cuống họng lợn luộc\n" +
                "\n" +
                "- Cá thu rim dầu hào\n" +
                "\n" +
                "- Khoai môn lệ phố\n" +
                "\n" +
                "- Đậu phụ tẩm hành\n" +
                "\n" +
                "- Cà muối",""));

        arrayList.add(new thucdon(R.drawable.thucdon3,"thực đơn cho ngày 2","Nguyên liệu gồm:\n" +
                "            - Đậu xanh (đỗ) luộc.\n" +
                "            - Thịt rán \n" +
                "            - Bánh mỳ cuộn tôm chiên\"",
                "- Đậu xanh (đỗ) luộc. \n" +
                "\n" +
                "- Thịt rán\n" +
                "\n" +
                "- Sung muối\n" +
                "\n" +
                "- Tôm rim mặn\n" +
                "\n" +
                "- Mít (ăn tráng miệng). ",""));
        arrayList.add(new thucdon(R.drawable.thucdon1,"thực đơn cho ngày 3","Nguyên liệu gồm:\n" +
                "            -  Thịt ba chỉ rang cháy cạnh\n" +
                "            - Giá xào lòng gà\n" +
                "            - Rau cải luộc\"",
                "- Thịt ba chỉ rang cháy cạnh\n" +
                "\n" +
                "- Giá xào lòng gà\n" +
                "\n" +
                "- Rau cải luộc\n" +
                "\n" +
                "- Tôm rim\n" +
                "\n" +
                "- Giò me thái lát",""));
        arrayList.add(new thucdon(R.drawable.thucdon2,"thực đơn cho ngày 4","Nguyên liệu gồm:\n" +
                "            - Canh cải nấu tôm\n" +
                "            - Thịt viên nấm sốt cà chua\n" +
                "            - Bánh mỳ cuộn tôm chiên\"","- Canh ngao mồng tơi\n" +
                "\n" +
                "- Cuống họng lợn luộc\n" +
                "\n" +
                "- Cá thu rim dầu hào\n" +
                "\n" +
                "- Khoai môn lệ phố\n" +
                "\n" +
                "- Đậu phụ tẩm hành\n" +
                "\n" +
                "- Cà muối",""));

        thucdonadapter thucdonadapter=new thucdonadapter(ThucdonActivity.this,arrayList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(ThucdonActivity.this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(thucdonadapter);



    }
}