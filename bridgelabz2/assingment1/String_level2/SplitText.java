import java.util.Scanner;

class SplitText {
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
        int len = findLength(s);
        int words = 1;

        for (int i = 0; i < len; i++)
            if (s.charAt(i) == ' ')
                words++;

        int[] spaces = new int[words - 1];
        int k = 0;

        for (int i = 0; i < len; i++)
            if (s.charAt(i) == ' ')
                spaces[k++] = i;

        String[] result = new String[words];
        int start = 0;

        for (int i = 0; i < words - 1; i++) {
            result[i] = s.substring(start, spaces[i]);
            start = spaces[i] + 1;
        }

        result[words - 1] = s.substring(start);
        return result;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i]))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] user = splitText(text);
        String[] builtIn = text.split(" ");

        System.out.println("User Defined:");
        for (String word : user)
            System.out.println(word);

        System.out.println("Built-in:");
        for (String word : builtIn)
            System.out.println(word);

        System.out.println("Arrays are equal: " + compare(user, builtIn));
    }
}