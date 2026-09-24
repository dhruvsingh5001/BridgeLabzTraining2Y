class Solution {
    public int removeDuplicates(int[] bookIds) {
        if (bookIds.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < bookIds.length; j++) {
            if (bookIds[j] != bookIds[i]) {
                i++;
                bookIds[i] = bookIds[j];
            }
        }

        return i + 1;
    }
}
