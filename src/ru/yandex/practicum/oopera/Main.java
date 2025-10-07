package ru.yandex.practicum.oopera;

import ru.yandex.practicum.oopera.person.*;
import ru.yandex.practicum.oopera.show.*;

public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Mihail", "Karpov", Gender.MALE, 174);
        Actor actor4 = new Actor("Oleg", "Karpov", Gender.MALE, 180);
        Actor actor2 = new Actor("Anna", "Belousova", Gender.FEMALE, 168);
        Actor actor3 = new Actor("Valentina", "Romashko", Gender.FEMALE, 170);

        Director director1 = new Director("Alexey", "Balabanov", Gender.MALE, 47);
        Director director2 = new Director("Anna", "Melikyan", Gender.FEMALE, 32);

        Person musicAuthor = new Person("Anton", "Serov", Gender.MALE);
        Person choreographer = new Person("Inna", "Titova", Gender.FEMALE);

        Show show = new Show("Show", 100, director1);
        Ballet ballet = new Ballet("Ballet", 90, director2, musicAuthor, "libretto text", choreographer);
        Opera opera = new Opera("Opera", 110, director1, musicAuthor, "libretto text 2", 10);

        show.addActorToShow(actor1);
        show.addActorToShow(actor2);
        show.addActorToShow(actor4);
        show.addActorToShow(actor2);
        ballet.addActorToShow(actor2);
        ballet.addActorToShow(actor3);
        opera.addActorToShow(actor1);
        opera.addActorToShow(actor3);

        show.printActorsList();
        ballet.printActorsList();
        opera.printActorsList();

        opera.replaceActor(actor2, "Romashko");
        opera.printActorsList();
        ballet.replaceActor(actor1, "Orlov");
        ballet.printActorsList();
        show.replaceActor(actor3, "Karpov");

        ballet.printLibrettoText();
        opera.printLibrettoText();

        show.printDirector();
        ballet.printDirector();
        opera.printDirector();
    }
}

