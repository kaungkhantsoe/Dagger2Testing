package com.kks.dagger2testing.dagger;

import com.kks.dagger2testing.MainActivity;
import com.kks.dagger2testing.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

//    Car getCar();

    void inject(MainActivity mainActivity);
}
