public class Fly {
    public static void main(String[] args) {

        System.out.println("Welcome to the program where I call methods because I can");

        PrintAwesome();
        Wicked();
        PrintAwesome();

        System.out.println("Now we start a for loop");

        for (int i = 0; i < 5; i++) {
            Wicked();
            PrintAwesome();
        }

        // enchanced for loop here
    }

    public static void PrintAwesome () {
        System.out.println("I am awesome.");
    }

    public static void Wicked () {
        System.out.println("This is wicked!!!");
    }



}
