package com.kks.dagger2testing.dagger;

import com.kks.dagger2testing.car.Engine;
import com.kks.dagger2testing.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindPetrolEngine(PetrolEngine petrolEngine);
}
