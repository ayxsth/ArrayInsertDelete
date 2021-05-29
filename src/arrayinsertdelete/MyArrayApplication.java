package arrayinsertdelete;

import java.util.Scanner;

/**
 *
 * @author ayxst
 */
public class MyArrayApplication {

    static Scanner in = new Scanner(System.in);
    static int index;

    public static void main(String[] args) {
        char cont;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("-----------------");
            System.out.println("|   1. Insert   |");
            System.out.println("|   2. Delete   |");
            System.out.println("-----------------");
            System.out.println("Choose one option: ");
            int option = in.nextInt();

            switch (option) {
                case 1:
                    print();
                    try {
                        insert();

                    } catch (Exception e) {
                        System.out.println("Exception: " + e);
                        break;
                    }
                    print();
                    break;
                
                case 2:
                    print();
                    try {
                        delete();

                    } catch (Exception e) {
                        System.out.println("Exception: " + e);
                        break;
                    }
                    print();
                    break;
                    
                default:
                    System.out.println("Invalid option!");
                    break;
            }
            System.out.println("Do you want to continue? (Y/y): ");
            cont = in.next().charAt(0);

        } while (cont == 'y' || cont == 'Y');

    }

    static void print() {
        MyArray.print();
    }

    static void insert() {
        System.out.println("Enter the number to insert: ");
        int newNum = in.nextInt();
        System.out.println("Enter the index for insertion: ");
        index = in.nextInt();
        MyArray.insert(newNum, index);
    }

    static void delete() {
        System.out.println("Enter the index for deletion: ");
        index = in.nextInt();
        MyArray.delete(index);
    }
}

