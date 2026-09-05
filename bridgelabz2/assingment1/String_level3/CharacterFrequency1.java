import java.util.Scanner;

class CharacterFrequency1 {
    static String[] findFrequency(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0')
                continue;

            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        String[] result = new String[chars.length];
        int k = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[k++] = chars[i] + " : " + freq[i];
            }
        }

        String[] finalResult = new String[k];

        for (int i = 0; i < k; i++)
            finalResult[i] = result[i];

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] result = findFrequency(s);

        for (String x : result)
            System.out.println(x);
    }
}