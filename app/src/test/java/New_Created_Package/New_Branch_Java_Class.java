package New_Created_Package;

public class New_Branch_Java_Class {
    int x = 50, y = 60;
    String message = "RRR";
    String conflictMessage = "Branch to create conflict";

    public String getConflictMessage() {
        return conflictMessage;
    }

    public void setConflictMessage(String conflictMessage) {
        this.conflictMessage = conflictMessage;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public New_Branch_Java_Class(int x, int y, String message) {
        this.x = x;
        this.y = y;
        this.message = message;
    }
}
