package task02.t01main;

public class First {

    /**
    1. Создать два класса.
    2. Создать метод для запуска в одном классе. (метод main)
    3. Во втором классе создать глобальные переменные всех типов (примитивы и обертки).
    3.1 И для каждой глобальной переменной геттеры и сеттеры.
    4. В классе с методом для запуска создать глобальные переменные с различными типами (примитивами и обертками).
       А также в методе (main) создать локальные переменные (примитивы и обертки).
    5. Поэкспериментировать с присвоением переменных друг в друга и приведением типов, посмотреть какие ошибки получаться.
    6. Геттеры и сеттеры обязательно использовать, т.е. установить и получить значение.
    7. Вывести все переменные на консоль. (вывод на экран)
    8. Создавать классы, методы, переменные со всеми правилами именования.
    (code convention)
     */
    private byte someByteInFirst;
    private short someShortInFirst;
    private int someIntInFirst;
    private long someLongInFirst;
    private float someFloatInFirst;
    private double someDoubleInFirst;
    private char someCharInFirst;
    private boolean someBooleanInFirst;

    private Byte someWrapperByteInFirst;
    private Short someWrapperShortInFirst;
    private Integer someWrapperIntegerInFirst;
    private Long someWrapperLongInFirst;
    private Float someWrapperFloatInFirst;
    private Double someWrapperDoubleInFirst;
    private Character someWrapperCharacterInFirst;
    private Boolean someWrapperBooleanInFirst;

    public byte getSomeByteInFirst() {
        return someByteInFirst;
    }

    public void setSomeByteInFirst(byte someByteInFirst) {
        this.someByteInFirst = someByteInFirst;
    }

    public short getSomeShortInFirst() {
        return someShortInFirst;
    }

    public void setSomeShortInFirst(short someShortInFirst) {
        this.someShortInFirst = someShortInFirst;
    }

    public int getSomeIntInFirst() {
        return someIntInFirst;
    }

    public void setSomeIntInFirst(int someIntInFirst) {
        this.someIntInFirst = someIntInFirst;
    }

    public long getSomeLongInFirst() {
        return someLongInFirst;
    }

    public void setSomeLongInFirst(long someLongInFirst) {
        this.someLongInFirst = someLongInFirst;
    }

    public float getSomeFloatInFirst() {
        return someFloatInFirst;
    }

    public void setSomeFloatInFirst(float someFloatInFirst) {
        this.someFloatInFirst = someFloatInFirst;
    }

    public double getSomeDoubleInFirst() {
        return someDoubleInFirst;
    }

    public void setSomeDoubleInFirst(double someDoubleInFirst) {
        this.someDoubleInFirst = someDoubleInFirst;
    }

    public char getSomeCharInFirst() {
        return someCharInFirst;
    }

    public void setSomeCharInFirst(char someCharInFirst) {
        this.someCharInFirst = someCharInFirst;
    }

    public boolean isSomeBooleanInFirst() {
        return someBooleanInFirst;
    }

    public void setSomeBooleanInFirst(boolean someBooleanInFirst) {
        this.someBooleanInFirst = someBooleanInFirst;
    }

    public Byte getSomeWrapperByteInFirst() {
        return someWrapperByteInFirst;
    }

    public void setSomeWrapperByteInFirst(Byte someWrapperByteInFirst) {
        this.someWrapperByteInFirst = someWrapperByteInFirst;
    }

    public Short getSomeWrapperShortInFirst() {
        return someWrapperShortInFirst;
    }

    public void setSomeWrapperShortInFirst(Short someWrapperShortInFirst) {
        this.someWrapperShortInFirst = someWrapperShortInFirst;
    }

    public Integer getSomeWrapperIntegerInFirst() {
        return someWrapperIntegerInFirst;
    }

    public void setSomeWrapperIntegerInFirst(Integer someWrapperIntegerInFirst) {
        this.someWrapperIntegerInFirst = someWrapperIntegerInFirst;
    }

