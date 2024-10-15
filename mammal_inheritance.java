/*
 * A'laysia Miller-Chambliss 
 * Date: 10-13-2024
 *
 * This program defines a superclass 'Mammal' and three subclasses: 'Cheetah', 'Owl', and 'Elephant'.
 * Each subclass has specific actions, sounds, favorite foods, and methods to return their details.
 * 
 * Algorithm:
 * 1. Start the program.
 * 2. Create instances of each subclass (Cheetah, Owl, Elephant) using their respective constructors.
 * 3. Store the objects in an array (optional if you want to iterate over them).
 * 4. For each object:
 *    a. Use the toString() method to display basic information (name, species, and age).
 *    b. Call specific methods (makeSound(), doAction(), favoriteFood()) to print the behavior of each animal.
 * 5. Print all the details for each object in sequence.
 * 6. End the program.
 */

 public class mammal_inheritance {
    String name;
    String species;
    int age;  // Changed to int for consistency

    public mammal_inheritance(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "The " + species + " named " + name + " is " + age + " years old.";
    }

    public static void main(String[] args) {
        // Create instances of each subclass
        Cheetah theCheetah = new Cheetah("Alexis");
        Owl theOwl = new Owl("Oscar");
        Elephant theElephant = new Elephant("Horton");

        // Print details of each animal
        theCheetah.printDetails();
        theOwl.printDetails();
        theElephant.printDetails();
    }
}

class Cheetah extends mammal_inheritance {
    public Cheetah(String name) {
        super("Cheetah", name, 20);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("I make this sound: Rawrrr!");
    }

    public void doAction() {
        System.out.println("I like to hunt prey.");
    }

    public void favoriteFood() {
        System.out.println("My favorite food is meat.\n");
    }

    public void printDetails() {
        System.out.println(toString());
        makeSound();
        doAction();
        favoriteFood();
    }
}

class Owl extends mammal_inheritance {
    public Owl(String name) {
        super("Owl", name, 14);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("I make this sound: Ooooooo!");
    }

    public void doAction() {
        System.out.println("I like to howl and hunt.");
    }

    public void favoriteFood() {
        System.out.println("My favorite food is rodents.\n");
    }

    public void printDetails() {
        System.out.println(toString());
        makeSound();
        doAction();
        favoriteFood();
    }
}

class Elephant extends mammal_inheritance {
    public Elephant(String name) {
        super("Elephant", name, 12);
    }

    public void makeSound() {
        System.out.println("I make this sound: Uuuhheruhhh!");
    }

    public void doAction() {
        System.out.println("I like to blow water out of my trunk.");
    }

    public void favoriteFood() {
        System.out.println("My favorite food is fruit.\n");
    }

    public void printDetails() {
        System.out.println(toString());
        makeSound();
        doAction();
        favoriteFood();
    }
}
