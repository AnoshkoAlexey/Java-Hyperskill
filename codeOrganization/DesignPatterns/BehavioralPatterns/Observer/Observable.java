package codeOrganization.DesignPatterns.BehavioralPatterns.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();    
}