    public Long getSomeWrapperLongInFirst() {
        return someWrapperLongInFirst;
    }

    public void setSomeWrapperLongInFirst(Long someWrapperLongInFirst) {
        this.someWrapperLongInFirst = someWrapperLongInFirst;
    }

    public Float getSomeWrapperFloatInFirst() {
        return someWrapperFloatInFirst;
    }

    public void setSomeWrapperFloatInFirst(Float someWrapperFloatInFirst) {
        this.someWrapperFloatInFirst = someWrapperFloatInFirst;
    }

    public Double getSomeWrapperDoubleInFirst() {
        return someWrapperDoubleInFirst;
    }

    public void setSomeWrapperDoubleInFirst(Double someWrapperDoubleInFirst) {
        this.someWrapperDoubleInFirst = someWrapperDoubleInFirst;
    }

    public Character getSomeWrapperCharacterInFirst() {
        return someWrapperCharacterInFirst;
    }

    public void setSomeWrapperCharacterInFirst(Character someWrapperCharacterInFirst) {
        this.someWrapperCharacterInFirst = someWrapperCharacterInFirst;
    }

    public Boolean getSomeWrapperBooleanInFirst() {
        return someWrapperBooleanInFirst;
    }

    public void setSomeWrapperBooleanInFirst(Boolean someWrapperBooleanInFirst) {
        this.someWrapperBooleanInFirst = someWrapperBooleanInFirst;
    }

