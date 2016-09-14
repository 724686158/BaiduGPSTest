package com.example.admin.baidugpstest;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LocationUtil locationUtil = new LocationUtil(this);
        ;
        locationUtil.startMonitor();

        textView = (TextView) findViewById(R.id.baidu_gps_text_view);
        textView.setText("Latitude : " + locationUtil.getLocation().getLatitude() + "\n"
                + "Longitude : " +locationUtil.getLocation().getLongitude() + "\n");
        locationUtil.stopMonitor();
    }
}
