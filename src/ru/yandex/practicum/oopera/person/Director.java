package ru.yandex.practicum.oopera.person;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public void printDirector(){
        System.out.println("Director: " + name + " " + surname);
    }

}
