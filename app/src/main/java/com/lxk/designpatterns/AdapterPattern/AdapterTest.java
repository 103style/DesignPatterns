package com.lxk.designpatterns.AdapterPattern;

import com.lxk.designpatterns.AdapterPattern.imp.AudioPlayer;

/**
 * @author https://github.com/103style
 * @date 2020/2/28 13:20
 */
public class AdapterTest {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(IMediaPlayer.MP3, "Calories.mp3");
        audioPlayer.play(IMediaPlayer.MP4, "WALL.E.mp4");
        audioPlayer.play(IMediaPlayer.AVI, "Parasite.avi");
    }
}
