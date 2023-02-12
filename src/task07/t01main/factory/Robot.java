package task07.t01main.factory;

import task07.t01main.entities.Body;
import task07.t01main.entities.ChoicePart;
import task07.t01main.entities.Head;

import java.util.Random;

public class Robot {

    String name = createName();
    BodyRoboFactory bodyRoboFactory = new BodyRoboFactory();
    HeadRoboFactory headRoboFactory = new HeadRoboFactory();

    public String createRobot() {
        return "Робота зовут " + name + ". Он состоит из: " + bodyRoboFactory.getBody() + " и " + headRoboFactory.getHead();
    }

    private String createName() {
        Random random = new Random();
        char[] consonantLetters = {'б', 'в', 'г', 'д', 'ж', 'з', 'к', 'л', 'м', 'н', 'п', 'р',
                'с', 'т'};
        char[] vowelLetters = {'а', 'е', 'ё', 'и', 'о', 'у', 'я'};
        char[] name = new char[random.nextInt(2, 8)];
        for (int i = 0; i < name.length; i = i + 2) {
            name[i] = consonantLetters[random.nextInt(0, consonantLetters.length)];
        }
        for (int i = 1; i < name.length; i = i + 2) {
            name[i] = vowelLetters[random.nextInt(0, vowelLetters.length)];
        }
        name[0] = Character.toUpperCase(name[0]);
        return (random.nextInt(2) == 0) ? (String.valueOf(name)) : (String.valueOf(name)+ "-" + random.nextInt(0, 7000));
    }

    private class BodyRoboFactory implements ChoicePart<Body> {
        private Body body = choiceRoboPart(Body.values());

        @Override
        public Body choiceRoboPart(Object[] part) {
            return (Body) part[new Random().nextInt(part.length)];
        }

        public Body getBody() {
            return body;
        }
    }

    private class HeadRoboFactory implements ChoicePart<Head> {

        private Head head = choiceRoboPart(Head.values());

        @Override
        public Head choiceRoboPart(Object[] part) {
            return (Head) part[new Random().nextInt(part.length)];
        }

        public Head getHead() {
            return head;
        }
    }
}
