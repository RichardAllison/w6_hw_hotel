import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;


    public Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void createRoomBooking(Room room, int days) {

    }

    public void checkInGuest(Room room, Guest guest) {
        if (room.checkBooked()) {
            room.addGuest(guest);
        }
    }

    public void checkOutGuest(Room room, Guest guest) {
        room.removeGuest(guest);
        if (room.checkRoomEmpty()) {
            room.removeBooking();
        }
    }

//    public boolean checkRoomEmpty(Room room) {
//       return room.checkRoomEmpty();
//    }

    public ArrayList<Guest> findGuestsInRoom(Room room) {

        ArrayList<Guest> guestsInRoom = new ArrayList<>();
        if (!room.checkRoomEmpty()) {
            for (Guest guest : room.getGuests()) {
                guestsInRoom.add(guest);
            }
        }
        return guestsInRoom;
    }

    public ArrayList<Room> findEmptyRooms() {
        ArrayList<Room> emptyRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.checkRoomEmpty()){
                emptyRooms.add(room);
            }
        }
            return emptyRooms;
    }

    public int countRooms() {
        return rooms.size();
    }

}
