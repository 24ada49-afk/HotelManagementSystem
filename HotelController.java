class HotelController {

    Room[] rooms;
    int count;

    HotelController(int size) {

        rooms = new Room[size];
        count = 0;
    }

    void addRoom(int roomNo, String customerName) {

        rooms[count++] = new Room(roomNo, customerName);
    }

    Room[] getRooms() {
        return rooms;
    }

    int getCount() {
        return count;
    }

    Room findRoom(String customerName) {

        for (int i = 0; i < count; i++) {

            if (rooms[i].customerName.equalsIgnoreCase(customerName)) {
                return rooms[i];
            }
        }

        return null;
    }

    String bookRoom(String customerName) {

        Room r = findRoom(customerName);

        if (r == null)
            return "Customer Not Found";

        if (!r.booked) {

            r.booked = true;
            return "Room Booked Successfully";
        }

        return "Room Already Booked";
    }

    String vacateRoom(String customerName) {

        Room r = findRoom(customerName);

        if (r == null)
            return "Customer Not Found";

        if (r.booked) {

            r.booked = false;
            return "Room Vacated Successfully";
        }

        return "Room Already Vacant";
    }
}