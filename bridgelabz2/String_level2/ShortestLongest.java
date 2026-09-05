import java.util.Scanner;

class ShortestLongest {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true)
                s.charAt(count++);
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
        int start = 0, k = 0;

        for (int i = 0; i < findLength(s); i++) {
            if (s.charAt(i) == ' ') {
                words[k++] = s.substring(start, i);
                start = i + 1;
            }
        }

        words[k] = s.substring(start);
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

    static int[] findShortestLongest(String[][] data) {
        int shortIndex = 0, longIndex = 0;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);

            if (len < Integer.parseInt(data[shortIndex][1]))
                shortIndex = i;

            if (len > Integer.parseInt(data[longIndex][1]))
                longIndex = i;
        }

        return new int[]{shortIndex, longIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] data = wordLength(words);
        int[] result = findShortestLongest(data);

        System.out.println("Shortest: " + data[result[0]][0]);
        System.out.println("Longest: " + data[result[1]][0]);
    }
}