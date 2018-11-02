package com.example.droid.chms;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import controllers.Logincontrollers;
import my_interface.Logininterface;
import utils.NetworkUtils;

public class LoginActivity extends AppCompatActivity implements Logininterface{

    @BindView(R.id.login_btnLogin)
    Button loginButton;
    @BindView(R.id.login_edtUsername)
    EditText editUsername;
    @BindView(R.id.login_edtPassword)
    EditText editpassword;
    private NetworkUtils newtworkutils;
    private Logincontrollers logincontrollers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        getSupportActionBar().setTitle("        CHMS PORTAL" );


         newtworkutils = new NetworkUtils();
         logincontrollers = new Logincontrollers(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(LoginActivity.this,DashboradActivity.class);
                startActivity(intent);*/
                validateLoginView(editUsername.getText().toString().trim(),editpassword.getText().toString().trim());

            }
        });


    /*    *//** Method to generate List of notice using RecyclerView with custom adapter*//*
        private void generateNoticeList(ArrayList<Notice> noticeArrayList) {
            recyclerView = findViewById(R.id.recycler_view_notice_list);
            adapter = new NoticeAdapter(noticeArrayList);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);
        }*/


    }



    public void validateLoginView(String aUserName, String aPassword) {

        if (aUserName.equals(null)||aUserName.equals("")) {
           // mLoginView.invalidUserName(aUserName);
            Toast.makeText(this,"Please fill username",Toast.LENGTH_LONG).show();
            return;
        }
      if (aUserName.equals(null)||aPassword.equals("")) {
          Toast.makeText(this,"Please enter password",Toast.LENGTH_LONG).show();
            return;
        }
        if (newtworkutils.haveNetworkConnection(LoginActivity.this)) {
            logincontrollers.doLogin(aUserName,aPassword);
        } else {
           // mLoginView.noInternetConnectionLogin();
            Snackbar snackbar = Snackbar
                    .make(editUsername, "No internet connection", Snackbar.LENGTH_LONG);
            snackbar.show();
        }
    }


    @Override
    public void onLoginSuccess(String aLoginResponse) {
        Intent intent = new Intent(LoginActivity.this,DashboradActivity.class);
        startActivity(intent);
        Toast.makeText(this,"Workked",Toast.LENGTH_LONG).show();
    }
}
