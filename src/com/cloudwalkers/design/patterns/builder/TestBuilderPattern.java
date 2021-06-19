/**
 *
 */
package com.cloudwalkers.design.patterns.builder;

import java.time.Year;

/**
 * @author nijogeorgep
 *
 */
public class TestBuilderPattern {
    public static void main(String args[]) {
        Computer computer = new Computer.ComputerBuilder("HDD", "RAM")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer.toString());

        //Exploring Joshua Bloch’s Builder design pattern in Java
        Book mybook = new Book.Builder("0-12-345678-9", "Moby-Dick")
                .genre("ADVENTURE_FICTION")
                .author("Herman Melville")
                .published(Year.of(1988))
                .description(
                        "The book is the sailor Ishmael's narrative of the obsessive quest of "
                                + "Ahab, captain of the whaling ship Pequod, for revenge on Moby Dick, "
                                + "the giant white sperm whale that on the ship's previous voyage bit "
                                + "off Ahab's leg at the knee."
                )
                .build();

        //Reusability of builder Object
        Book.Builder bookBuilder = new Book.Builder("0-12-345678-9", "Moby-Dick")
                .genre("ADVENTURE_FICTION")
                .author("Herman Melville")
                .published(Year.of(1851))
                .description("description omitted for brevity");

        // Create a first Book object
        Book myNewBook = bookBuilder.build();

        // Create a second, slightly different, object reusing the same Builder instance
        myNewBook = bookBuilder.published(Year.of(1952)).build();
    }
}
