import java.util.Scanner;

class VowelConsonant {
    static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return "Vowel";

        if (ch >= 'a' && ch <= 'z')
            return "Consonant";

        return "Not a Letter";
    }

    static int[] countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            String result = checkChar(s.charAt(i));

            if (result.equals("Vowel"))
                vowels++;
            else if (result.equals("Consonant"))
                consonants++;
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] result = countVowelsConsonants(s);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}