import java.util.Arrays;

public class Personenkreis {

    public static void main(String[] args) {
        Circle c = new Circle(10000);
        c.killEveryThird();
        c.out();
    }


    private static class Circle {

        private final int n;
        private boolean[] persons;
        private int[] survivors;
        private int peopleAlive;


        public Circle(int n) {
            this.n = n;
            peopleAlive = n;
            persons = new boolean[this.n];
            Arrays.fill(persons, true);
        }

        public void killEveryThird() {
            int x = 1;
            int lastIndex = 0;
            while (peopleAlive > 2) {
                for (int i = 0; i < n; i++) {
                    if (persons[i]) {
                        if (x % 3 == 0) {
                            kill(i);
                        }
                        x++;
                    }
                }
            }
        }

        public void out() {
            for (int i = 0; i < n; i++) {
                if (persons[i]) {
                    System.out.print((1 + i) + " | ");
                }
            }
            System.out.print("\n");
        }

        public void kill(int i) {
            persons[i] = false;
            peopleAlive--;
        }
    }
}

