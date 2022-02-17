package nl.novi.TicTacToe;

public class Game {

    // Velden/Attributen
    private Player playerA;
    private Player playerB;

    private Player currentPlayer;

    // Constructors
    //waarde van playerA en playerB initialiseren op de moment dat er een nieuwe game wordt gemaakt.

    public Game(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;

        currentPlayer = playerA;
    }

    public Player getCurrentPlayer(){
        return currentPlayer;
    }


    // Methoden/functies
    // een methode dat zorgt dat je van speler kan wisselen.
    public void switchPlayer() {
        if (currentPlayer== playerA) {
            currentPlayer = playerB;
        } else {
            currentPlayer = playerA;
        }
    }

    // een methode dat kijkt of er een speler heeft gewonnen.
    public boolean hasPlayerWon(Field[] board) {
        String currentPlayerToken = currentPlayer.getToken();

        // horizontaal om te winnen
        if (board[0].getToken() == currentPlayerToken && board[1].getToken() == currentPlayerToken && board[2].getToken() == currentPlayerToken) {
            return true;
        }
        if (board[3].getToken() == currentPlayerToken && board[4].getToken() == currentPlayerToken && board[5].getToken() == currentPlayerToken) {
            return true;
        }
        if (board[6].getToken() == currentPlayerToken && board[7].getToken() == currentPlayerToken && board[8].getToken() == currentPlayerToken) {
            return true;
        }

        // verticaal om te winnen
        if (board[0].getToken() == currentPlayerToken && board[3].getToken() == currentPlayerToken && board[6].getToken() == currentPlayerToken) {
            return true;
        }
        if (board[1].getToken() == currentPlayerToken && board[4].getToken() == currentPlayerToken && board[7].getToken() == currentPlayerToken) {
            return true;
        }
        if (board[2].getToken() == currentPlayerToken && board[5].getToken() == currentPlayerToken && board[8].getToken() == currentPlayerToken) {
            return true;
        }

        // diagonaal om te winnen
        if (board[0].getToken() == currentPlayerToken && board[4].getToken() == currentPlayerToken && board[8].getToken() == currentPlayerToken) {
            return true;
        }
        if (board[2].getToken() == currentPlayerToken && board[4].getToken() == currentPlayerToken && board[6].getToken() == currentPlayerToken) {
            return true;
        }
        return false;
    }
}


