public class main {
    public static void main(String[] args) {
        test tester = new test();
        tester.output();
    }
}

class Student {
    private String name = "test";
    private double height = 99;
    private double weight = 99;
    private String className = "testClass";
    private String phone = "122251234";
    private String ID = "134145123";

    public Student() {
        System.out.println("done");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Student(String name, double height, double weight, String className, String phone, String ID) {
        this.name = name;
        this.phone = phone;
        this.weight = weight;
        this.height = height;
        this.className = className;
        this.ID = ID;
        System.out.println("done");
    }

    public boolean isFat() {
        if (this.weight / (Math.pow((this.height / 100), 2)) > 24) {
            return true;
        }
        return false;
    }

    public void PersonalInfo() {
        System.out.println(this.name);
        System.out.println(this.height + "cm");
        System.out.println(this.weight + "kg");
        System.out.println(this.className + "班");
        System.out.println("phone" + this.phone);
        System.out.println(this.ID);
        System.out.println();
    }


}

class test {
    Student[] aClass;

    public void output() {
        this.createClass();
        this.findStudent("xiaoming","19052220");

    }

    private void createClass(){
        this.aClass = new Student[3];
        for (int i = 0; i < this.aClass.length; i++) {
            this.aClass[i] = new Student();
            this.aClass[i].PersonalInfo();
        }
        this.aClass[0]= new Student("xiaoming",180,60,"19050522","18969067887","19052220");
    }

    private void findStudent(String name,String ID){
        for (int i = 0; i < this.aClass.length; i++) {

            if (this.aClass[i].getName() == name && this.aClass[i].getID() == ID){
                System.out.println("find");
                this.aClass[i].PersonalInfo();
                return;
            }
        }
        System.out.println("can't find");

    }
}
