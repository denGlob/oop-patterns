package creationals.builder.middle;

/**
 * Created by denglob on 8/3/17.
 */
public class Hostel extends RoomBuilder {
    @Override
    void addPlace() {
        room.setPlace(15);
    }

    @Override
    void addRoomColor() {
        room.setRoomColor(Room.RoomColor.WHITE);
    }

    @Override
    void addRoomPurpose() {
        room.setRoomPurpose(Room.RoomPurpose.BEDROOM);
    }
}
