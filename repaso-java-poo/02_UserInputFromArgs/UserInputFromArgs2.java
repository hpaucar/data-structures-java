public class UserInputFromArgs2 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        char character = args[1].charAt(0);
        String text = args[2];

        System.out.println("You entered:");
        System.out.println("Integer: " + number);
        System.out.println("Character: " + character);
        System.out.println("String: " + text);
    }
}
