package com.kks.dagger2testing.dagger;

import com.kks.dagger2testing.car.Rims;
import com.kks.dagger2testing.car.Tires;
import com.kks.dagger2testing.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static public Rims provideRims() {
        return new Rims();
    }

    @Provides
    static public Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();

        return tires;
    }

    @Provides
    static public Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims,tires);
    }
}
