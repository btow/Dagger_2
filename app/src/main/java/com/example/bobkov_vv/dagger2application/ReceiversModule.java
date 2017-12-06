package com.example.bobkov_vv.dagger2application;

import android.support.annotation.NonNull;

import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.channels.NetworkChannel;
import java.util.Set;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ReceiversModule {

    @Provides
    @NonNull
    @Singleton
    public NetworkChannel provideNetworkChannel() {
        return new NetworkChannel() {
            @Override
            public boolean isOpen() {
                return false;
            }

            @Override
            public void close() throws IOException {

            }

            @Override
            public NetworkChannel bind(SocketAddress socketAddress) throws IOException {
                return null;
            }

            @Override
            public SocketAddress getLocalAddress() throws IOException {
                return null;
            }

            @Override
            public <T> NetworkChannel setOption(SocketOption<T> socketOption, T t) throws IOException {
                return null;
            }

            @Override
            public <T> T getOption(SocketOption<T> socketOption) throws IOException {
                return null;
            }

            @Override
            public Set<SocketOption<?>> supportedOptions() {
                return null;
            }
        };
    }
}
