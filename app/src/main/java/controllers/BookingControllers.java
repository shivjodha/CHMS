package controllers;

import android.util.Log;

import model.BindDropdownList;
import model.NoticeList;
import my_interface.BookingInterface;
import my_interface.Logininterface;
import my_interface.RetrofitimplService;
import network.RetrofitInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookingControllers {

    private BookingInterface mBookingView;

    public BookingControllers(BookingInterface aBookingView) {

        mBookingView = aBookingView;
    }


    public void getdropdowndata(String username, String password) {

        /** Create handle for the RetrofitInstance interface*/
        RetrofitimplService service = RetrofitInstance.getRetrofitInstance().create(RetrofitimplService.class);

        /** Call the method with parameter in the interface to get the notice data*/
        Call<BindDropdownList> call = service.getDropDown();

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<BindDropdownList>() {
            @Override
            public void onResponse(Call<BindDropdownList> call, Response<BindDropdownList> response) {
                // generateNoticeList(response.body().getNoticeArrayList());

               // String values = response.body().getNoticeArrayList().toString();
                mBookingView.onDropdownSuccess("values");

            }

            @Override
            public void onFailure(Call<BindDropdownList> call, Throwable t) {
                //Toast.makeText(this, "Something went wrong...Error message: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
