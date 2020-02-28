package com.lxk.designpatterns.AdapterPattern.imp;

import com.lxk.designpatterns.AdapterPattern.IMediaPlayer;

/**
 * @author https://github.com/103style
 * @date 2020/2/28 13:12
 */
public class AviPlayer implements IMediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("AviPlayer is playing " + filename);
    }
}
