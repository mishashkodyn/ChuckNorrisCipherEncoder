import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        communication();
    }
    public static void communication() {
        Scanner sc = new Scanner(System.in);
        label:
        while(true) {
            System.out.println("Please input operation (encode/decode/exit):");
            String answer = sc.nextLine();
            switch (answer) {
                case "encode":
                    System.out.println("Input string:");
                    Encode encode = new Encode(sc.nextLine());
                    encode.encryption();
                    System.out.println();
                    break;
                case "decode":
                    System.out.println("Input encoded string:");
                    Decode decode = new Decode(sc.nextLine());
                    decode.decoder();
                    System.out.println();
                    break;
                case "exit":
                    System.out.println("Bye!");
                    break label;
                default:
                    System.out.println("There is no '" + answer + "' operation");
                    System.out.println();
            }
        }
    }
}
