import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;


    public Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void checkInGuest(Bedroom bedroom, Guest guest) {
        bedroom.addGuest(guest);
    }

    public void checkOutGuest(Bedroom bedroom, Guest guest) {
        bedroom.removeGuest(guest);
    }

    public boolean checkRoomEmpty(Room room) {
        if (room.getGuests().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Guest> findGuestsInRoom(Room room) {

        ArrayList<Guest> guestsInRoom = new ArrayList<>();
        if (!checkRoomEmpty(room)) {
            for (Guest guest : room.getGuests()) {
                guestsInRoom.add(guest);
            }
        }
        return guestsInRoom;
    }

    public ArrayList<Room> findEmptyRooms() {
        ArrayList<Room> emptyRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (checkRoomEmpty(room)){
                emptyRooms.add(room);
            }
        }
            return emptyRooms;
    }

    public int countRooms() {
        return rooms.size();
    }

}
