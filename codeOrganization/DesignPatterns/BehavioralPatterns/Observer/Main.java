package codeOrganization.DesignPatterns.BehavioralPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel = new YouTubeChannel();
        YoutubeSubscriber subscriberA = new YoutubeSubscriber(youTubeChannel);
        YoutubeSubscriber subscriberB = new YoutubeSubscriber(youTubeChannel);
        YoutubeSubscriber subscriberC = new YoutubeSubscriber(youTubeChannel);
        youTubeChannel.addObserver(subscriberA);
        youTubeChannel.addObserver(subscriberB);
        youTubeChannel.addObserver(subscriberC);
        youTubeChannel.releaseNewVideo("Design Patterns : Factory Method");
        youTubeChannel.releaseNewVideo("Design Patterns : Proxy");
        youTubeChannel.releaseNewVideo("Design Patterns : Visitor");
    }
}
