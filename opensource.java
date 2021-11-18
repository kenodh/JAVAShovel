package tk;

import java.util.Scanner;

public class opensource {
    public <T> void showl(T str) {
        System.out.println(str);
    }
    public <T> void show(T str) {
        System.out.print(str);
    }
    public <T> String input(T str) {
        Scanner myObj = new Scanner(System.in);  // Create A Scanner object
        System.out.println(str);
        String userName = myObj.nextLine();  // Read user input
        return userName;
    }
}
