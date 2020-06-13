public class main {
    public static void main(String[] args) {
        test tester = new test();
        tester.output();
    }
}

class Student {
    private String name;
    private double height;
    private double weight;
    private String className;
    private String phone;
    private String ID;

    public Student(String name,double height,double weight,String className,String phone,String ID){
        this.name = name;
        this.phone = phone;
        this.weight = weight;
        this.height = height;
        this.className = className;
        this.ID = ID;
    }

    public boolean isFat() {
        if (this.weight / (Math.pow((this.height / 100), 2)) > 24) {
            return true;
        }
        return false;
    }

    public void PersonalInfo(){
        System.out.println(this.name);
        System.out.println(this.height+"cm");
        System.out.println(this.weight+"kg");
        System.out.println(this.className+"班");
        System.out.println("phone"+this.phone);
        System.out.println(this.ID);
    }


}

class test {
    public void output(){
        Student xiaoming = new Student("xiaoming",180,60,"19050522","18969067887","19052220");
        xiaoming.PersonalInfo();
        System.out.println(xiaoming.isFat());
    }
}
