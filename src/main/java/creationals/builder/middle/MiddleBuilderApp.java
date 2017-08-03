package creationals.builder.middle;

/**
 * Created by denglob on 8/3/17.
 */
public class MiddleBuilderApp {
    public static void main(String[] args) {
        Director director = new Director();
        director.setRoomBuilder(new Penthouse());
        Room room = director.buildRoom();
        System.out.println(room.toString());

        director.setRoomBuilder(new Hostel());
        room = director.buildRoom();
        System.out.println(room.toString());
    }
}
