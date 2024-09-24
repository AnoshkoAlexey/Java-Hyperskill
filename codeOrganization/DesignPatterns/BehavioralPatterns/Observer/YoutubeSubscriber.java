package codeOrganization.DesignPatterns.BehavioralPatterns.Observer;

public class YoutubeSubscriber implements Observer {

    private Observable observable;

    public YoutubeSubscriber(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("New video on channgel!");
    }

}
