/*
 * A'laysia Miller-Chambliss 
 * Date: 10-13-2024
 *
 * This program defines a superclass 'Mammal' and three subclasses: 'Cheetah', 'Owl', and 'Elephant'.
 * Each subclass has specific actions, sounds, favorite foods, and methods to return their details.
 * 
 * Algorithm:
 * 1. Start the program.
 * 2. Create instances of each subclass (Cheetah, Owl, Elephant) using their constructors.
 * 3. For each object:
 *    a. Use the toString() method to display basic information (name, species, and age).
 *    b. Call methods like makeSound(), doAction(), and favoriteFood() to print the behavior.
 * 4. Print all the details for each object in sequence.
 * 5. End the program.
 */

public class Mammal{
    String name;
    String species;
    String age;
    public static void main(String[] args)
    {
        cheetah thecheetah = new cheetah("Alexis");
        thecheetah.to_String();

        owl theOwl = new owl("Oscar");
        theOwl.to_String();

        Elephant theElephant = new Elephant("Horton");
        theElephant.to_String();
    }
    public Mammal(String species, String name, String age)
    {
        this.species = species;
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "The " + this.species + " is named" + this.name + "." + "It is " + this.age + "years old. ";
    }
}

class cheetah extends Mammal {
    public cheetah(String name) {
        super("Cheetah", name, "20");
        this.species = "Cheetah";
        this.name = name;
        this.age = "20";
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("My name is " + name + " and I am a " + this.age + " year old " + this.species + ".");
    }

    public void makeSound() {
        System.out.println("I make this sound Rawrrr!");
    }

    public void doAction() {
        System.out.println("I like to Hunt prey.");
    }

    public void favoriteFood(){
        System.out.println("My favorite food is Meat.\n");
    }

    public void to_String() {
        this.getName();
        this.makeSound();
        this.doAction();
        this.favoriteFood();
    }
}

class owl extends Mammal {
    public owl(String name) {
        super("Owl", name, "14");
        this.species = "Owl";
        this.name = name;
        this.age = "14";
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("My name is " + name + " and I am a " + this.age + " year old " + this.species + ".");
    }

    public void makeSound() {
        System.out.println("I make this sound Ooooooo!");
    }

    public void doAction() {
        System.out.println("I like to Howl and hunt.");
    }
    public void favoriteFood(){
        System.out.println("My favorite food is rodents.\n");
    }

    public void to_String() {
        this.getName();
        this.makeSound();
        this.doAction();
        this.favoriteFood();
    }
}

class Elephant extends Mammal {
    public Elephant(String name) {
        super("Elephant", name, "12");
        this.species = "Elephant";
        this.name = name;
        this.age = "14";
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("My name is " + name + " and I am a " + this.age + " year old " + this.species + ".");
    }

    public void makeSound() {
        System.out.println("I make this sound Uuuhheruhhh!");
    }

    public void doAction() {
        System.out.println("I like to blow water out my trunk.");
    }

    public void favoriteFood(){
        System.out.println("My favorite food is Fruit.\n");
    }

    public void to_String() {
        this.getName();
        this.makeSound();
        this.doAction();
        this.favoriteFood();
    }
}
