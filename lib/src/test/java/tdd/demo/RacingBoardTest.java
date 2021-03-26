package tdd.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RacingBoardTest {

    @Test
    public void shouldAddRace() {

        // given
        List<Race> racesStore = new ArrayList<>();
        RacingBoard racingBoard = new RacingBoard(racesStore);
        Race race = new Race();

        // when
        racingBoard.addRace(race);

        // then
        assertEquals(race, racesStore.get(0));
    }

    @Test void shouldGetEmptyWhenNoRacesHaveStarted() {

        List<Race> racesStore = new ArrayList<>();
        RacingBoard racingBoard = new RacingBoard(racesStore);

        List<Race> races = racingBoard.getRaces();

        assertEquals(0, races.size());
    }

    @Test
    public void shouldFailCreatingTheRaceStoreWhenInvalidStorage() {
        assertThrows(IllegalArgumentException.class, () -> new RacingBoard(null));
    }
}
