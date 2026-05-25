import java.util.Scanner;

class HotelView {

    Scanner sc = new Scanner(System.in);

    void showMenu() {

        System.out.println("\n--- Hotel Menu ---");
        System.out.println("1. Display Rooms");
        System.out.println("2. Search Customer");
        System.out.println("3. Book Room");
        System.out.println("4. Vacate Room");
        System.out.println("5. Exit");
    }

    int getChoice() {

        System.out.print("Enter choice: ");
        return sc.nextInt();
    }

    String getName(String msg) {

        sc.nextLine();
        System.out.print(msg);
        return sc.nextLine();
    }

    void displayRooms(Room[] rooms, int count) {

        System.out.println("\nRoom Details:");

        for (int i = 0; i < count; i++) {

            System.out.println(
                    rooms[i].roomNo + " - " +
                    rooms[i].customerName + " - " +
                    (rooms[i].booked ? "Booked" : "Available"));
        }
    }

    void showMessage(String msg) {
        System.out.println(msg);
    }
}