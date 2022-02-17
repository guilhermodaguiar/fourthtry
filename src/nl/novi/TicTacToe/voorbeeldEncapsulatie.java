package nl.novi.TicTacToe;

public class voorbeeldEncapsulatie {
    public static void main(String[] args){
        Voetbalclub ajax = new Voetbalclub("Ajax Amsterdam", "AFCA", 1902);
        System.out.println(ajax.getNaam() + " is opgericht in: " + ajax.getOprichtingsjaar());
    }

}
