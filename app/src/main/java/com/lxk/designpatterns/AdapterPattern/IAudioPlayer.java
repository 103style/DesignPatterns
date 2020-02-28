package com.lxk.designpatterns.AdapterPattern;

/**
 * @author https://github.com/103style
 * @date 2020/2/28 11:21
 * 音频播放接口
 */
public interface IAudioPlayer {
    /**
     * 播放接口
     *
     * @param type     格式
     * @param filename 文件名
     */
    void play(String type, String filename);
}
