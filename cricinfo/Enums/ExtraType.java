package cricinfo.Enums;

public enum ExtraType {
    NOBALL(1),
    WIDEBALL(1),
    LEGBYES(1),
    BYES(1);

    public int value;

    ExtraType(int value) {
        this.value = value;
    }
}
