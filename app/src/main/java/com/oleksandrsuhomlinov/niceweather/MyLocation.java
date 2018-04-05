package com.oleksandrsuhomlinov.niceweather;

/**
 * Created by Oleksandr on 23.03.2018.
 */
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.content.Context;
import android.support.v4.content.ContextCompat;


import java.lang.String;

import static android.content.Context.LOCATION_SERVICE;


public class MyLocation {
    Context mContext;
    public MyLocation(Context mContext) {
        this.mContext = mContext;
    }
    LocationManager locationManager;

    public int latitude () {return 7;}
    public int longitude() {return 7;}
    public void createLocationManager() {
        locationManager = (LocationManager) mContext.getSystemService(LOCATION_SERVICE);

    }







}

