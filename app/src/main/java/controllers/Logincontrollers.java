package controllers;

import android.util.Log;

import model.NoticeList;
import my_interface.Logininterface;
import my_interface.RetrofitimplService;
import network.RetrofitInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Logincontrollers {


    private Logininterface mLoginView;

    public Logincontrollers(Logininterface aLoginView) {

        mLoginView = aLoginView;
    }


    public void doLogin(String username, String password) {

        /** Create handle for the RetrofitInstance interface*/
        RetrofitimplService service = RetrofitInstance.getRetrofitInstance().create(RetrofitimplService.class);

        /** Call the method with parameter in the interface to get the notice data*/
        Call<NoticeList> call = service.getNoticeData();

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<NoticeList>() {
            @Override
            public void onResponse(Call<NoticeList> call, Response<NoticeList> response) {
                // generateNoticeList(response.body().getNoticeArrayList());

                String values = response.body().getNoticeArrayList().toString();
                mLoginView.onLoginSuccess(values);

            }

            @Override
            public void onFailure(Call<NoticeList> call, Throwable t) {
                //Toast.makeText(this, "Something went wrong...Error message: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
