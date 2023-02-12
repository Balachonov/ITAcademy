package task07.t01main.entities;

public enum Head {
    FIRST_HEAD ("первая голова"),
    SECOND_HEAD ("вторая голова"),
    THIRD_HEAD ("третья голова");

    private String title;

    Head(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
