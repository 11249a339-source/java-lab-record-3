interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {

    public void showFather() {
        System.out.println("Father: Engineer");
    }

    public void showMother() {
        System.out.println("Mother: Teacher");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Child c = new Child();

        c.showFather();
        c.showMother();
    }
}
