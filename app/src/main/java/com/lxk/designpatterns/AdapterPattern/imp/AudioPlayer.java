package com.lxk.designpatterns.AdapterPattern.imp;

import com.lxk.designpatterns.AdapterPattern.IAudioPlayer;
import com.lxk.designpatterns.AdapterPattern.IMediaPlayer;
import com.lxk.designpatterns.AdapterPattern.MediaAdapter;

/**
 * @author https://github.com/103style
 * @date 2020/2/28 13:12
 */
public class AudioPlayer implements IAudioPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String filename) {
        switch (type) {
            case IMediaPlayer.MP3:
                System.out.println("AudioPlayer is playing " + filename);
                break;
            default:
                if (mediaAdapter == null) {
                    mediaAdapter = new MediaAdapter(type);
                }
                mediaAdapter.play(filename);
                break;
        }
    }
}
