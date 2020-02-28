package com.lxk.designpatterns.AdapterPattern.imp;

import com.lxk.designpatterns.AdapterPattern.IMediaPlayer;

/**
 * @author https://github.com/103style
 * @date 2020/2/28 13:09
 */
public class Mp4Player implements IMediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("Mp4player is playing " + filename);
    }
}
