package com.lxk.designpatterns.PrototypePattern;

import com.lxk.designpatterns.PrototypePattern.imp.DollySheep;
import com.lxk.designpatterns.PrototypePattern.imp.JerrySheep;
import com.lxk.designpatterns.PrototypePattern.imp.TomSheep;

import java.util.Hashtable;

/**
 * @author https://github.com/103style
 * @date 2020/2/28 10:19
 */
public class SheepCache {

    private static Hashtable<Integer, AbsSheep> sheepMap = new Hashtable<>();

    public static AbsSheep getSheep(int id) {
        AbsSheep sheep = sheepMap.get(id);
        return (AbsSheep) sheep.clone();
    }

    public static void loadCache() {
        DollySheep dollySheep = new DollySheep();
        dollySheep.setId(1);
        sheepMap.put(dollySheep.getId(), dollySheep);

        TomSheep tomSheep = new TomSheep();
        tomSheep.setId(2);
        sheepMap.put(tomSheep.getId(), tomSheep);

        JerrySheep jerrySheep = new JerrySheep();
        jerrySheep.setId(3);
        sheepMap.put(jerrySheep.getId(), jerrySheep);

    }
}
