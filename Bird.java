package tutorial;

class Bird {
    void fly() {
        System.out.println("Bird can fly.");
    }

    public static void main(String[] args) {
        // Array of Bird references
        Bird[] birds = new Bird[3];

        birds[0] = new Bird();
        birds[1] = new Sparrow();
        birds[2] = new Eagle();

        // Dynamic method dispatch
        for (Bird b : birds) {
            b.fly();
        }
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flies short distances.");
    }
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}