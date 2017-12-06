package com.example.bobkov_vv.dagger2application;

import android.app.Application;

/**
 * Created by bobkov-vv on 06.12.2017.
 */

class App extends Application {

    private static AppComponent component;

    public static AppComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = buildComponent();
    }

    protected AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .utilsModule(new UtilsModule())
                .receiversModule(new ReceiversModule())
                .build();
    }

}
