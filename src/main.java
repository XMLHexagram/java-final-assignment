public class main {
    public static void main(String[] args) {
        System.out.printf("test");
    }
}

class Student {
    private String name;
    private double height;
    private double weight;
    private String className;
    private String phone;
    private String ID;

    public boolean isFat() {
        if (this.weight / (Math.pow((this.height / 100), 2)) > 24) {
            return true;
        }
        return false;
    }
}
