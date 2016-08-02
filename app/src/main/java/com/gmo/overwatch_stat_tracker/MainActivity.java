package com.gmo.overwatch_stat_tracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gmo.overwatch_stat_tracker.profile.Profile;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView tv;
    private OverwatchAPIEndpointInterface apiService;

    public static final String platform = "pc";
    public static final String region = "us";
    public static final String tag = "ggg-11782";
    public static final String BASE_URL = "https://api.lootbox.eu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.tv);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        initListeners();

        apiService = retrofit.create(OverwatchAPIEndpointInterface.class);


    }

    public void initListeners() {


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<Profile> call = apiService.getProfile(platform, region, tag);
                call.enqueue(new Callback<Profile>() {
                    @Override
                    public void onResponse(Call<Profile> call, Response<Profile> response) {
                        int statusCode = response.code();
                        Profile profile = response.body();


                        System.out.println(profile.getData().getLevel());
                        tv.setText(Integer.toString(profile.getData().getLevel()));
                    }

                    @Override
                    public void onFailure(Call<Profile> call, Throwable t) {
                        // Log error here since request failed
                    }
                });
            }
        });
    }
}
