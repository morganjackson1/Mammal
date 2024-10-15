/*
With a partner and using the sample code on the Canvas page as a guide:

Create a class structure with the superclass being Mammal; three subclasses

Class Mammal:   name, age, species (can be informal -- example, human not homo sapiens).

Subclasses:  action, sound, favorite food, and a toString that includes their name, 
action, sound, and favorite food, species.

A test program that creates a member of each subclass and calls toString for that member.

Subclass instance variables should have an accessor and a modifier 
(a getter and a setter).  Example:  setName(), getName() */

public class Mammal{
    String name;
    String species;
    public static void main(String[] args)
    {
        Cow theCow = new Cow("Cole");
        theCow.to_String();

        Monkey theMonkey = new Monkey("Monk");
        theMonkey.to_String();

        Wolf theWolf = new Wolf("Willy");
        theWolf.to_String();
    }
    public Mammal(String species, String name){
        this.species = species;
        this.name = name;
    }
    public String toString(){
        return "The " + this.species + " is named" + this.name + ".";
    }
}

class Cow extends Mammal {
    public Cow(String name) {
        super("Cow", name);
        this.species = "Cow";
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("My name is " + name + " and I am a " + this.species);
    }

    public void makeSound() {
        System.out.println("Moooo!");
    }

    public void doAction() {
        System.out.println("Eat grass\n");
    }

    public void to_String() {
        this.getName();
        this.makeSound();
        this.doAction();
    }
}

class Monkey extends Mammal {
    public Monkey(String name) {
        super("Cow", name);
        this.species = "Cow";
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("My name is " + name + " and I am a " + this.species);
    }

    public void makeSound() {
        System.out.println("Moooo!");
    }

    public void doAction() {
        System.out.println("Eat grass\n");
    }

    public void to_String() {
        this.getName();
        this.makeSound();
        this.doAction();
    }
}

class Wolf extends Mammal {
    public Wolf(String name) {
        super("Cow", name);
        this.species = "Cow";
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("My name is " + name + " and I am a " + this.species);
    }

    public void makeSound() {
        System.out.println("Moooo!");
    }

    public void doAction() {
        System.out.println("Eat grass\n");
    }

    public void to_String() {
        this.getName();
        this.makeSound();
        this.doAction();
    }
}
