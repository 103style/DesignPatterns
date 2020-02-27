package com.lxk.softwaredesignpatterndemos.BuilderPattern;

/**
 * @author https://github.com/103style
 * @date 2020/2/27 15:58
 */
public class BuilderTest {

    public static void main(String[] args) {

        XHttpClient xHttpClientDefault = new XHttpClient();
        System.out.println(xHttpClientDefault.toString());

        //new XHttpClient.Builder() 提供默认的参数配置， 用户可以通过相关方法修改配置
        XHttpClient xHttpClient = new XHttpClient.Builder()
                .callTimeout(20)
                .connectTimeout(5000)
                .followRedirects(false)
                .build();
        System.out.println(xHttpClient.toString());
    }
}
