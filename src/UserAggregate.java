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
            if (user.charAt(i) != '|' && user.charAt(i) != '\n') {
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

    public Boolean isHasRightUser(String tempUserName,String tempPassword) {
        System.out.println(2);
        for (int i = 0; i < allUser.length && allUser[i] != null; i++) {
            System.out.println(1);
            if (tempPassword.equals(allUser[i].getPassword()) && tempUserName.equals(allUser[i].getPassword())){
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
