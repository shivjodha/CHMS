package com.example.droid.chms;


import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Atishay on 20-09-2018.
 */

public class Bookingrequest_Fourthpage extends AppCompatActivity {

    @BindView(R.id.btnext)
    Button next_btn;
    @BindView(R.id.arrival_edit)
    EditText arrivaldate;
    @BindView(R.id.atime_edit)
    EditText arrivaltime;
    @BindView(R.id.deptdate_edit)
    EditText departuredate;
    @BindView(R.id.depttime_edit)
    EditText departuretime;
    @BindView(R.id.noroom_edit)
    EditText numberofrooms;
    @BindView(R.id.sp_purposeoftravel)
    MaterialBetterSpinner spPurposeoftravel;

    Context context = this;
    String[] SPINNERLIST = {"Android Material Design", "Material Design Spinner", "Spinner Using Material Library", "Material Spinner Example"};

    String dateFormat = "dd.MM.yyyy";
    DatePickerDialog.OnDateSetListener date;
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat, Locale.GERMAN);
    private Calendar myCalendar;
    private DatePickerDialog.OnDateSetListener date1;
    private Calendar myCalendar2;

    String arrivalDate ="";
    String arrivalTime = "";
    String departureDate = "";
    String departureTime = "";
    String numberOfRooms = "";
    String purposeOfTravel = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookingrequest_fourth);
        ButterKnife.bind(this);
        getSupportActionBar().setTitle("Official Details");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST);

        spPurposeoftravel.setAdapter(arrayAdapter);





         myCalendar = Calendar.getInstance();
        myCalendar2 = Calendar.getInstance();
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!arrivalDate.equals("")){
                    if(!arrivalTime.equals("")){
                        if(!departureDate.equals("")){
                            if(!departureTime.equals("")){
                                if(!numberOfRooms.equals("")){
                                    if(!purposeOfTravel.equals("")){

                                    }
                                }
                            }else{

                            }
                        }else{

                        }
                    }else{

                    }
                }else{

                }

                Intent intent = new Intent(Bookingrequest_Fourthpage.this, Bookingrequest_Fifth.class);
                startActivity(intent);
            }
        });


         date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

        };


        // onclick - popup datepicker
        arrivaldate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(Bookingrequest_Fourthpage.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });


        departuredate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(Bookingrequest_Fourthpage.this, date1, myCalendar2
                        .get(Calendar.YEAR), myCalendar2.get(Calendar.MONTH),
                        myCalendar2.get(Calendar.DAY_OF_MONTH)).show();
            }
        });


        arrivaltime.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Bookingrequest_Fourthpage.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        arrivaltime.setText( selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });


        departuretime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Bookingrequest_Fourthpage.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        departuretime.setText( selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });

        date1 = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar2.set(Calendar.YEAR, year);
                myCalendar2.set(Calendar.MONTH, monthOfYear);
                myCalendar2.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel1();
            }

        };


    }

    private void updateLabel1() {
        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        departuredate.setText(sdf.format(myCalendar2.getTime()));
    }


    private void updateLabel() {

        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
             arrivaldate.setText(sdf.format(myCalendar.getTime()));


    }





}
