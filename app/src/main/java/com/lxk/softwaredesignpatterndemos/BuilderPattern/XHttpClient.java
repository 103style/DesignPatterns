package com.lxk.softwaredesignpatterndemos.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/103style
 * @date 2020/2/27 15:46
 * okhttpclient部分代码
 */
public class XHttpClient {
    final List<Object> interceptors;
    final List<Object> networkInterceptors;
    final boolean followRedirects;
    final boolean retryOnConnectionFailure;
    final int callTimeout;
    final int connectTimeout;
    final int readTimeout;
    final int writeTimeout;
    final int pingInterval;

    public XHttpClient() {
        this(new Builder());
    }

    XHttpClient(Builder builder) {
        this.interceptors = builder.interceptors;
        this.networkInterceptors = builder.networkInterceptors;
        this.followRedirects = builder.followRedirects;
        this.retryOnConnectionFailure = builder.retryOnConnectionFailure;
        this.callTimeout = builder.callTimeout;
        this.connectTimeout = builder.connectTimeout;
        this.readTimeout = builder.readTimeout;
        this.writeTimeout = builder.writeTimeout;
        this.pingInterval = builder.pingInterval;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("XHttpClient{");
        sb.append("interceptors=").append(interceptors);
        sb.append(", networkInterceptors=").append(networkInterceptors);
        sb.append(", followRedirects=").append(followRedirects);
        sb.append(", retryOnConnectionFailure=").append(retryOnConnectionFailure);
        sb.append(", callTimeout=").append(callTimeout);
        sb.append(", connectTimeout=").append(connectTimeout);
        sb.append(", readTimeout=").append(readTimeout);
        sb.append(", writeTimeout=").append(writeTimeout);
        sb.append(", pingInterval=").append(pingInterval);
        sb.append('}');
        return sb.toString();
    }

    public static final class Builder {
        List<Object> interceptors;
        List<Object> networkInterceptors;
        boolean followRedirects;
        boolean retryOnConnectionFailure;
        int callTimeout;
        int connectTimeout;
        int readTimeout;
        int writeTimeout;
        int pingInterval;

        public Builder() {
            interceptors = new ArrayList<>();
            networkInterceptors = new ArrayList<>();
            followRedirects = true;
            retryOnConnectionFailure = true;
            callTimeout = 0;
            connectTimeout = 10_000;
            readTimeout = 10_000;
            writeTimeout = 10_000;
            pingInterval = 0;
        }

        Builder(XHttpClient xkHttpClient) {
            this.interceptors.addAll(xkHttpClient.interceptors);
            this.networkInterceptors.addAll(xkHttpClient.networkInterceptors);
            this.followRedirects = xkHttpClient.followRedirects;
            this.retryOnConnectionFailure = xkHttpClient.retryOnConnectionFailure;
            this.callTimeout = xkHttpClient.callTimeout;
            this.connectTimeout = xkHttpClient.connectTimeout;
            this.readTimeout = xkHttpClient.readTimeout;
            this.writeTimeout = xkHttpClient.writeTimeout;
            this.pingInterval = xkHttpClient.pingInterval;
        }

        public Builder callTimeout(int timeout) {
            callTimeout = timeout;
            return this;
        }

        public Builder connectTimeout(int timeout) {
            connectTimeout = timeout;
            return this;
        }

        public Builder readTimeout(int timeout) {
            readTimeout = timeout;
            return this;
        }

        public Builder writeTimeout(int timeout) {
            writeTimeout = timeout;
            return this;
        }

        public Builder pingInterval(int interval) {
            pingInterval = interval;
            return this;
        }

        public Builder followRedirects(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        public Builder retryOnConnectionFailure(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        public Builder addInterceptor(Object interceptor) {
            if (interceptor == null) throw new IllegalArgumentException("interceptor == null");
            interceptors.add(interceptor);
            return this;
        }

        public Builder addNetworkInterceptor(Object interceptor) {
            if (interceptor == null) throw new IllegalArgumentException("interceptor == null");
            networkInterceptors.add(interceptor);
            return this;
        }

        public XHttpClient build() {
            return new XHttpClient(this);
        }
    }
}
