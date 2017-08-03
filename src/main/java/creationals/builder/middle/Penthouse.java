package creationals.builder.middle;

/**
 * Created by denglob on 8/3/17.
 */
public class Penthouse extends RoomBuilder {
    @Override
    void addPlace() {
        room.setPlace(250);
    }

    @Override
    void addRoomColor() {
        room.setRoomColor(Room.RoomColor.GREN);
    }

    @Override
    void addRoomPurpose() {
        room.setRoomPurpose(Room.RoomPurpose.LIVING_ROOM);
    }
}
