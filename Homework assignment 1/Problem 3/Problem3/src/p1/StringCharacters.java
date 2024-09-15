package p1;

public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                    + "Whether `tis nobler in the mind to suffer"
                    + " the slings and arrows of outrageous fortune,"
                    + " or to take arms against a sea of troubles,"
                    + " and by opposing end them?";

        int spaces = 0, vowels = 0, letters = 0; // we defined 3 integer variables with initial value of 0

        // this is to iterate over each character in the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // this code checks if the character is a space
            if (ch == ' ') {
                spaces++;
            }
            // this one checks if the character is a letter
            else if (Character.isLetter(ch)) {
                letters++;
                
                // and this checks if the letter is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                }
            }
        }

        // output the results
        System.out.println("The text contained:");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + (letters - vowels)); // smart! isn't it? :))
        System.out.println("Spaces: " + spaces);
    }
}
