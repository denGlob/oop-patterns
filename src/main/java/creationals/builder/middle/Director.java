package creationals.builder.middle;

/**
 * Created by denglob on 8/3/17.
 */
public class Director {
    RoomBuilder roomBuilder;

    public void setRoomBuilder(RoomBuilder roomBuilder) {
        this.roomBuilder = roomBuilder;
    }

    Room buildRoom() {
        roomBuilder.create();
        roomBuilder.addPlace();
        roomBuilder.addRoomColor();
        roomBuilder.addRoomPurpose();
        Room room = roomBuilder.getRoom();
        return room;
    }
}
