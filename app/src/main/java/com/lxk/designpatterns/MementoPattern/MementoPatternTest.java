package com.lxk.designpatterns.MementoPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 14:32
 */
public class MementoPatternTest {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        for (int i = 0; i < 5; i++) {
            originator.setState("State #" + i);
            careTaker.add(originator.saveStateToMemento());
        }
        System.out.println("originator.state = " + originator.getState());

        careTaker.ctrlZ();
        originator.setState(careTaker.getState());
        System.out.println("originator.state = " + originator.getState());

        careTaker.ctrlZ();
        originator.setState(careTaker.getState());
        System.out.println("originator.state = " + originator.getState());

        careTaker.ctrlZ();
        originator.setState(careTaker.getState());
        System.out.println("originator.state = " + originator.getState());

        careTaker.ctrlShirtZ();
        originator.setState(careTaker.getState());
        System.out.println("originator.state = " + originator.getState());

        originator.setState("State #modify");
        System.out.println("setState = State #modify");
        System.out.println("originator.state = " + originator.getState());
        careTaker.add(originator.saveStateToMemento());

        careTaker.ctrlZ();
        originator.setState(careTaker.getState());
        System.out.println("originator.state = " + originator.getState());

        careTaker.ctrlZ();
        originator.setState(careTaker.getState());
        System.out.println("originator.state = " + originator.getState());


        careTaker.ctrlShirtZ();
        originator.setState(careTaker.getState());
        System.out.println("originator.state = " + originator.getState());

        careTaker.ctrlShirtZ();
        originator.setState(careTaker.getState());
        System.out.println("originator.state = " + originator.getState());

        careTaker.ctrlShirtZ();
        originator.setState(careTaker.getState());
        System.out.println("originator.state = " + originator.getState());
    }
}

