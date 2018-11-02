package com.example.droid.chms;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.orhanobut.hawk.Hawk;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;

import Adapter.RoomHistoryModel;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Atishay on 20-09-2018.
 */

public class Bookingrequest_Fifth extends AppCompatActivity {

    @BindView(R.id.btnext)
    Button next_btn;
    @BindView(R.id.guest_edit)
    EditText Name;
    @BindView(R.id.sp_relation)
    MaterialBetterSpinner sprelation;
    @BindView(R.id.sp_idproof)
    MaterialBetterSpinner spidtype;
    @BindView(R.id.sp_gender)
    MaterialBetterSpinner spgender;
    @BindView(R.id.idnum_edit)
    EditText idnuber;
    String[] SPINNERLIST = {"Android Material Design", "Material Design Spinner", "Spinner Using Material Library", "Material Spinner Example"};

    String name = "";
    String realtionWith = "";
    String idProof ="";
    String genderId ="";
    String idNumber ="";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookingrequest_five);
        ButterKnife.bind(this);
        getSupportActionBar().setTitle("Additional Guest Details");
        Hawk.init(this).build();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST);

        sprelation.setAdapter(arrayAdapter);
        spidtype.setAdapter(arrayAdapter);
        spgender.setAdapter(arrayAdapter);
        /*next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Bookingrequest_Fifth.this, Bokking_Guestdetails.class);
                startActivity(intent);
            }
        });*/
    }

    @OnClick (R.id.btnext)
    public void intentclick(){
        RoomHistoryModel a = new RoomHistoryModel("True", 13);
        ArrayList<RoomHistoryModel> albumList = new ArrayList<RoomHistoryModel>();
        albumList.add(a);
        Hawk.put("aditionalguest", albumList);
        Intent intent = new Intent(Bookingrequest_Fifth.this, Bokking_Guestdetails.class);
        startActivity(intent);

        if(name.equals("")){
            if(realtionWith.equals("")){
                if(idProof.equals("")){
                    if(genderId.equals("")){
                        if(idNumber.equals("")){

                        }else{

                        }
                    }else{

                    }
                }else{

                }
            }else{

            }
        }else{

        }
    }
}
