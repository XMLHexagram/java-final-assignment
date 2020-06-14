import java.util.Random;

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
