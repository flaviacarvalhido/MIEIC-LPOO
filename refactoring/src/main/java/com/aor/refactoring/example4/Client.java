package com.aor.refactoring.example4;

public class Client extends Person /*extends Worker*/ {  //makes no sense that this class extends worker!!


    public Client(String name, String phone) {
        super(name, phone);
    }

    //login function is unnecessary
}
