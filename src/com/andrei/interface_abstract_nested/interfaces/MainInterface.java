package com.andrei.interface_abstract_nested.interfaces;

public class MainInterface {

    public static void main(String[] args) {
        //capital I before the neam if the interface.
        ITelephone andreiPhone = new DeskPhone(1234);
        andreiPhone.powerOn();
        andreiPhone.callPhone(1234);
        andreiPhone.answer();

        //if andreiPhone was declared as DekPhone instead of ITelefon, here will be an error
        andreiPhone = new MobilPhone(4567);
        andreiPhone.powerOn();
        andreiPhone.callPhone(4567);
        andreiPhone.answer();

    }
}
