package Exceptions;

import java.util.Scanner;

public class TryResources {
    void runTries(){
        try {
            Scanner sc = new Scanner(System.in);
            String d = sc.nextLine();
            sc.close(); // need to close
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.nextLine();
            //doesnt need closing
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
    }
}

