package task07.t01main;

public enum Head {
    FIRST_HEAD ("первая голова"),
    SECOND_HEAD ("вторая голова"),
    THIRD_HEAD ("третья голова");

    private String title;

    Head(String title) {
        this.title = title;
    }

    public String getHead() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
