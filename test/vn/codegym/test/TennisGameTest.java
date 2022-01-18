package vn.codegym.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vn.codegym.c1121i1.clean.code.TennisGame;

public class TennisGameTest {
    @Test
    public void testFifteenAll() {
        String result = TennisGame.getCorrespondingCall("Tung, Dumg", "Truong", 1, 1);
        Assertions.assertEquals(TennisGame.ADVANTAGE_PLAYER_1, result);
    }

    @Test
    public void testDeuce() {
        String result = TennisGame.getCorrespondingCall("Tung, Dumg", "Truong", 5, 5);
        Assertions.assertEquals(TennisGame.DEUCE, result);
    }

}
