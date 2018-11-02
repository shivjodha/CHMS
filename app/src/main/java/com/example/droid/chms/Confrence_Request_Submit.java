package com.example.droid.chms;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Confrence_Request_Submit extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener,TimePickerDialog.OnTimeSetListener{
    @BindView(R.id.etFromdate)EditText fromdate;
    @BindView(R.id.etFromtime)EditText fromtime;
    @BindView(R.id.etTodate)EditText todate;
    @BindView(R.id.etTotime)EditText totime;
    @BindView(R.id.etMaxperson)EditText maxperson;
    @BindView(R.id.etDepartment)EditText department;
    @BindView(R.id.etRemark)EditText remark;
    @BindView(R.id.btSubmit)Button submit;
    @BindView(R.id.btReset)Button reset;


    DatePickerDialog dpd;
    private TimePickerDialog sunrisePicker;
    private Calendar calendar;
    private int hrsSunrise = 6, minSunrise = 0, hrsSunset = 22, minSunset = 0;

    private AwesomeValidation awesomeValidation;

    String[] SPINNERLIST = {"Android Material Design", "Material Design Spinner", "Spinner Using Material Library", "Material Spinner Example"};
    private SimpleDateFormat mSDFRequired;

    private String date1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confrence__request__submit);
        ButterKnife.bind(this);

        getSupportActionBar().setTitle("Confrence Request");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        calendar = Calendar.getInstance();
        mSDFRequired = new SimpleDateFormat("yyyy-MM-dd");


        fromtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StratTimePicker();


            }
        });

        totime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StratTimePicker();
            }
        });

        fromdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StartdatePicker();

            }
        });


        todate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartdatePicker();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Confrence_Request_Submit.this,RoomHistory.class);
                startActivity(intent);
            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Confrence_Request_Submit.this,ContactList.class);
                startActivity(intent);
            }
        });

    }


    private void StratTimePicker(){


        sunrisePicker = TimePickerDialog.newInstance(
                Confrence_Request_Submit.this,
                hrsSunrise,
                minSunrise,
                true
        );

        sunrisePicker.show(getFragmentManager(), "sunrise_dialog");
    }


    private void StartdatePicker() {

        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(fromdate.getWindowToken(), 0);
        Calendar cal = Calendar.getInstance();
        cal.get(Calendar.YEAR);
        cal.get(Calendar.MONTH);
        cal.get(Calendar.DAY_OF_MONTH);
        dpd = DatePickerDialog.newInstance(Confrence_Request_Submit.this, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        dpd.setMaxDate(cal);//disable future date selection
        dpd.show(getFragmentManager(), "datePicker");
        dpd.setAccentColor(getResources().getColor(R.color.colorAccent));
    }


    private void submitForm() {
        // Validate the form...
        if (awesomeValidation.validate()) {
            // Here, we are sure that form is successfully validated. So, do your stuffs now...
            Toast.makeText(this, "Form Validated Successfully", Toast.LENGTH_LONG).show();
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btSubmit:
                submitForm();



                break;
        }
    }


    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        int mon = monthOfYear + 1;

        String date = dayOfMonth + "/" + mon + "/" + year;


        try {

            //date1 = mSDFRequired.format(mSDFRequired.parse(date));
            date1 = date;
            fromdate.setText(date);

        }
        catch (Exception e){
            e.printStackTrace();
        }


    }


    @Override
    public void onTimeSet(TimePickerDialog view, int hourOfDay, int minute, int second) {

        String time = hourOfDay+":"+minute;
        fromtime.setText(time);
    }


}
