// This is the Yacht class
//Lab 2 Tyler Vincent and Jayden Lacomb
// 9/2/22



public class Yacht extends Ship{

    private int numStateRooms;
    private double poolSize;
    private int numDecks;
    private int power;

    public Yacht (int nsr, double pSiz, int numDec, int pow,
                  String nam, String nat,int yer, int len, int dra, int bem)
    {
        super(nam, nat, yer, len, dra, bem);
        numStateRooms = nsr;
        poolSize = pSiz;
        numDecks = numDec;
        power = pow;
    }


}
