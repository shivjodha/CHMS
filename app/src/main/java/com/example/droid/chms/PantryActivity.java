package com.example.droid.chms;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Atishay on 21-09-2018.
 */

public class PantryActivity extends AppCompatActivity {

    @BindView(R.id.spbookingfor)MaterialBetterSpinner sp_bookingfor;
    @BindView(R.id.circuithouse)MaterialBetterSpinner sp_circuithouse;
    @BindView(R.id.btnext)TextView next_btn;


    String[] SPINNERLIST = {"Android Material Design", "Material Design Spinner", "Spinner Using Material Library", "Material Spinner Example"};
    String[] SPINNERLIST1 = {"Select", "Self", "On Behalf", "Without SSO"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantryservice);
        ButterKnife.bind(this);
        getSupportActionBar().setTitle("Pantry Service Form");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST1);
        sp_bookingfor.setAdapter(arrayAdapter1);
        sp_circuithouse.setAdapter(arrayAdapter);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PantryActivity.this,ServiceRequestitem.class);
                startActivity(intent);
            }
        });
    }

}

