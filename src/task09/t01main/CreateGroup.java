package task09.t01main;

import task09.t01main.exception.ExceededNumberPeopleGroupException;
import task09.t01main.exception.IncorrectTeacherFirstNameException;
import task09.t01main.exception.WrongReligionGroupException;

import java.util.Scanner;

public class CreateGroup {

    public void createGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создадим группу.\nВведите имя преподавателя:");
        try {
            ITAcademyGroup.setTeacherName(String.valueOf(scanner.next()));
        } catch (IncorrectTeacherFirstNameException e) {
            System.err.println(e.getMessage() + " Взял все сломал :(");
        } finally {
            System.out.println("Ладно продолжим...");
        }
        try {
            System.out.println("Введите религию группы: ");
            String religionGroup = String.valueOf(scanner.next());
            System.out.println("Введите количество людей в группе: ");
            int peopleNumber = Integer.parseInt(scanner.next());
            if (religionGroup.equalsIgnoreCase("Православие") && peopleNumber == 14) {
                ITAcademyGroup.setReligion(religionGroup);
                ITAcademyGroup.setPeopleNumber(peopleNumber);
            } else if (!religionGroup.equalsIgnoreCase("Православие")) {
                throw new WrongReligionGroupException("Неверная религия.");
            } else if (!(peopleNumber == 14)) {
                throw new ExceededNumberPeopleGroupException("Неверное количество человек.");
            }
        } catch (WrongReligionGroupException | ExceededNumberPeopleGroupException e) {
            System.err.println(e.getMessage() + " Взял все сломал :(");
        } finally {
            System.out.println("Проверим, что ты создал");
        }

        if (ITAcademyGroup.getReligion() == null
                || ITAcademyGroup.getPeopleNumber() == 0
                || ITAcademyGroup.getTeacherName() == null) {
            System.out.println("Ты создал не группу, а абышо");
        } else {
            System.out.println("Ты сделал все правильно");
        }
    }

}
