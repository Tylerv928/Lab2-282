// This is the Yacht class
//Lab 2 Tyler Vincent and Jayden Lacomb
// 9/2/22



public class Cargo extends Ship{

    private int refrigeratedStroage;
    private int maxTonnage;

    public Cargo (int refStore, int maxTon,
                  String nam, String nat,int yer, int len, int dra, int bem)
    {
        super(nam, nat, yer, len, dra, bem);
        refrigeratedStroage = refStore;
        maxTonnage = maxTon;
    }


}