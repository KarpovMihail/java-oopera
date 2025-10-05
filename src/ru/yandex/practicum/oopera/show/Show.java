package ru.yandex.practicum.oopera.show;

import ru.yandex.practicum.oopera.person.Actor;
import ru.yandex.practicum.oopera.person.Director;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addActorToShow(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println(actor + " уже есть в списке.");
            return;
        }
        listOfActors.add(actor);
        System.out.println("Актер " + actor + "добавлен в список.");

    }

    public void replaceActor(Actor actor, String surname) {
        int sumActorsToReplace = 0;
        Actor actorToReplace = null;

        for (Actor actorFromList : listOfActors) {
            if (actorFromList.getSurname().equals(surname)){
                actorToReplace = actorFromList;
                sumActorsToReplace++;
            }
        }

        if (actorToReplace == null) {
            System.out.println("Такого актера нет в списке.");
        } else if ( sumActorsToReplace > 1) {
            System.out.println("Актеров с такой фамилией больше одного.");
        } else {
            listOfActors.remove(actorToReplace);
            listOfActors.add(actor);
        }
    }

    public void printActorsList() {
        System.out.println(getClass().getSimpleName() + " " +
                " actor list:" + listOfActors);
    }
}