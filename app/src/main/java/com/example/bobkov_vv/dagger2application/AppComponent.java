package com.example.bobkov_vv.dagger2application;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by bobkov-vv on 06.12.2017.
 */

@Component(modules = {AppModule.class, UtilsModule.class, ReceiversModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
