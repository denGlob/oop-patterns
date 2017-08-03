package creationals.builder.simple;

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

    public static class RoomBuilder {

        private double place = 0.;
        private RoomColor roomColor = RoomColor.WHITE;
        private RoomPurpose roomPurpose = RoomPurpose.KITCHEN;
//
        RoomBuilder addPlace(double place) {
            this.place = place;
            return this;
        }

        RoomBuilder addRoomColor(RoomColor roomColor) {
            this.roomColor = roomColor;
            return this;
        }
        RoomBuilder addRoomPurpose(RoomPurpose roomPurpose) {
            this.roomPurpose = roomPurpose;
            return this;
        }

        Room build() {
            Room room = new Room();
            room.setPlace(place);
            room.setRoomColor(roomColor);
            room.setRoomPurpose(roomPurpose);
            return room;
        }
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
