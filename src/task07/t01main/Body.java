package task07.t01main;

public enum Body {
    FIRST_BODY ("первое тело"),
    SECOND_BODY ("второе тело"),
    THIRD_BODY ("третье тело");

    private String title;

    Body(String title) {
        this.title = title;
    }

    public String getBody() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
