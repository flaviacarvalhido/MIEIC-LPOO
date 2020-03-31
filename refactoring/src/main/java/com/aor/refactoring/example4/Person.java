package com.aor.refactoring.example4;

public abstract class Person {      //Person makes sense because the other classes all share the same attributes

    public String name,phone;

    Person(String n, String p){
        this.name=n;
        this.phone=p;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}

