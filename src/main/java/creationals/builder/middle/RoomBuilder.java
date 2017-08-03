package creationals.builder.middle;

/**
 * Created by denglob on 8/3/17.
 */
public abstract class RoomBuilder {
    Room room;

    void create() { room = new Room(); }

    abstract void addPlace();
    abstract void addRoomColor();
    abstract void addRoomPurpose();

    Room getRoom() { return room; }
}
