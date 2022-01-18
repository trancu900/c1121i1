package vn.codegym.c1121i1.clean.code;

public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final int NUMBER_OF_POINT_START = 1;
    public static final int NUMBER_OF_POINT_THREE = 3;
    public static final int NUMBER_OF_POINT_END = 4;


    private static String getDraw(int score) {
        String result;
        switch (score) {
            case 0:
                result = LOVE_ALL;
                break;
            case 1:
                result = FIFTEEN_ALL;
                break;
            case 2:
                result = THIRTY_ALL;
                break;
            case 3:
                result = FORTY_ALL;
                break;
            default:
                result = DEUCE;
                break;
        }
        return result;
    }

    private static String getAdvantage(int distance) {
        String result;
        if (distance == 1)
            result = ADVANTAGE_PLAYER_1;
        else if (distance == -1)
            result = ADVANTAGE_PLAYER_2;
        else if (distance >= 2)
            result = WIN_FOR_PLAYER_1;
        else
            result = WIN_FOR_PLAYER_2;
        return result;
    }


    private static String getCorrespondingCallLowerThanFour(int score) {
        String result = null;
        switch (score) {
            case 0:
                result = LOVE;
                break;
            case 1:
                result = FIFTEEN;
                break;
            case 2:
                result = THIRTY;
                break;
            case 3:
                result = FORTY;
                break;
        }
        return result;
    }

    public static String getCorrespondingCall(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = null;
        if (scorePlayer1 == scorePlayer2) {
            score = getDraw(scorePlayer1);
        } else if (scorePlayer1 >= NUMBER_OF_POINT_END || scorePlayer2 >= NUMBER_OF_POINT_END) {
            score = getAdvantage(scorePlayer1 - scorePlayer2);
        } else {
            int tempScore = 0;
            for (int i = NUMBER_OF_POINT_START; i < NUMBER_OF_POINT_THREE; i++) {
                if (i == 1)
                    tempScore = scorePlayer1;
                else {
                    score += "-";
                    tempScore = scorePlayer2;
                }
                score += getCorrespondingCallLowerThanFour(tempScore);
            }
        }
        return score;
    }
}