public class AtBash {

    private String constant;
    private  String cipher;

    public AtBash(String constant, String cipher){
        this.constant = constant;
        this.cipher = cipher;
    }

    //the method you run from the AtBash object to decode your string
    public String decode(String encryptedText){

        String toReturn = "";

        char[] encrypted = encryptedText.toCharArray();

        for(int i = 0; i < encrypted.length; i++){
            toReturn += cipherSwitch(encrypted[i]);
        }

        return toReturn;

    }

    private String cipherSwitch(char c) {

        if(!Character.isAlphabetic(c)){
            return String.valueOf(c);
        }

        //tempted to char array in variables up top
        char[] cipherChars = cipher.toCharArray();
        char[] constantChars = constant.toCharArray();

        for(int i = 0; i < cipherChars.length; i++){
            if(c == cipherChars[i]){
                return String.valueOf(constantChars[i]);
            }
        }

        return " ";
    }

}
