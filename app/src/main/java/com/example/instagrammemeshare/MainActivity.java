package com.example.instagrammemeshare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowId;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        share = findViewById(R.id.share);


        //click on Share Button------------------------>
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomSheet();
            }
        });
    }



    //Showing BottomSheetDialog------------------------>
    private void showBottomSheet() {



        View view = getLayoutInflater().inflate(R.layout.bottom_sheet_layout, null);
        BottomSheetDialog dialog = new BottomSheetDialog(this);
        dialog.setContentView(view);
        dialog.show();



        dialog.getWindow().setNavigationBarColor(getResources().getColor(R.color.white));

        List<Model> data = new ArrayList<>();

        //Recycler View------------->
        RecyclerView recyclerView = dialog.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        data.add(new Model(R.drawable.one, "MARIA", "_maria_"));
        data.add(new Model(R.drawable.two, "linda", "Linda202"));
        data.add(new Model(R.drawable.three, "QUEEN", "queen202"));
        data.add(new Model(R.drawable.four, "Angel", "angel_90"));
        data.add(new Model(R.drawable.one, "MARIA", "_maria_"));
        data.add(new Model(R.drawable.two, "linda", "Linda202"));
        data.add(new Model(R.drawable.three, "QUEEN", "queen202"));
        data.add(new Model(R.drawable.four, "Angel", "angel_90"));
        data.add(new Model(R.drawable.one, "MARIA", "_maria_"));
        data.add(new Model(R.drawable.two, "linda", "Linda202"));
        data.add(new Model(R.drawable.three, "QUEEN", "queen202"));
        data.add(new Model(R.drawable.four, "Angel", "angel_90"));


        RecyclerAdapter adapter = new RecyclerAdapter(data, this);
        recyclerView.setAdapter(adapter);


    }
}