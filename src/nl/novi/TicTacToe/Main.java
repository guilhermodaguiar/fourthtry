package nl.novi.TicTacToe;

import java.util.Scanner;

public class Main<board, currentPlayer> {

    public static void main(String[] args) {
        System.out.println("Welcome bij Tic Tac Toe");

        // stap 1: maak een bord
        Field[] board = new Field[9];

        for (int i = 0; i < 9; i++) {
            board[i] = new Field( Integer.toString(i));
        }

        //Toon het bord
        printBoard(board);

        Player playerA = new Player("X", "X");
        Player playerB = new Player("O ", "O");

        Game game = new Game(playerA, playerB);


        boolean hasWon = false;

        // stap 2: geef de speler de mogelijkheid om een symbool te zetten waar die dat wilt.

        while (hasWon == false) {
            System.out.print("\n Voer een cijfer 0 t/m 8 om op het bord een " + game.getCurrentPlayer().getName() + " zetten");

            Scanner userInput = new Scanner(System.in);

            int selectedField = userInput.nextInt();

            String currentPlayerToken = game.getCurrentPlayer().getName();

            board[selectedField].setToken(currentPlayerToken);

            // Toon het bord
            printBoard(board);

            hasWon = game.hasPlayerWon(board);

            if(hasWon){
                game.getCurrentPlayer().setScore(1);
            }

            // Van speler wisselen
            game.switchPlayer();
        }

        System.out.println("Speler " + playerA.getName() + "heeft een score van " + playerA.getScore());
        System.out.println("Speler " + playerB.getName() + "heeft een score van " + playerB.getScore());



    }


    public static void printBoard(Field[] board) {

        //Toon bord
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i].getToken());

            boolean isEndOfRow = (i + 1) % 3 == 0;
            boolean isLastField = i == 8;

            if (isEndOfRow == false) {
                System.out.print(" | ");
            }

            if (isEndOfRow && !isLastField) {
                System.out.println(" \n________");

            }

        }
    }

    public static Player switchPlayer(Player currentPlayer, Player playerA, Player playerB) {
        if (currentPlayer.getToken() == "X") {
            return playerB;
        } else {
            return playerA;
        }
    }

    public static boolean hasPlayerWon(String[] board, String currentPlayer ){
    // horizontaal om te winnen
    if (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer){
        return true;
    }
    if (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer){
        return true;
    }
    if (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer){
        return true;
    }

    // verticaal om te winnen
    if (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer){
        return true;
        }
    if (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer){
        return true;
        }
    if (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer){
        return true;
        }

    // diagonaal om te winnen
    if (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer){
        return true;
    }
    if (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer){
        return true;
        }
    return false;
    }

}


