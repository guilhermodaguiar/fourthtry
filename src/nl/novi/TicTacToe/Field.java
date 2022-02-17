package nl.novi.TicTacToe;

public class Field {
    // Velden/Attributen
    private String token;
    private boolean isOccupied;


    //constructors
    public Field (String token){
        this.token = token;
        this.isOccupied = false;
    }

    //Methodes/functies
    public void setToken(String token){
        if (isOccupied == false){
            this.token = token;
        }
        isOccupied = true;
        }

    public String getToken() {
        return token;
    }
}

