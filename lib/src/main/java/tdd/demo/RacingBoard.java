package tdd.demo;

import java.util.ArrayList;
import java.util.List;

public class RacingBoard {

    private final List<Race> storage;

    public RacingBoard(List<Race> storage) {
        if(storage == null) {
            throw new IllegalArgumentException();
        }
        this.storage = storage;
    }

    public void addRace(Race race) {
        storage.add(race);
    }

    public List<Race> getRaces() {
        return new ArrayList<>();
    }
}
