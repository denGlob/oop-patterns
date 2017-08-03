package creationals.builder.middle;

/**
 * Created by denglob on 8/3/17.
 */
public class Room {

    enum RoomColor {
        WHITE, BLUE, GREN, PURPLE
    }

    enum RoomPurpose {
        CHILDREN_ROOM, BEDROOM, BATHROOM, KITCHEN, LIVING_ROOM
    }

    private double place;
    private RoomColor roomColor;
    private RoomPurpose roomPurpose;

    public double getPlace() {
        return place;
    }

    public void setPlace(double place) {
        this.place = place;
    }

    public RoomColor getRoomColor() {
        return roomColor;
    }

    public void setRoomColor(RoomColor roomColor) {
        this.roomColor = roomColor;
    }

    public RoomPurpose getRoomPurpose() {
        return roomPurpose;
    }

    public void setRoomPurpose(RoomPurpose roomPurpose) {
        this.roomPurpose = roomPurpose;
    }

    @Override
    public String toString() {
        return "Room{" +
                "place=" + place +
                ", roomColor=" + roomColor +
                ", roomPurpose=" + roomPurpose +
                '}';
    }
}
