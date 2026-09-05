import java.util.Scanner;

class WordLength2D {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count++);
            }
        } catch (Exception e) {
            return count - 1;
        }
    }

    static String[] splitText(String s) {
        int count = 1;

        for (int i = 0; i < findLength(s); i++)
            if (s.charAt(i) == ' ')
                count++;

        String[] words = new String[count];
        int start = 0, index = 0;

        for (int i = 0; i < findLength(s); i++) {
            if (s.charAt(i) == ' ') {
                words[index++] = s.substring(start, i);
                start = i + 1;
            }
        }

        words[index] = s.substring(start);
        return words;
    }

    static String[][] wordLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] result = wordLength(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < result.length; i++)
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
    }
}