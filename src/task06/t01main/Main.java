package task06.t01main;

import java.awt.*;
import java.util.Random;

/**
 * 0.   ������������ �������� (����, �������, ������, ���������)
 * 1.	���� - 10 ��������.
 * 2.	� ���� ���������� ������� (������������ � ������������), �� ���� ������ ���������� ��� ��� ������� ����������
 * ��� 4 ���������.
 * 3.	���������� ����� ���� ������ ����� (��������������, ����������, �������).
 * ���������� ��������� �����(� ���������� 1000 � 2000 ������, �.� ����� �������� ������ ����. ��������� ���������);
 * 4.	����� ����� �� ����� � ���� ��������� ������ �������: � ������� ������������, ������ �����, � ������ �������
 * ����������� (�� ����� 100 ������ � �� ������ 10).
 * 5.	��������� ������ � �������� - ��������� (�������) 20 � �������� � 10 � ����������. � � ����������� � ����������
 * 20 � �������� � 10 � ���������� ��������.
 * 6.	��������� ������ �������� ����� ����� ���� ������� �������� ��� �������.
 * �������������� ������������:
 * �� �������� ��� ������ � ��������� �����. ������� ������ ���� � ���� �����.
 * �� ��� ������ public. ����� ������������ �������. ���������� ����� � ������ ������ ���� ������ put (��� add) � remove
 * (��� delete). ��� ����������� ������� ���������� ������������ ���� ��� ������ �������� . � ������� ������ ���� ���.
 * �������� �� �����.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(100, 101));
    }
}