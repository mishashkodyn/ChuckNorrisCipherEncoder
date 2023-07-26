public class Encode {

    private final String word;

    Encode(String word) {
        this.word = word;
    }
    public void encryption() {
        try {
            char[] arr = word.toCharArray();
            String converted = "";

            for (char i : arr)
            {
                converted += String.format("%7s", Integer.toBinaryString(i)).replace(" ", "0");
            }
            int i = 0;
            char currentChar;
            System.out.println("Encoded string:");

            while (i < converted.length()) {
                if (converted.charAt(i) == '0') {
                    System.out.print("00 ");
                    currentChar = '0';
                }
                else {
                    System.out.print("0 ");
                    currentChar = '1';
                }

                while (converted.charAt(i) == currentChar) {
                    System.out.print("0");
                    i++;
                    if (i == converted.length()) break;
                }

                if (i < converted.length()) System.out.print(" ");
            }
        } catch (Exception e) {
            System.out.println("Decoded string is not valid.");
        }
        System.out.println();
    }
}
