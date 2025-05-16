public class UserInputFromArgs3 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java UserInputFromArgs <int> <char> <string>");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            char character = args[1].charAt(0);
            String text = args[2];

            System.out.println("You entered:");
            System.out.println("Integer: " + number);
            System.out.println("Character: " + character);
            System.out.println("String: " + text);
        } catch (NumberFormatException e) {
            System.out.println("Error: First argument must be an integer.");
        }
    }
}
