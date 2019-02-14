package com.kks.dagger2testing.car;

import javax.inject.Inject;

public class Wheels {

    public Rims rims;
    public Tires tires;

    @Inject
    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
