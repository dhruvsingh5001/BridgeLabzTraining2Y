public class StringBufferVsStringBuilder {

    public static void main(String[] args) {

        int numberOfStrings = 1_000_000;

        // ---------------- StringBuffer ----------------
        StringBuffer stringBuffer = new StringBuffer();

        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < numberOfStrings; i++) {
            stringBuffer.append("hello");
        }

        long endTimeBuffer = System.nanoTime();

        long bufferTime = endTimeBuffer - startTimeBuffer;


        // ---------------- StringBuilder ----------------
        StringBuilder stringBuilder = new StringBuilder();

        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < numberOfStrings; i++) {
            stringBuilder.append("hello");
        }

        long endTimeBuilder = System.nanoTime();

        long builderTime = endTimeBuilder - startTimeBuilder;


        // Display results
        System.out.println("Number of strings: " + numberOfStrings);
        System.out.println("StringBuffer Time: " + bufferTime + " nanoseconds");
        System.out.println("StringBuilder Time: " + builderTime + " nanoseconds");

        if (bufferTime < builderTime) {
            System.out.println("StringBuffer is faster.");
        } else if (builderTime < bufferTime) {
            System.out.println("StringBuilder is faster.");
        } else {
            System.out.println("Both took approximately the same time.");
        }
    }
}