import java.io.*;
import java.util.Objects;
import java.util.Random;
import java.util.function.BiFunction;

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

    public class_(BiFunction<String, Integer, Character> biFunction) throws IOException {
//        this.createClass();
        this.aClass = new Student[50];
        int j = 0, k = 0;
        String temp;
        StringBuilder tempName = new StringBuilder();
        StringBuilder tempHeight = new StringBuilder();
        StringBuilder tempWeight = new StringBuilder();
        StringBuilder tempClassName = new StringBuilder();
        StringBuilder tempPhone = new StringBuilder();
        StringBuilder tempID = new StringBuilder();

        String json = readToString("store");
        for (int i = 0; i < Objects.requireNonNull(json).length(); i++) {
            if (json.charAt(i) != '|' && json.charAt(i) != '\n') {
                switch (k) {
                    case 1:
                        tempName.append(json.charAt(i));
                        break;
                    case 2:
                        tempHeight.append(json.charAt(i));
                        break;
                    case 3:
                        tempWeight.append(json.charAt(i));
                        break;
                    case 4:
                        tempClassName.append(json.charAt(i));
                        break;
                    case 5:
                        tempPhone.append(json.charAt(i));
                        break;
                    case 6:
                        tempID.append(json.charAt(i));
                        break;
                    default:
                        break;
                }
            } else if (json.charAt(i) == '|') {
                k++;
            } else if (json.charAt(i) == '\n') {
                this.aClass[j] = new Student();
                System.out.println(tempName);
//                System.out.println(aClass[i]);
                aClass[j].setName(String.valueOf(tempName));
                aClass[j].setHeight(Double.parseDouble(String.valueOf(tempHeight)));
                aClass[j].setWeight(Double.parseDouble(String.valueOf(tempWeight)));
                aClass[j].setClassName(String.valueOf(tempClassName));
                aClass[j].setPhone(String.valueOf(tempPhone));
                aClass[j].setID(String.valueOf(tempID));

                tempName.setLength(0);
                tempClassName.setLength(0);
                tempHeight.setLength(0);
                tempWeight.setLength(0);
                tempClassName.setLength(0);
                tempPhone.setLength(0);
                tempID.setLength(0);
                k = 0;
                j++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println(aClass[15]);
    }

    public static String readToString(String fileName) {
        String encoding = "UTF-8";
        File file = new File(fileName);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }

    public String output() {
        this.findStudent("xiaoming", "19052220");
//        this.randomGetFive();
        String temp = "";
        for (int i = 0; i < aClass.length && this.aClass[i] != null; i++) {
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
        for (int i = 0; i < this.aClass.length && this.aClass[i] != null; i++) {

            if (this.aClass[i].getName().equals(name) && this.aClass[i].getID().equals(ID)) {
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
        int realLength = 0;
        for (i=0;aClass[i]!=null;i++){
            realLength = i;
        }
        for (i = 0; i < 5; i++) {
            repeat[i] = 0;
        }
        i = 0;
        while (flag) {
//            System.out.println(Math.random());
//            System.out.println(this.aClass.length);
//            System.out.println(this.aClass);
            tempInt = (int) (Math.random() * realLength);
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
            System.out.println(repeat[i] + "\n");
        }
        return temp;
    }
}
