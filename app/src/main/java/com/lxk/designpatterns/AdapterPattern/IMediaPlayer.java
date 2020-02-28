package com.lxk.designpatterns.AdapterPattern;

/**
 * @author https://github.com/103style
 * @date 2020/2/28 11:22
 * 多媒体文件播放接口
 */
public interface IMediaPlayer {
    String MP4 = "mp4";
    String AVI = "avi";
    String MP3 = "mp3";

    /**
     * 播放接口
     *
     * @param filename 文件名
     */
    void play(String filename);
}
