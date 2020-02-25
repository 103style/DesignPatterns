package com.lxk.softwaredesignpatterndemos.SingletonPattern;

import com.lxk.softwaredesignpatterndemos.SingletonPattern.imp.LazyNotSafeSingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 16:13
 * 单例模式的测试
 */
public class SingletonTest {

    public static void main(String[] args) {
        //多线程下线程不安全的测试
        int count = 5;
        ExecutorService service = Executors.newFixedThreadPool(count);
        for (int i = 0; i < count; i++) {
            service.execute(new TestRunnable());
        }
        service.shutdown();
    }

    private static class TestRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("unique id = " + LazyNotSafeSingleton.getInstance().getId());
        }
    }

//out:
//unique id = 338216641
//unique id = 338216641
//unique id = 1253353779
//unique id = 338216641
//unique id = 1253353779
}
