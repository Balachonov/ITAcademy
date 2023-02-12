package task07.t01main.factory;

import task07.t01main.entities.Body;
import task07.t01main.entities.ChoicePart;

import java.util.Random;

public class FirstRoboFactory implements ChoicePart<Body> {
    private Body body = choiceRoboPart(Body.values());

    @Override
    public Body choiceRoboPart(Object[] part) {
        return (Body) part[new Random().nextInt(part.length)];
    }

    public Body getBody() {
        return body;
    }
}
