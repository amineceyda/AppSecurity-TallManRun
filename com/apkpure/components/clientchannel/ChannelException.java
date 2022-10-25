package com.apkpure.components.clientchannel;

public final class ChannelException extends Exception {
    private final String message;

    public String getMessage() {
        return this.message;
    }
}
