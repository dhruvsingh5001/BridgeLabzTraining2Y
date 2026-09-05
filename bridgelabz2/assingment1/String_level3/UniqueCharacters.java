import java.util.Scanner;

class UniqueCharacters {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true)
                s.charAt(count++);
        } catch (Exception e) {
            return count - 1;
        }
    }

    static char[] findUnique(String s) {
        int len = findLength(s);
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique)
                temp[count++] = s.charAt(i);
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] result = findUnique(s);

        System.out.print("Unique characters: ");
        for (char ch : result)
            System.out.print(ch + " ");
    }
}