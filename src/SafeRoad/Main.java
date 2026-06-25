package SafeRoad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
			BST bst = new BST();
			Graph graph = new Graph();

			while(true) {

			    System.out.println("\n===== SAFE ROAD =====");
			    System.out.println("1.Report Accident");
			    System.out.println("2.View Accidents");
			    System.out.println("3.Search Accident");
			    System.out.println("4.Dispatch Team");
			    System.out.println("5.Nearest Unit");
			    System.out.println("6.Fastest Route");
			    System.out.println("7.Exit");

			    System.out.print("Choice: ");
			    int choice = sc.nextInt();

			    switch(choice) {

			        case 1:

			            System.out.print("Accident ID: ");
			            int id = sc.nextInt();
			            sc.nextLine();

			            System.out.print("Location: ");
			            String location = sc.nextLine();

			            System.out.print("Severity: ");
			            String severity = sc.nextLine();

			            bst.addAccident(
			                    new Accident(id,location,severity)
			            );

			            System.out.println("Accident Reported Successfully");
			            break;

			        case 2:

			            System.out.println("\nAccident Records");
			            bst.inorder(bst.root);
			            break;

			        case 3:

			            System.out.print("Enter ID: ");
			            int searchId = sc.nextInt();

			            Accident found =
			                    bst.search(bst.root, searchId);

			            if(found != null)
			                System.out.println(found);
			            else
			                System.out.println("Not Found");

			            break;

			        case 4:

			            System.out.print("Enter Accident ID: ");
			            int aid = sc.nextInt();

			            Accident a =
			                    bst.search(bst.root, aid);

			            if(a != null) {
			                a.status = "DISPATCHED";
			                System.out.println("Emergency Team Dispatched");
			            } else {
			                System.out.println("Accident Not Found");
			            }

			            break;

			        case 5:
			            graph.nearestUnit();
			            break;

			        case 6:
			            graph.dijkstra(0);
			            break;

			        case 7:
			            System.exit(0);

			        default:
			            System.out.println("Invalid Choice");
			    }
			}
		}
    }
}