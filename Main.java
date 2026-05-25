public class Main {

    public static void main(String[] args) {

        HotelController controller = new HotelController(10);
        HotelView view = new HotelView();

        // Adding Rooms
        controller.addRoom(101, "Arun");
        controller.addRoom(102, "Priya");
        controller.addRoom(104, "Fannie");

        while (true) {

            view.showMenu();

            int choice = view.getChoice();

            switch (choice) {

                case 1:

                    // Display all rooms
                    view.displayRooms(
                            controller.getRooms(),
                            controller.getCount());

                    break;

                case 2:

                    // Search customer
                    String search = view.getName("Enter customer name: ");

                    if (controller.findRoom(search) != null)
                        view.showMessage("Customer Found");
                    else
                        view.showMessage("Customer Not Found");

                    break;

                case 3:

                    // Book room
                    String book = view.getName("Enter customer name: ");

                    view.showMessage(
                            controller.bookRoom(book));

                    break;

                case 4:

                    // Vacate room
                    String vacate = view.getName("Enter customer name: ");

                    view.showMessage(
                            controller.vacateRoom(vacate));

                    break;

                case 5:

                    System.out.println("Exiting...");
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}