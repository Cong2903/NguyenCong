package services;

import models.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService implements Management<Room> {

    @Override
    public Room findById(long id) {
        return null;
    }

    @Override
    public void printList() {

    }

    @Override
    public void updateById(long id, Room room) {

    }

    @Override
    public void add(Room room) {

    }

    @Override
    public void delete(long id) {

    }

    static List<Room> roomList = new ArrayList<>();

    static {
        Room room1 = new Room(1, "Phòng Trống", 1, 1, 200);
        Room room2 = new Room(2, "Phòng Trống", 5, 1, 2000);
        Room room3 = new Room(3, "Phòng Trống", 10, 1, 20000);
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
    }
}