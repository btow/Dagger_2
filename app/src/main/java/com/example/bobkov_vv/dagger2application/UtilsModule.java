package com.example.bobkov_vv.dagger2application;

import android.content.Context;
import android.support.annotation.NonNull;

import java.nio.channels.NetworkChannel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bobkov-vv on 06.12.2017.
 */

@Module
public class UtilsModule {

    @Provides
    @NonNull
    @Singleton
    public RxUtilsAbs provideRxUtils(Context context) {
        return new RxUtils(context);
    }

    @Provides
    @NonNull
    @Singleton
    public NetworkUtils provideNetworkUtils(Context context, NetworkChannel networkChannel) {
        return new NetworkUtils(context, networkChannel);
    }
}
