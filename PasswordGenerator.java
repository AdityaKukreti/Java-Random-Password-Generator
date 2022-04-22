import java.util.Random;

public class PasswordGenerator {
    int currentValue;
    Random random = new Random();


    private String mixedCasePassGenerator(String password,int length){
        String mixedCasePassword = "";
        for (int i = 0; i < length; i++){
            currentValue = random.nextInt(2);
            if (currentValue == 0){
                mixedCasePassword = mixedCasePassword + password.charAt(i);
            } else {
                mixedCasePassword = mixedCasePassword + (char)((int)password.charAt(i) + 32);
            }
        }
        return mixedCasePassword;
        }


    public String alphabetPasswordGenerator(int length, String type){
        String password = "";
        for (int i = 0; i < length; i++){
            currentValue = random.nextInt(26) + 65;
            password = password + (char)currentValue;
        }
        if (type.equals("LOWER")){
            password = password.toLowerCase();
        } else if (type.equals("MIXED")){
            password = mixedCasePassGenerator(password, length);
        }
        return password;
    }


    public String alphaNumericPasswordGenerator(int length, String type){
        String password;
        String nPassword = "";
        password = alphabetPasswordGenerator(length,type);

        for  (int i = 0; i < length; i++){
            if ( random.nextInt(3) == 1){
                nPassword = nPassword + Character.forDigit(random.nextInt(10),10);
            } else {
                nPassword = nPassword + password.charAt(i);
            }
        }
        return nPassword;
    }


    public String specialSymbolPasswordGenerator(int length, String type){
        String password = alphaNumericPasswordGenerator(length, type);
        String nPassword = "";
        String symbols = "!@#$%^&*_-";
        for  (int i = 0; i < length; i++){
            if ( random.nextInt(4) == 1){
                nPassword = nPassword + symbols.charAt(random.nextInt(symbols.length()));
            } else {
                nPassword = nPassword + password.charAt(i);
            }
        }

        return nPassword;
    }
}
