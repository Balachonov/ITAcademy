package task06.t01main;

import task06.t01main.port.Port;

public class Runner {
    public void run() {
        Port port = new Port();

        System.out.println("����� ����� ��������� ���� � ��������� ����������� �� ��������� ������� � ��������� 10 " +
                "�������� ����� - " + port.totalMassWater() + " �����-�� ������.");

        System.out.println("�� ��� ������� ��� ����������, �� ��� ��.");
    }
}
