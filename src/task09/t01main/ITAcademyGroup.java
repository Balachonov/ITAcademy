package task09.t01main;

import task09.t01main.exception.ExceededNumberPeopleGroupException;
import task09.t01main.exception.IncorrectTeacherFirstNameException;
import task09.t01main.exception.WrongReligionGroupException;

public class ITAcademyGroup {

    private static String teacherName;
    private static String religion;
    private static int peopleNumber;

    public static void setTeacherName(String teacherName) throws IncorrectTeacherFirstNameException {
        if (teacherName.equalsIgnoreCase("Александр") || teacherName.equalsIgnoreCase("Саша")) {
            ITAcademyGroup.teacherName = teacherName;
            System.out.println("Имя преподавателя - " + ITAcademyGroup.teacherName);
        } else {
            throw new IncorrectTeacherFirstNameException("Неверное имя.");
        }
    }

    public static void setReligion(String religion) {
        ITAcademyGroup.religion = religion;
    }

    public static void setPeopleNumber(int peopleNumber) {
        ITAcademyGroup.peopleNumber = peopleNumber;
    }

    public static int getPeopleNumber() {
        return peopleNumber;
    }

    public static String getTeacherName() {
        return teacherName;
    }

    public static String getReligion() {
        return religion;
    }
}
