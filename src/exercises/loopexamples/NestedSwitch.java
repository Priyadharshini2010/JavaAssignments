package exercises.loopexamples;

public class NestedSwitch {
    public static void main(String[] args) {
        char animal = 'S';
        String animalType = "Reptile";
        switch (animalType) {
            case "Mammals":
                System.out.println("Elephant");
                break;
            case "Birds":
                switch (animal) {
                    case 'W':
                        System.out.println("Woodpecker");
                        break;
                    case 'O':
                        System.out.println("Owl");
                        break;
                    case 'H':
                        System.out.println("Humming Bird");
                        break;
                }
                break;
            case "Reptile":
                switch (animal) {
                    case 'S':
                        System.out.println("Snake");
                        break;
                    case 'L':
                        System.out.println("Lizards");
                        break;
                    case 'T':
                        System.out.println("Turtles");
                        break;
                }
                break;
            case "Aquatic":
                switch (animal) {
                    case 'O':
                        System.out.println("Octopus");
                        break;
                    case 'E':
                        System.out.println("Eel Fish");
                        break;
                    case 'S':
                        System.out.println("Sea Horse");
                        break;
                }
                break;
        }
    }
}
