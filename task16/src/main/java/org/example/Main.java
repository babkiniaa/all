package org.example;

public class Main {
    public static void main(String[] args) {
    for (;;){

        PhiMen[] Men = new PhiMen[5];
        Object[] Forks = new Object[Men.length];

        for (int i = 0; i <Forks.length; i++) {
            Forks[i] = new Object();
        }

        for (int i = 0; i < Men.length; i++) {
            Object LeftFork = Forks[i];
            Object RightFork = Forks[(i + 1) % 5];

            if (i == Men.length - 1) {

                // The last philosopher picks up the right fork first
                Men[i] = new PhiMen(RightFork, LeftFork);
            } else {
                Men[i] = new PhiMen(LeftFork, RightFork);
            }

            Thread t = new Thread(Men[i], "Philosopher " + (i + 1));
            t.start();
        }
    }

    }

    public static class PhiMen implements org.example.PhiMen {
        Object LeftFork;
        Object RightFork;

        public PhiMen(Object LeftFork, Object RightFork){
            this.LeftFork = LeftFork;
            this.RightFork = RightFork;
        }

        @Override
        public void run(){
            try {
                for (;;) {
                    Action(System.nanoTime() + ": Пытается думать");
                    synchronized (LeftFork) {
                        Action(System.nanoTime() + ": Взял в левую руку вилку");
                        synchronized (RightFork) {
                            Action(System.nanoTime() + ": Взял правую руку - поел");

                            Action(System.nanoTime() + ": Положил правую вилку");
                        }
                        Action(System.nanoTime() + ": Положил левую вилку. Вернутся к раздумию");
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void Action(String Do) throws InterruptedException{
            System.out.println(Thread.currentThread().getName() + " " + Do);
            Thread.sleep(1000);
        }
    }
}