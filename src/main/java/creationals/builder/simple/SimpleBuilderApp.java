package creationals.builder.simple;

/**
 * Created by denglob on 8/3/17.
 */
public class SimpleBuilderApp {
    public static void main(String[] args) {
        Room room = new Room.RoomBuilder()
                .addPlace(2.5)
                .addRoomColor(Room.RoomColor.BLUE)
                .addRoomPurpose(Room.RoomPurpose.LIVING_ROOM)
                .build();
        System.out.println(room.toString());
    }
}
