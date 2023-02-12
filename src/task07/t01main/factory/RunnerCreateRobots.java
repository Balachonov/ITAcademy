package task07.t01main.factory;

import java.util.Scanner;

public class RunnerCreateRobots {
    public void createRobot() {
        System.out.println("Сколько роботов создать?");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            Robot robot = new Robot();
            System.out.println("Робот №" + (i+1) + robot.robot());
        }
    }
}
