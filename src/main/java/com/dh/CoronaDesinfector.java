package com.dh;

@Deprecated
public class CoronaDesinfector {

    @InjectByType
    private Announcer announcer;

    @InjectByType
    private Policeman policeman;

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
