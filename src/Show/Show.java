package Show;

import Person.*;

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

    public void addActorToShow(Actor actor){
        if (listOfActors.contains(actor)){
            System.out.println(actor + " уже есть в списке.");
            return;
        }
        listOfActors.add(actor);
        System.out.println("Актер " + actor + "добавлен в список.");

    }

    public void replaceActor(Actor actor, String surname) {
        for (Actor actorFromList : listOfActors) {
            if (actorFromList.getSurname().equals(surname)){
                listOfActors.remove(actorFromList);
                listOfActors.add(actor);
                return;
            }
        }
        System.out.println("Такого актера нет в списке.");
    }

    @Override
    public String toString() {
        return
                getClass().getName() + " " +
                        " actor list:" + listOfActors;
    }
}