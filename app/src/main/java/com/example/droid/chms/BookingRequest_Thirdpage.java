package com.example.droid.chms;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Atishay on 20-09-2018.
 */

public class BookingRequest_Thirdpage extends AppCompatActivity {

    @BindView(R.id.btnext)Button next_btn;
    @BindView(R.id.deptname_edit) EditText departmentname;
    @BindView(R.id.office_edit)EditText officename;
    @BindView(R.id.post_edit)EditText designation;
    @BindView(R.id.officeaddedit)EditText officeaddress;
    @BindView(R.id.sppaymatrix)MaterialBetterSpinner spMatrix;
    @BindView(R.id.sp_state)MaterialBetterSpinner spState;
    @BindView(R.id.sp_district)MaterialBetterSpinner spDistrict;
    @BindView(R.id.sp_type_of_document)MaterialBetterSpinner spDocuenttype;

    String matrixId ="";
    String stateId ="";
    String districtId="";
    String typeofDocument = "";
    String departmentName="";
    String officeName ="";
    String designationtext ="";
    String officeAddress ="";

    String[] SPINNERLIST = {"Android Material Design", "Material Design Spinner", "Spinner Using Material Library", "Material Spinner Example"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookingrequest_third);
        ButterKnife.bind(this);
        getSupportActionBar().setTitle("Official Details");



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST);
        spMatrix.setAdapter(arrayAdapter1);
        spState.setAdapter(arrayAdapter);
        spDistrict.setAdapter(arrayAdapter);
        spDocuenttype.setAdapter(arrayAdapter);



        spMatrix.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spState.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spDistrict.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spDocuenttype.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(!matrixId.equals("")){
                    if(!stateId.equals("")){
                        if(!districtId.equals("")){
                            if(typeofDocument.equals("")){
                                if(departmentName.equals("")){
                                    if(!officeName.equals("")){
                                        if(!designationtext.equals("")){
                                            if(!officeAddress.equals("")){

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
                        }else{

                        }
                    }else{

                    }

                }else{

                }



                Intent intent = new Intent(BookingRequest_Thirdpage.this,Bookingrequest_Fourthpage.class);
                startActivity(intent);
            }
        });


    }



}
