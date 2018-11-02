package com.example.droid.chms;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Atishay on 20-09-2018.
 */

public class BokkingRequest_Secondpage extends AppCompatActivity {

    @BindView(R.id.btnext)Button next_btn;
    @BindView(R.id.ssoimg)ImageView sso_img;
    @BindView(R.id.ssoid_edit)EditText sso_id;
    @BindView(R.id.name_edit)EditText sso_name;
    @BindView(R.id.mobile_edit)EditText sso_mobile;
    @BindView(R.id.dob_edit)EditText sso_dob;
    @BindView(R.id.gender_edit)EditText sso_edit;
    @BindView(R.id.postaladd_edit)EditText sso_posaladdress;
    @BindView(R.id.postalcode_edit)EditText sso_postalcode;
    @BindView(R.id.city_edit)EditText sso_city;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookingrequest_second);
        ButterKnife.bind(this);
        getSupportActionBar().setTitle("SSO Details");
       /* next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(BokkingRequest_Secondpage.this,BookingRequest_Thirdpage.class);
                startActivity(intent);
            }
        });*/
    }

    @OnClick (R.id.btnext)
    public void click(){



        Intent intent = new Intent(BokkingRequest_Secondpage.this,BookingRequest_Thirdpage.class);
        startActivity(intent);
    }
}
