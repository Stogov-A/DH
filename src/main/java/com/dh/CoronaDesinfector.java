package com.dh;

public class CoronaDesinfector {

    private Announcer announcer = new ConsoleAnnouncer();
    private Policeman policeman = new PolicemanImpl();

    public void start(Room room){
        announcer.announce("начинаем дезинфекцию");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Рискните войти обратно");
    }

    private void desinfect(Room room) {
        System.out.println("Комната дезинфецируется");
    }
}
