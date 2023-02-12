package task07.t01main.factory;

public class Robot {
    FirstRoboFactory firstRoboFactory = new FirstRoboFactory();
    SecondRoboFactory secondRoboFactory = new SecondRoboFactory();
    public String robot() {
        return " состоит из: " + firstRoboFactory.getBody() + " и " + secondRoboFactory.getHead();
    }
}
