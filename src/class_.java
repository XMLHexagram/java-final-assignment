import java.io.*;
import java.util.Objects;
import java.util.function.BiFunction;

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
                        System.out.println("test：" + tempHeight);
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

    public void changeOne(Student temp) throws IOException {
        for (int i = 0; i < aClass.length && aClass[i] != null; i++) {
            if (temp.getID().equals(aClass[i].getID())) {
                aClass[i] = temp;
                break;
            }
        }
        WriteIntoFile();
    }

    public boolean deleteOne(String tempID) throws IOException {
        for (int i = 0; i < aClass.length && aClass[i] != null; i++) {
            if (aClass[i].getID().equals(tempID)){
                aClass = delete(i, aClass);
                WriteIntoFile();
                return true;
            }
        }
        return false;
    }

    public Student[] delete(int index, Student array[]) {
        Student[] arrNew = new Student[array.length - 1];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        System.arraycopy(array, 0, arrNew, 0, arrNew.length);
        return arrNew;
    }

    public void WriteIntoFile() throws IOException {
        StringBuilder toWrite = new StringBuilder();
        for (int i = 0; i < aClass.length && aClass[i] != null; i++) {
            toWrite.append("|").
                    append(aClass[i].getName()).
                    append("|").
                    append(aClass[i].getHeight()).
                    append("|").
                    append(aClass[i].getWeight()).
                    append("|").
                    append(aClass[i].getClass()).
                    append("|").
                    append(aClass[i].getPhone()).
                    append("|").
                    append(aClass[i].getID()).
                    append("|").
                    append(aClass[i].getEnglish()).
                    append("|").
                    append(aClass[i].getChinese()).
                    append("|").
                    append(aClass[i].getMath()).
                    append("|").
                    append(aClass[i].getPhysics()).
                    append("|").
                    append(aClass[i].getChemical()).
                    append("|").
                    append(aClass[i].getBiology()).
                    append("|").
                    append(aClass[i].getHistory()).
                    append("|").
                    append(aClass[i].getComputer()).
                    append("|").
                    append(aClass[i].getSports()).
                    append("|").
                    append(aClass[i].getWorld()).
                    append("\n");
        }

        System.out.println(toWrite);
        FileWriter f = new FileWriter("store");
        f.write(toWrite.toString());
        f.close();

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
//        this.findStudent("xiaoming", "19052220");
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

    public Student findStudent(String ID) {
        for (int i = 0; i < this.aClass.length && this.aClass[i] != null; i++) {

            if (this.aClass[i].getID().equals(ID)) {
//                System.out.println("find");
//                this.aClass[i].PersonalInfo();
                return this.aClass[i];
            }
        }
        System.out.println("can't find");
        return null;
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
