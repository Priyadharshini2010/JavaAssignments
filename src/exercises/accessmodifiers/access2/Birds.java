package exercises.accessmodifiers.access2;

import exercises.accessmodifiers.access1.Animals;

public class Birds extends Animals {
    public static void main(String[] args) {
        Birds b1 = new Birds();
        b1.animalCount();
        int hippo = b1.hippoCount;
        System.out.println(hippo);
    }

}
