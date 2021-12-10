package exercises.accessmodifiers.access1;

class OuterClass {
    private int age = 34;

    void Age() {
        if (age >= 18) {
            System.out.println("Welcome");
        }
    }

    class InnerClass {
        private void canVote() {
            Age();
            System.out.println("Candidate Age = " + age);
        }

        protected void confirmVote() {
            canVote();
            System.out.println("Can cast vote");
        }

        void displayResult() {
            confirmVote();
            System.out.println("Voting Date:19.08.21");
        }

        public void showResult() {
            displayResult();
            System.out.println("Thank You");
        }

    }
}

public class NestedClass extends OuterClass {
    public static void main(String[] args) {
        OuterClass oclass = new OuterClass();
        OuterClass.InnerClass innerObject = oclass.new InnerClass();
        innerObject.showResult();
    }
}
