// This is the Cruise class
//Lab 2 Tyler Vincent and Jayden Lacomb
// 9/2/22



public class Cruise extends Ship {

    private int numExecStateRooms;
    private int doubleBunkRooms;
    private int quadBunkRooms;

    public Cruise(int exec, int doub, int quad,
                 String nam, String nat, int yer, int len, int dra, int bem)
    {
        super(nam, nat, yer, len, dra, bem);
        numExecStateRooms = exec;
        doubleBunkRooms = doub;
        quadBunkRooms = quad;
    }


}