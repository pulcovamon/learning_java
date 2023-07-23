package tutorial_02;

public enum Level {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int level;

    private Level(int num) {
        this.level = num;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int num) {
        this.level = num;
    }
}
