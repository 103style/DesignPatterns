package com.lxk.designpatterns.FacadePattern;

import com.lxk.designpatterns.FacadePattern.imp.IMComponent;
import com.lxk.designpatterns.FacadePattern.imp.PushComponent;
import com.lxk.designpatterns.FacadePattern.imp.UserComponent;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 17:19
 */
public class InitManager {
    private UserComponent userComponent;
    private IMComponent imComponent;
    private PushComponent pushComponent;

    public InitManager() {
        userComponent = new UserComponent();
        imComponent = new IMComponent();
        pushComponent = new PushComponent();
    }

    public void init() {
        userComponent.init();
        imComponent.init();
        pushComponent.init();
    }
}
