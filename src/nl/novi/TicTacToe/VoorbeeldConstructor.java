package nl.novi.TicTacToe;

public class VoorbeeldConstructor {
    public static void main(String[] args){

     Voetbalclub ajax = new Voetbalclub("Ajax Amsterdam","AFCA", 1902 );
        System.out.println(ajax.getNaam() + " is een voetbalclub die opgericht is in " + ajax.getOprichtingsjaar());
    }
}
