
class A extends Thread {
    public void run() {
        System.out.println("Thread A started");
        for (int i = 1; i <= 4; i++) {
            System.out.println("from thread A i=" + i);
        }
        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Thread B started");
        for (int j = 1; j <= 4; j++) {
            System.out.println("from thread B j=" + j);
        }
        System.out.println("exit from B");
    }
}

class C extends Thread {
    public void run() {
        System.out.println("thread c started");
        for (int k = 1; k <= 4; k++) {
            System.out.println("thread c=" + k);
        }
        System.out.println("exit from c");
    }
}

class ThreadPriority {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        // Setting priorities
        threadA.setPriority(Thread.MIN_PRIORITY); // Priority 1
        threadB.setPriority(Thread.NORM_PRIORITY); // Priority 5
        threadC.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Starting threads
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
