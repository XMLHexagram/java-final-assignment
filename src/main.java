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
    private String name;
    private double height;
    private double weight;
    private String className;
    private String phone;
    private String ID;
    private double English;
    private double Chinese;
    private double Math;
    private double Physics;
    private double chemical;
    private double Biology;
    private double History;
    private double Computer;
    private double Sports;
    private double World;

    public double getEnglish() {
        return English;
    }

    public void setEnglish(double english) {
        English = english;
    }

    public double getChinese() {
        return Chinese;
    }

    public void setChinese(double chinese) {
        Chinese = chinese;
    }

    public double getMath() {
        return Math;
    }

    public void setMath(double math) {
        Math = math;
    }

    public double getPhysics() {
        return Physics;
    }

    public void setPhysics(double physics) {
        Physics = physics;
    }

    public double getChemical() {
        return chemical;
    }

    public void setChemical(double chemical) {
        this.chemical = chemical;
    }

    public double getBiology() {
        return Biology;
    }

    public void setBiology(double biology) {
        Biology = biology;
    }

    public double getHistory() {
        return History;
    }

    public void setHistory(double history) {
        History = history;
    }

    public double getComputer() {
        return Computer;
    }

    public void setComputer(double computer) {
        Computer = computer;
    }

    public double getSports() {
        return Sports;
    }

    public void setSports(double sports) {
        Sports = sports;
    }

    public double getWorld() {
        return World;
    }

    public void setWorld(double world) {
        World = world;
    }


    public Student() {
        this.name = randomString();
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
        return "\t学号是: \t" + this.getID() + "\n\t" +
                "名字是: \t" + this.getName() + "\n\t" +
                "班级是: \t" + this.getClassName() + "\n\t" +
                "身高: \t" + this.getHeight() + "\n\t" +
                "体重 \t" + this.getWeight() + "\n\t" +
                "电话号码是: \t" + this.getPhone() + "\n\t" +
                "英语成绩 \t" + this.getEnglish() + "\n\t" +
                "数学成绩 \t" + this.getMath() + "\n\t" +
                "世界学成绩 \t" + this.getWorld() + "\n\t" +
                "计算机成绩 \t" + this.getComputer() + "\n\t" +
                "语文成绩 \t" + this.getChinese() + "\n\t" +
                "化学成绩 \t" + this.getChemical() + "\n\t" +
                "物理成绩 \t" + this.getPhysics() + "\n\t" +
                "体育成绩 \t" + this.getSports() + "\n\t" +
                "生物成绩 \t" + this.getBiology() + "\n\t" +
                "历史成绩: \t" + this.getHistory() + "\n\t";

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
        if (this.weight / ((this.height / 100) * (this.height / 100)) > 24) {
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
        readFromFile();
    }

    public void readFromFile() {
        this.aClass = new Student[50];
        int j = 0, k = 0;
        StringBuilder tempName = new StringBuilder();
        StringBuilder tempHeight = new StringBuilder();
        StringBuilder tempWeight = new StringBuilder();
        StringBuilder tempClassName = new StringBuilder();
        StringBuilder tempPhone = new StringBuilder();
        StringBuilder tempID = new StringBuilder();

        StringBuilder English = new StringBuilder();
        StringBuilder Chinese = new StringBuilder();
        StringBuilder Math = new StringBuilder();
        StringBuilder Physics = new StringBuilder();
        StringBuilder chemical = new StringBuilder();
        StringBuilder Biology = new StringBuilder();
        StringBuilder History = new StringBuilder();
        StringBuilder Computer = new StringBuilder();
        StringBuilder Sports = new StringBuilder();
        StringBuilder World = new StringBuilder();

        String json = readToString("store");
        for (int i = 0; i < Objects.requireNonNull(json).length(); i++) {
            if (json.charAt(i) != '|' && json.charAt(i) != '\n' && json.charAt(i) != '\r') {
                switch (k) {
                    case 1:
                        tempName.append(json.charAt(i));
                        break;
                    case 2:
                        tempHeight.append(json.charAt(i));
                        System.out.println("test："+tempHeight);
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
                    case 7:
                        English.append(json.charAt(i));
                        break;
                    case 8:
                        Chinese.append(json.charAt(i));
                        break;
                    case 9:
                        Math.append(json.charAt(i));
                        break;
                    case 10:
                        Physics.append(json.charAt(i));
                        break;
                    case 11:
                        chemical.append(json.charAt(i));
                        break;
                    case 12:
                        Biology.append(json.charAt(i));
                        break;
                    case 13:
                        History.append(json.charAt(i));
                        break;
                    case 14:
                        Computer.append(json.charAt(i));
                        break;
                    case 15:
                        Sports.append(json.charAt(i));
                        break;
                    case 16:
                        World.append(json.charAt(i));
                        break;
                    default:
                        break;
                }
            } else if (json.charAt(i) == '|') {
                k++;
            } else if (json.charAt(i) == '\n') {
                this.aClass[j] = new Student();
//                System.out.println(tempName);
//                System.out.println(aClass[i]);
//                System.out.println("aaa:"+tempName);
//                System.out.println("asdf:"+tempHeight);
                aClass[j].setName(String.valueOf(tempName));
                aClass[j].setHeight(Double.parseDouble(String.valueOf(tempHeight)));
                aClass[j].setWeight(Double.parseDouble(String.valueOf(tempWeight)));
                aClass[j].setClassName(String.valueOf(tempClassName));
                aClass[j].setPhone(String.valueOf(tempPhone));
                aClass[j].setID(String.valueOf(tempID));


                aClass[j].setEnglish(Double.parseDouble(String.valueOf(English)));
                aClass[j].setChinese(Double.parseDouble(String.valueOf(Chinese)));
                aClass[j].setMath(Double.parseDouble(String.valueOf(Math)));
                aClass[j].setPhysics(Double.parseDouble(String.valueOf(Physics)));
                aClass[j].setChemical(Double.parseDouble(String.valueOf(chemical)));
                aClass[j].setBiology(Double.parseDouble(String.valueOf(Biology)));
                aClass[j].setHistory(Double.parseDouble(String.valueOf(History)));
                aClass[j].setComputer(Double.parseDouble(String.valueOf(Computer)));
                aClass[j].setSports(Double.parseDouble(String.valueOf(Sports)));
                aClass[j].setWorld(Double.parseDouble(String.valueOf(World)));

                tempName.setLength(0);
                tempClassName.setLength(0);
                tempHeight.setLength(0);
                tempWeight.setLength(0);
                tempClassName.setLength(0);
                tempPhone.setLength(0);
                tempID.setLength(0);

                English.setLength(0);
                Chinese.setLength(0);
                Math.setLength(0);
                Physics.setLength(0);
                chemical.setLength(0);
                Biology.setLength(0);
                History.setLength(0);
                Computer.setLength(0);
                Sports.setLength(0);
                World.setLength(0);
                k = 0;
                j++;
            }
        }
//        System.out.println();
//        System.out.println();
//        System.out.println(aClass[15]);

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
        for (i = 0; aClass[i] != null; i++) {
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
