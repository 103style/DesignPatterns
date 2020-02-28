package com.lxk.designpatterns.AdapterPattern;

import com.lxk.designpatterns.AdapterPattern.imp.AviPlayer;
import com.lxk.designpatterns.AdapterPattern.imp.Mp4Player;

/**
 * @author xiaoke.luo@tcl.com 2020/2/28 13:16
 */
public class MediaAdapter implements IMediaPlayer {

    IMediaPlayer iMediaPlayer;

    public MediaAdapter(String mediaType) {
        switch (mediaType) {
            case IMediaPlayer.AVI:
                iMediaPlayer = new AviPlayer();
                break;
            case IMediaPlayer.MP4:
                iMediaPlayer = new Mp4Player();
                break;
            default:
                break;
        }
    }

    @Override
    public void play(String filename) {
        if (iMediaPlayer == null) {
            return;
        }

        iMediaPlayer.play(filename);
    }
}