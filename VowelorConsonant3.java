import java.io.*;

public class VowelorConsonant3 {
    public static void main(String args[]) {
        char ch = 'i';
        
        // check using switch case
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print(ch+" is a vowel");
                break;
                default: System.out.print(ch+" is a consonant");
        }
    }
}