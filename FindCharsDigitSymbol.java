public class FindCharsDigitSymbol {
    public static void main(String[] args){
        String str = "Java123@#";

        int alphabets = 0;
        int numbers = 0;
        int special = 0;

        for(char c : str.toCharArray()) {

            if(Character.isLetter(c))
                alphabets++;

            else if(Character.isDigit(c))
                numbers++;

            else
                special++;
        }


        System.out.println(alphabets);
        System.out.println(numbers);
        System.out.println(special);
    }
}