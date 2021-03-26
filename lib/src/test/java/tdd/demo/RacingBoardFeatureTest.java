package tdd.demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RacingBoardFeatureTest {

    @Test
    //@Disabled
    public void shouldDisplayBoardWithRaces() {

        RacingBoard racingBoard = givenARacingBoardIsSetUp();

        whenIListTheRacesBoard(racingBoard);

        thenICanSeeAllRacesBeingDisplayed();
    }

    private RacingBoard givenARacingBoardIsSetUp() {
        RacingBoard racingBoard = new RacingBoard(new ArrayList<>());
        Race race1 = new Race();
        racingBoard.addRace(race1);
        Race race2 = new Race();
        racingBoard.addRace(race2);
        return racingBoard;
    }

    private List<Race> whenIListTheRacesBoard(RacingBoard racingBoard) {
        return racingBoard.getRaces();
    }

    private void thenICanSeeAllRacesBeingDisplayed() {
        throw new UnsupportedOperationException();
    }
}
