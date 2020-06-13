import java.util.Random;

public class main {
    public static void main(String[] args) {
        SignInView frame = new SignInView();
        frame.setTitle("登录");
        frame.pack();
        frame.setVisible(true);


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

    @Override
    public String toString() {
        return "学号是: " + this.getID() + "\n" +
                "名字是: " + this.getName() + "\n" +
                "班级是: " + this.getClassName() + "\n" +
                "身高: " + this.getHeight() + "\n" +
                "体重 " + this.getWeight() + "\n" +
                "电话号码是: " + this.getPhone() + "\n";

//        return "Student{}";
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
    private Student[] aClass;

    public class_() {
        this.createClass();
    }

    public String output() {
        this.findStudent("xiaoming", "19052220");
        this.randomGetFive();
        String temp = "";
        for (int i = 0; i < aClass.length; i++) {
            temp = temp + aClass[i].toString() + "\n";
        }
        return temp;
    }

    private void createClass() {
        this.aClass = new Student[30];
        for (int i = 0; i < this.aClass.length; i++) {
            this.aClass[i] = new Student();
        }
        this.aClass[0] = new Student("xiaoming", 180, 60, "19050522", "18969067887", "19052220");
    }

    public void findStudent(String name, String ID) {
        for (int i = 0; i < this.aClass.length; i++) {

            if (this.aClass[i].getName() == name && this.aClass[i].getID() == ID) {
                System.out.println("find");
                this.aClass[i].PersonalInfo();
                return;
            }
        }
        System.out.println("can't find");

    }

    public String randomGetFive() {
        String temp = "";
        int[] repeat = new int[5];
        Boolean flag = true;
        int tempInt;
        int i;
        for (i = 0; i < 5; i++) {
            repeat[i] = 0;
        }
        i = 0;
        while (flag) {
//            System.out.println(Math.random());
//            System.out.println(this.aClass.length);
//            System.out.println(this.aClass);
            tempInt = (int) (Math.random() * this.aClass.length);
            for (int j = 0; j < 5; j++) {
                if (repeat[j] == tempInt) {
                    continue;
                }

            }
            repeat[i] = tempInt;
            if (i >= 4) {
                flag = false;
            }
            i++;
        }
        for (i = 0; i < 5; i++) {
            temp = temp + aClass[repeat[i]].toString() + "\n";
            System.out.println(repeat[i]+"\n");
        }
        return temp;
    }
}
