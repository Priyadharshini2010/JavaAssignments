package exercises.accessmodifiers.access1;

public class PublicExample {
    public void display() {
        int giraffeCount = 6;
        int hippoCount = 7;
        int lionCount = 4;
        int TotalCount = giraffeCount + hippoCount + lionCount;
        System.out.println("Total Animal Count : " + TotalCount);
    }
}
