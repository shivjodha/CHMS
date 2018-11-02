package com.example.droid.chms;

import android.content.Context;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Confrence_Request extends AppCompatActivity  {

    DatePickerDialog dpd;
    private TimePickerDialog sunrisePicker;
    private Calendar calendar;
    private int hrsSunrise = 6, minSunrise = 0, hrsSunset = 22, minSunset = 0;

    private AwesomeValidation awesomeValidation;

    String[] SPINNERLIST = {"Android Material Design", "Material Design Spinner", "Spinner Using Material Library", "Material Spinner Example"};
    private SimpleDateFormat mSDFRequired;

    private String date1;


    @BindView(R.id.etSsoid) EditText ssoid;
    @BindView(R.id.etName) EditText name;
    @BindView(R.id.etEmail)EditText email;
    @BindView(R.id.etPhone)EditText phone;
    @BindView(R.id.spGuesthouse)MaterialBetterSpinner guesthousename;
    @BindView(R.id.spPurpose)MaterialBetterSpinner purpose;
    @BindView(R.id.btnext)Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confrence);
        ButterKnife.bind(this);
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        getSupportActionBar().setTitle("Conference Services Request Form");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        calendar = Calendar.getInstance();
        mSDFRequired = new SimpleDateFormat("yyyy-MM-dd");

       // initView();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST);

        guesthousename.setAdapter(arrayAdapter);
        purpose.setAdapter(arrayAdapter);


        name.setText("ffdgdfg");

       next.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(Confrence_Request.this,Confrence_Request_Submit.class);
               startActivity(intent);
           }
       });

    }





   /* private void initView() {
        name = (EditText) findViewById(R.id.etName);
        email = (EditText) findViewById(R.id.etEmail);
        department  = (EditText)findViewById(R.id.etDepartment);
        fromtime = (EditText)findViewById(R.id.etFromtime);

        phone = (EditText) findViewById(R.id.etPhone);


        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(this);

        addValidationToViews();
    }*/

   /* private void addValidationToViews() {

        awesomeValidation.addValidation(this, R.id.etName, RegexTemplate.NOT_EMPTY, R.string.invalid_name);

        awesomeValidation.addValidation(this, R.id.etEmail, Patterns.EMAIL_ADDRESS, R.string.invalid_email);
        awesomeValidation.addValidation(this, R.id.etConfirmEmail, R.id.etEmail, R.string.invalid_confirm_email);

        String regexPassword = ".{8,}";
       *//* awesomeValidation.addValidation(this, R.id.etPassword, regexPassword, R.string.invalid_password);
        awesomeValidation.addValidation(this, R.id.etConfirmPassword, R.id.etPassword, R.string.invalid_confirm_password);
*//*
        awesomeValidation.addValidation(this, R.id.etPhone, "^[+]?[0-9]{10,13}$", R.string.invalid_phone);
        // awesomeValidation.addValidation(this, R.id.etAge, Range.closed(12, 60), R.string.invalid_age);
    }*/


}


