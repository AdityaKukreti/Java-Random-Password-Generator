import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PasswordGenerator npass = new PasswordGenerator();
        Scanner scan = new Scanner(System.in);
        String[] types = {"UPPER","LOWER","MIXED"};
        int choice1 = 0;
        int choice2 = 0;
        int length = 0;
        

        System.out.println("░█▀▀█ █▀▀█ █▀▀▄ █▀▀▄ █▀▀█ █▀▄▀█ 　 ░█▀▀█ █▀▀█ █▀▀ █▀▀ █───█ █▀▀█ █▀▀█ █▀▀▄ 　 ░█▀▀█ █▀▀ █▀▀▄ █▀▀ █▀▀█ █▀▀█ ▀▀█▀▀ █▀▀█ █▀▀█ ");
        System.out.println("░█▄▄▀ █▄▄█ █──█ █──█ █──█ █─▀─█ 　 ░█▄▄█ █▄▄█ ▀▀█ ▀▀█ █▄█▄█ █──█ █▄▄▀ █──█ 　 ░█─▄▄ █▀▀ █──█ █▀▀ █▄▄▀ █▄▄█ ──█── █──█ █▄▄▀ ");
        System.out.println("░█─░█ ▀──▀ ▀──▀ ▀▀▀─ ▀▀▀▀ ▀───▀ 　 ░█─── ▀──▀ ▀▀▀ ▀▀▀ ─▀─▀─ ▀▀▀▀ ▀─▀▀ ▀▀▀─ 　 ░█▄▄█ ▀▀▀ ▀──▀ ▀▀▀ ▀─▀▀ ▀──▀ ──▀── ▀▀▀▀ ▀─▀▀");

        System.out.println("\n\nWelcome to the Random Password Generator program-");
        System.out.print("\nChoose one of the following password categories you want to generate-\n\n");
        System.out.print("[1] Alphabetical Password\n[2] AlphaNumeric Password\n[3] AlphaNumeric Password with Special Characters\n");
        System.out.print("\nEnter your choice- ");
        choice1 = scan.nextInt();

        if (choice1 == 1 || choice1 == 2 || choice1 == 3){
        if (choice1 == 1){
            System.out.print("\nEnter the length of the password you want to generate- ");
            length = scan.nextInt();
            System.out.print("\nChoose one of the following types-\n[1] Uppercase\n[2] Lowercase\n[3] Mixedcase\n");
            System.out.print("\nEnter your choice- ");
            choice2 = scan.nextInt();
            if (choice2 == 1 || choice2 == 2 || choice2 == 3)
                System.out.println(npass.alphabetPasswordGenerator(length, types[choice2-1]));
            else
                System.out.println("Invalid choice entered! Exiting...");



        } else if (choice1 == 2){
            System.out.print("\nEnter the length of the password you want to generate- ");
            length = scan.nextInt();
            System.out.print("\nChoose one of the following types-\n[1] Uppercase\n[2] Lowercase\n[3] Mixedcase\n");
            System.out.print("\nEnter your choice- ");
            choice2 = scan.nextInt();
            if (choice2 == 1 || choice2 == 2 || choice2 == 3)
                System.out.println(npass.alphaNumericPasswordGenerator(length, types[choice2-1]));
            else
                System.out.println("Invalid choice entered! Exiting...");



        } else if (choice1 == 3){
            System.out.print("\nEnter the length of the password you want to generate- ");
            length = scan.nextInt();
            System.out.print("\nChoose one of the following types-\n[1] Uppercase\n[2] Lowercase\n[3] Mixedcase\n");
            System.out.print("\nEnter your choice- ");
            choice2 = scan.nextInt();
            if (choice2 == 1 || choice2 == 2 || choice2 == 3)
                System.out.println(npass.specialSymbolPasswordGenerator(length, types[choice2-1]));
            else
                System.out.println("Invalid choice entered! Exiting...");
        } 
    }
        else
            System.out.println("Invalid choice entered! Exiting...");
    scan.close();
    }
}
