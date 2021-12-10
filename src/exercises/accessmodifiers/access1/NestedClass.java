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

        private void helpMessage() {
            canVote();
            System.out.println("Can cast vote");
        }

        protected void confirmVote() {
            helpMessage();
            System.out.println("Day : Saturday");
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

    class Message extends InnerClass {
        private void message() {
            showResult();
            System.out.println("SOS");
        }

        void sos() {
            message();
            System.out.println("Contact for help");
        }
    }
}

public class NestedClass extends OuterClass {
    public static void main(String[] args) {
        OuterClass oclass = new OuterClass();
        OuterClass.Message msg = oclass.new Message();
        msg.sos();
    }
}
