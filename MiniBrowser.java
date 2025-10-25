import java.util.Scanner;
import java.util.Stack;

public class MiniBrowser {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Stack<String> history = new Stack <>();
         String currentUrl = null; 

         while (true) {
            System.out.println("\n--- Mini Browser ---");
            System.out.println("1. Enter new URL");
            System.out.println("2. Back to previouse URL");
            System.out.println("3. Show the current URL");
            System.out.println("4. Show history");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1: 
                    System.out.println("Enter the URL: ");
                    String url = input. nextLine();
                    if (currentUrl != null) {
                        history.push(currentUrl);
                    }
                    currentUrl = url;
                    System.out.println("You  visited: " + currentUrl);
                    break;

                case 2: 
                    if (!history.isEmpty()) {
                        currentUrl = history.pop();
                        System.out.println("Want break to: " + currentUrl);
                     } else {
                        System.out.println("No previous URL to go back to.");
                    }
                    break; 

                case 3:
                        System.out.println("Current URL: " + (currentUrl != null ? currentUrl : "None"));
                        break;

                case 4:
                     if (history.isEmpty()) {
                        System.out.println("No history yet.");
                        } else {
                            System.out.println("History: " + history);
                        }
                        break;

                case 5: 
                    System.out.println("Existing browser...");
                    input.close();
                    return;
                        
                default:
                    System.out.println("invalid cchoice. Try again.");

                 }    
            }
         }
    }
