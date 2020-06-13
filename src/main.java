import java.nio.charset.Charset;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        class_ tempClass = new class_();
        tempClass.output();
        layout test = new layout();

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
        this.name = randomString();
        this.height = (int) (Math.random() * 100);
        this.weight = (int) (Math.random() * 100);
        this.className = randomString();
        this.phone = randomString();
        this.ID = randomString();
        System.out.println("done");
    }

    private String randomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
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
        System.out.println("phone:" + this.phone);
        System.out.println(this.ID);
        System.out.println();
    }


}

class class_ {
    Student[] aClass;

    public void output() {
        this.createClass();
        this.findStudent("xiaoming", "19052220");
        this.randomGetFive();
    }

    private void createClass() {
        this.aClass = new Student[30];
        for (int i = 0; i < this.aClass.length; i++) {
            this.aClass[i] = new Student();
        }
        this.aClass[0] = new Student("xiaoming", 180, 60, "19050522", "18969067887", "19052220");
    }

    private void findStudent(String name, String ID) {
        for (int i = 0; i < this.aClass.length; i++) {

            if (this.aClass[i].getName() == name && this.aClass[i].getID() == ID) {
                System.out.println("find");
                this.aClass[i].PersonalInfo();
                return;
            }
        }
        System.out.println("can't find");

    }

    private void randomGetFive() {
        for (int i = 0; i < 5; i++) {
            this.aClass[(int) (Math.random() * this.aClass.length / 5) + (i * this.aClass.length / 5)].PersonalInfo();
        }
    }
}
