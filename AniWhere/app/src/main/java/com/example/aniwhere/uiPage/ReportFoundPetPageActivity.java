package com.example.aniwhere.uiPage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aniwhere.R;
import com.example.aniwhere.adapter.ReportFoundPetAdapter;
import com.example.aniwhere.adapter.ReportLostPetAdapter;
import com.example.aniwhere.models.ReportFoundPetModel;
import com.example.aniwhere.models.ReportLostPetModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ReportFoundPetPageActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ReportLostPetAdapter lostPetAdapter;
    private ReportFoundPetAdapter foundPetAdapter;
    private List<ReportLostPetModel> lostPetList;
    private List<ReportLostPetModel> foundPetList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reportpage);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ReportLostPetModel> lostPetList = new ArrayList<>();
        lostPetList.add(new ReportLostPetModel("Buddy", "Golden Retriever", "Male", "10/01/2023", "Central Park", "123-456-7890", "Friendly dog, loves treats."));
        lostPetList.add(new ReportLostPetModel("Mittens", "Persian Cat", "Female", "09/29/2023", "5th Ave", "987-654-3210", "Shy and usually hides."));

        List<ReportFoundPetModel> foundPetList = new ArrayList<>();
        foundPetList.add(new ReportFoundPetModel("Buddy", "Golden Retriever", "Male", "10/01/2023", "Central Park", "123-456-7890", "Friendly dog, loves treats."));
        foundPetList.add(new ReportFoundPetModel("Mittens", "Persian Cat", "Female", "09/29/2023", "5th Ave", "987-654-3210", "Shy and usually hides."));

        lostPetAdapter = new ReportLostPetAdapter(lostPetList, this);
        foundPetAdapter = new ReportFoundPetAdapter(foundPetList, this);

        recyclerView.setAdapter(foundPetAdapter);

        MaterialButton lostButton = findViewById(R.id.foundbtn);
        lostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setAdapter(lostPetAdapter);
                Toast.makeText(ReportFoundPetPageActivity.this, "Showing Found Pets", Toast.LENGTH_SHORT).show();
            }
        });
        MaterialButton foundButton = findViewById(R.id.lostbtn);
        foundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.setAdapter(foundPetAdapter);
                Toast.makeText(ReportFoundPetPageActivity.this, "Showing Lost Pets", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ReportFoundPetPageActivity.this, ReportLostPetPageActivity.class);
            }
        });
    }
}
