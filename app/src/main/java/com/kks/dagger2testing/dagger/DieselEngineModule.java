package com.kks.dagger2testing.dagger;

import com.kks.dagger2testing.car.DieselEngine;
import com.kks.dagger2testing.car.Engine;
import com.kks.dagger2testing.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindPetrolEngine(DieselEngine petrolEngine);
}
