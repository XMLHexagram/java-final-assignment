import java.io.*;
import java.util.Objects;

class User {
    String UserName;
    String Password;

    public User(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;
    }

    public User() {

    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}

public class UserAggregate {

    private User[] allUser;

    public UserAggregate() {
        readFromFile();
    }

    public void readFromFile() {
        this.allUser = new User[50];
        int j = 0, k = 0;
        StringBuilder tempName = new StringBuilder();
        StringBuilder tempPassword = new StringBuilder();

        String user = readToString("user");
        for (int i = 0; i < Objects.requireNonNull(user).length(); i++) {
            if (user.charAt(i) != '|' && user.charAt(i) != '\n' && user.charAt(i)!='\r') {
                switch (k) {
                    case 1:
                        tempName.append(user.charAt(i));
                        break;
                    case 2:
                        tempPassword.append(user.charAt(i));
                        break;
                    default:
                        break;
                }
            } else if (user.charAt(i) == '|') {
                k++;
            } else if (user.charAt(i) == '\n') {
                this.allUser[j] = new User();
//                System.out.println(aClass[i]);
                allUser[j].setUserName(String.valueOf(tempName));
                allUser[j].setPassword(String.valueOf(tempPassword));

                tempName.setLength(0);
                tempPassword.setLength(0);
                k = 0;
                j++;
            }
        }
        System.out.println(this.allUser[0].getPassword());
        System.out.println(this.allUser[0].getUserName());
    }

    public Boolean ChangePassword(String UserName,String OldPassword,String NewPassword) throws IOException {
        int No = 0;
        for (int i = 0; i < allUser.length && allUser[i] != null; i++) {
            if (UserName.equals(allUser[i].getUserName())){
                No = i;
                break;
            }
        }
        System.out.println("aa");
        System.out.println(allUser[No].getPassword());
        System.out.println("aa");
        if (OldPassword.equals(allUser[No].getPassword())){
            allUser[No].setPassword(NewPassword);
            WriteIntoFile();
            return true;
        }
        return false;
    }

    public void WriteIntoFile() throws IOException {
//        System.out.println("Stsesetsdg");
        StringBuilder toWrite= new StringBuilder();
        for (int i=0;i<allUser.length && allUser[i]!=null;i++){
            toWrite.append("|").append(allUser[i].getUserName()).append("|").append(allUser[i].getPassword()).append("\n");
        }

        System.out.println(toWrite);
        FileWriter f = new FileWriter("user");
        f.write(toWrite.toString());
        f.close();

    }

    public Boolean isHasRightUser(String tempUserName,String tempPassword) {
//        tempPassword+=" ";
//        System.out.printf("1");
//        System.out.println((int)allUser[0].getPassword().toCharArray()[6]);
//        System.out.printf("1");
        System.out.println(tempPassword);
        System.out.println(tempUserName);
        for (int i = 0; i < allUser.length && allUser[i] != null; i++) {
            if (tempPassword.equals(allUser[i].getPassword()) && tempUserName.equals(allUser[i].getUserName())){
                return true;
            }
        }
        return false;
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
}
