package com.hackerrank.java.advanced;

class Flower
{
    public String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    public String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    public String whatsYourName() {
        return "Lily";
    }
}

class Lotus extends Flower {
    @Override
    public String whatsYourName() {
        return "Lotus";
    }
}

abstract class State {
    public abstract Flower yourNationalFlower();
}

class WestBengal extends State {
    @Override
    public Flower yourNationalFlower() {
        return new Jasmine();
    }
}

class Karnataka extends State {
    @Override
    public Flower yourNationalFlower() {
        return new Lotus();
    }
}
class AndhraPradesh extends State {
    @Override
    public Flower yourNationalFlower() {
        return new Lily();
    }
}


