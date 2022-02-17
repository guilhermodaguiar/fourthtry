package nl.novi.TicTacToe;

public class Voetbalclub {
    //velden
    private String naam;
    private String afkorting;
    private int oprichtingsjaar;

    //constructor
    public Voetbalclub(String naam, String afkorting,int oprichtingsjaar){
        this.afkorting = afkorting;
        this.naam = naam;
        this.oprichtingsjaar = oprichtingsjaar;
    }

    //getters
    public String getNaam(){
        return naam;
    }

    public String getAfkorting() {
        return afkorting;
    }

    public int getOprichtingsjaar() {
        return oprichtingsjaar;
    }

    //setters
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void setAfkorting(String afkorting) {
        this.afkorting = afkorting;
    }

    public void setOprichtingsjaar(int oprichtingsjaar) { this.oprichtingsjaar = oprichtingsjaar;
    }

}

