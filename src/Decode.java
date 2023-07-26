public class Decode {

    private final String encoded;

    public Decode(String encoded) {
        this.encoded = encoded;
    }

    public void decoder(){
        try {
            String [] arr = encoded.split(" ");
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < arr.length; i += 2) {
                if("00".equals(arr[i])) {
                    result.append(arr[i+1]);
                } else if ("0".equals(arr[i])) {
                    arr[i+1] = arr[i+1].replace('0', '1');
                    result.append(Integer.parseInt(arr[i+1]));
                } else {
                    System.out.println("Encoded string is not valid.");
                    return;
                }

            }
            String res = String.valueOf(result);
            String[] binary = new String[res.length()/7];
            int endIndex = 7;
            String decStr = "";
            for (int i = 0, j = 0; i < res.length(); i+=7, j++) {
                binary[j] = res.substring(i, endIndex);
                decStr += (char) Integer.parseInt(binary[j], 2);
                endIndex += 7;
            }
            System.out.println("Decoded string:\n" + decStr);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Encoded string is not valid.");
        }
    }
}
