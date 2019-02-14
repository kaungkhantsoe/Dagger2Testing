package com.kks.dagger2testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kks.dagger2testing.car.Car;
import com.kks.dagger2testing.dagger.CarComponent;
import com.kks.dagger2testing.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);

        car.drive();
    }
}
