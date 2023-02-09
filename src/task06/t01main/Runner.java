package task06.t01main;

import task06.t01main.port.Port;

public class Runner {
    public void run() {
        Port port = new Port();

        System.out.println("Общая масса рандомной воды в рандомных контейнерах на рандомных палубах у рандомных 10 " +
                "кораблей равна - " + port.totalMassWater() + " каких-то единиц.");

        System.out.println("Не так конечно как планировал, но все же.");
    }
}
