package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        APIInterface apiInterface=APIclinet.getclinet().create(APIInterface.class);
        Call call=apiInterface.getUsers("London","41b80e0237fc02c54afdc931eb2c84d8");
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                if(response.isSuccessful()){
                    User user= (User) response.body();
                    Toast.makeText(MainActivity.this,"siza"+user.clouds.all,Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Toast.makeText(MainActivity.this,"sorry",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
