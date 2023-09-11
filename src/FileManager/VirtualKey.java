package FileManager;

import java.util.List;
import java.util.Scanner;

public class VirtualKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();

        while (true) {
            System.out.println("Welcome to Virtual Key for Your Repositories");
            System.out.println("1. List files");
            System.out.println("2. Perform file operations");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    List<String> files = fileManager.getFiles();
                    if (files.isEmpty()) {
                        System.out.println("No files available.");
                    } else {
                        System.out.println("Files:");
                        for (String file : files) {
                            System.out.println(file);
                        }
                    }
                    break;
                case 2:
                    System.out.println("1. Add a file");
                    System.out.println("2. Delete a file");
                    System.out.println("3. Search for a file");

                    int operation = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline

                    switch (operation) {
                        case 1:
                            System.out.print("Enter file name to add: ");
                            String addFileName = scanner.nextLine();
                            fileManager.addFile(addFileName);
                            System.out.println("File added successfully.");
                            break;
                        case 2:
                            System.out.print("Enter file name to delete: ");
                            String deleteFileName = scanner.nextLine();
                            fileManager.deleteFile(deleteFileName);
                            System.out.println("File deleted successfully.");
                            break;
                        case 3:
                            System.out.print("Enter file name to search: ");
                            String searchFileName = scanner.nextLine();
                            boolean found = fileManager.searchFile(searchFileName);
                            if (found) {
                                System.out.println("File found.");
                            } else {
                                System.out.println("File not found.");
                            }
                            break;
                        default:
                            System.out.println("Invalid operation.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}