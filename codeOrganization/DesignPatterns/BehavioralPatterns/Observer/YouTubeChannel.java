package codeOrganization.DesignPatterns.BehavioralPatterns.Observer;

import java.util.ArrayList;

public class YouTubeChannel implements Observable {

    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void releaseNewVideo(String video) {
        System.out.println("Release new video: " + video);
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
