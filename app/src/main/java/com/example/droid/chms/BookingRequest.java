package com.example.droid.chms;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.example.droid.chms.R;
import com.orhanobut.hawk.Hawk;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import controllers.BookingControllers;
import controllers.Logincontrollers;
import my_interface.BookingInterface;
import utils.NetworkUtils;

/**
 * Created by Atishay on 19-09-2018.
 */

public class BookingRequest extends AppCompatActivity implements BookingInterface {

    @BindView(R.id.spbookingfor)MaterialBetterSpinner sp_bookingfor;
    @BindView(R.id.circuithouse)MaterialBetterSpinner sp_circuithouse;
    @BindView(R.id.guestcat)MaterialBetterSpinner sp_guestcat;
    @BindView(R.id.spguesttype)MaterialBetterSpinner sp_guesttype;
    @BindView(R.id.btnext)Button next_btn;

    String GuestHouseID = "";
    String GuestType = "";
    String GuestCategoryId= "";
    String BookingFor ="";
    String[] SPINNERLIST = {"Android Material Design", "Material Design Spinner", "Spinner Using Material Library", "Material Spinner Example"};
    String[] SPINNERLIST1 = {"Select", "Self", "On Behalf", "Without SSO"};
    private NetworkUtils newtworkutils;
    private BookingControllers bookingcontrollers;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookingrequest);
        ButterKnife.bind(this);
        getSupportActionBar().setTitle("Booking Requested Form");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST1);
        sp_bookingfor.setAdapter(arrayAdapter1);
        sp_circuithouse.setAdapter(arrayAdapter);
        sp_guestcat.setAdapter(arrayAdapter);
        sp_guesttype.setAdapter(arrayAdapter);



        newtworkutils = new NetworkUtils();
        bookingcontrollers = new BookingControllers(this);

        if (newtworkutils.haveNetworkConnection(BookingRequest.this)) {
            bookingcontrollers.getdropdowndata("aUserName","aPassword");
        } else {
            // mLoginView.noInternetConnectionLogin();
            Snackbar snackbar = Snackbar
                    .make(next_btn, "No internet connection", Snackbar.LENGTH_LONG);
            snackbar.show();
        }


        sp_bookingfor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });


        sp_circuithouse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });



        sp_guestcat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });


        sp_guesttype.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

    }



    @Override
    public void onDropdownSuccess(String aLoginResponse) {


    }

    @OnClick (R.id.btnext)
    public void next(){
        if(!GuestHouseID.equals("")){
            if(GuestType.equals("")){
                if(GuestCategoryId.equals("")){
                    if(BookingFor.equals("")){

                    }else{

                    }
                }else{

                }
            }else{

            }
        }else{

        }


        Intent intent = new Intent(BookingRequest.this,BokkingRequest_Secondpage.class);
        intent.putExtra("GuestHouseID",GuestHouseID);
        intent.putExtra("GuestType",GuestType);
        intent.putExtra("GuestCategoryId",GuestCategoryId);
        startActivity(intent);
    }
}
