package task07.t01main;

import java.util.Random;

public class SecondRoboFactory implements ChoicePart <Head>{

    private Head head = choiceRoboPart(Head.values());

    @Override
    public Head choiceRoboPart(Object[] part) {
        return (Head) part[new Random().nextInt(part.length)];
    }

    public Head getHead() {
        return head;
    }
}