    public static void main(String[] args) {
        byte someLocalByte = -1;
        short someLocalShort = -1;
        int someLocalInt = -1;
        long someLocalLong = -1L;
        float someLocalFloat = -1.0f;
        double someLocalDouble = -1.0;
        char someLocalChar = '0';
        boolean someLocalBoolean = false;

        Byte someLocalWrapperByte = 1;
        Short someLocalWrapperShort = 1;
        Integer someLocalWrapperInteger = 1;
        Long someLocalWrapperLong = 1L;
        Float someLocalWrapperFloat = 1.0f;
        Double someLocalWrapperDouble = 1.0;
        Character someLocalWrapperCharacter = '1';
        Boolean someLocalWrapperBoolean = true;

        Second second = new Second();
        second.setSomeByteInSecond((byte) 127);
        second.setSomeShortInSecond((short) 32_767);
        second.setSomeIntInSecond(2_147_483_647);
        second.setSomeLongInSecond(9_223_372_036_854_775_807L);
        second.setSomeFloatInSecond(3.40282347E38f);
        second.setSomeDoubleInSecond(1.79769313486231570E308);
        second.setSomeCharInSecond('A');
        second.setSomeBooleanInSecond(true);
        second.setSomeWrapperByteInSecond((byte) -128);
        second.setSomeWrapperShortInSecond((short) -32_768);
        second.setSomeWrapperIntegerInSecond(- 2_147_483_648);
        second.setSomeWrapperLongInSecond(-9_223_372_036_854_775_808L);
        second.setSomeWrapperFloatInSecond(- 3.40282347E38f);
        second.setSomeWrapperDoubleInSecond(- 1.79769313486231570E308);
        second.setSomeWrapperCharacterInSecond('B');
        second.setSomeWrapperBooleanInSecond(false);

        First first = new First();
        first.setSomeByteInFirst((byte) 127);
        first.setSomeShortInFirst((short) 32_767);
        first.setSomeIntInFirst(2_147_483_647);
        first.setSomeLongInFirst(9_223_372_036_854_775_807L);
        first.setSomeFloatInFirst(3.40282347E38f);
        first.setSomeDoubleInFirst(1.79769313486231570E308);
        first.setSomeCharInFirst('C');
        first.setSomeBooleanInFirst(true);
        first.setSomeWrapperByteInFirst((byte) -128);
        first.setSomeWrapperShortInFirst((short) -32_768);
        first.setSomeWrapperIntegerInFirst(- 2_147_483_648);
        first.setSomeWrapperLongInFirst(-9_223_372_036_854_775_808L);
        first.setSomeWrapperFloatInFirst(- 3.40282347E38f);
        first.setSomeWrapperDoubleInFirst(- 1.79769313486231570E308);
        first.setSomeWrapperCharacterInFirst('D');
        first.setSomeWrapperBooleanInFirst(false);

        System.out.printf("""
                        Глобальные примитивные переменные класса Second объекта second:
                        byte - %s
                        short - %s
                        int - %s
                        long - %s
                        float - %s
                        double - %s
                        char - %s
                        boolean - %s
                        *********
                        """,
                second.getSomeByteInSecond(), second.getSomeShortInSecond(),second.getSomeIntInSecond(),
                second.getSomeLongInSecond(), second.getSomeFloatInSecond(),second.getSomeDoubleInSecond(),
                second.getSomeCharInSecond(), second.isSomeBooleanInSecond());

        System.out.printf("""
                        Глобальные классы-обертки класса Second объекта second:
                        Byte - %s
                        Short - %s
                        Integer - %s
                        Long - %s
                        Float - %s
                        Double - %s
                        Character - %s
                        Boolean - %s
                        *********
                        """,
                second.getSomeWrapperByteInSecond(),second.getSomeWrapperShortInSecond(),
                second.getSomeWrapperIntegerInSecond(), second.getSomeWrapperLongInSecond(),
                second.getSomeWrapperFloatInSecond(),second.getSomeWrapperDoubleInSecond(),
                second.getSomeWrapperCharacterInSecond(),second.getSomeWrapperBooleanInSecond());

        System.out.printf("""
                        Глобальные примитивные переменные класса First объекта first:
                        byte - %s
                        short - %s
                        int - %s
                        long - %s
                        float - %s
                        double - %s
                        char - %s
                        boolean - %s
                        *********
                        """,
                first.getSomeByteInFirst(), first.getSomeShortInFirst(),first.getSomeIntInFirst(),
                first.getSomeLongInFirst(), first.getSomeFloatInFirst(),first.getSomeDoubleInFirst(),
                first.getSomeCharInFirst(), first.isSomeBooleanInFirst());

        System.out.printf("""
                        Глобальные классы-обертки класса First объекта first:
                        Byte - %s
                        Short - %s
                        Integer - %s
                        Long - %s
                        Float - %s
                        Double - %s
                        Character - %s
                        Boolean - %s
                        *********
                        """,
                first.getSomeWrapperByteInFirst(),first.getSomeWrapperShortInFirst(),
                first.getSomeWrapperIntegerInFirst(), first.getSomeWrapperLongInFirst(),
                first.getSomeWrapperFloatInFirst(),first.getSomeWrapperDoubleInFirst(),
                first.getSomeWrapperCharacterInFirst(),first.getSomeWrapperBooleanInFirst());

        System.out.printf("""
                        Локальные примитивные переменные метода main:
                        byte - %s
                        short - %s
                        int - %s
                        long - %s
                        float - %s
                        double - %s
                        char - %s
                        boolean - %s
                        *********
                        """,
                someLocalByte, someLocalShort, someLocalInt, someLocalLong, someLocalFloat, someLocalDouble,
                someLocalChar, someLocalBoolean);

        System.out.printf("""
                        Локальные классы-обертки метода main:
                        Byte - %s
                        Short - %s
                        Integer - %s
                        Long - %s
                        Float - %s
                        Double - %s
                        Character - %s
                        Boolean - %s
                        *********
                        """,
                someLocalWrapperByte, someLocalWrapperShort, someLocalWrapperInteger, someLocalWrapperLong,
                someLocalWrapperFloat, someLocalWrapperDouble, someLocalWrapperCharacter, someLocalWrapperBoolean);

        someLocalByte = (byte) (someLocalShort = (short) (someLocalInt = (int) someLocalLong));
        someLocalLong = someLocalInt = someLocalShort = someLocalByte;


    }
}