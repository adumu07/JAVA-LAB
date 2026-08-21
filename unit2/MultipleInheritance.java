interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {

    public void showFather() {
        System.out.println("Father's property");
    }

    public void showMother() {
        System.out.println("Mother's property");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Child obj = new Child();

        obj.showFather();
        obj.showMother();
    }
}