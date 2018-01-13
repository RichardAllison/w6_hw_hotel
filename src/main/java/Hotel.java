import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
//    private ArrayList<ConferenceRoom> conferenceRooms;
//    private ArrayList<DiningRoom> diningRooms;

    public Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;
//        this.conferenceRooms = conferenceRooms;
//        this.diningRooms = diningRooms;
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

    public ArrayList<Guest> checkWhichGuestsInRoom(Room room) {
        if (!checkRoomEmpty(room)) {
        return room.getGuests();
        } else {
            return null;
        }
    }

    public ArrayList<Room> emptyRooms() {
        ArrayList<Room> emptyRooms = new ArrayList<>();
        for (Room room : rooms){
            if (checkRoomEmpty(room)){
                emptyRooms.add(room);
            }
            return emptyRooms;
        }
    }

    public int countRooms() {
        return rooms.size();
    }

    public ArrayList<Room> findEmptyRooms() {
        ArrayList<Room> emptyRooms = new ArrayList<>();
        return emptyRooms;
    }

//    public int countConferenceRooms() {
//        return conferenceRooms.size();
//    }
//
//    public int countDiningRooms() {
//        return diningRooms.size();
//    }

}
