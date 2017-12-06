package com.example.bobkov_vv.dagger2application;

import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bobkov-vv on 06.12.2017.
 */

@Module
public class AppModule {

    private Context appContext;

    public AppModule(@NonNull Context context) {
        this.appContext = context;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return appContext;
    }
}