// This is the Ship class
//Lab 2 Tyler Vincent and Jayden Lacomb
// 9/2/22


class Ship
{

    private String name;
    private String nation;
    private int year;
    private int length;
    private int draft;
    private int beam;

    public Ship(String nam, String nat,int yer, int len, int dra, int bem)
    {
        name = nam;
        year = yer;
        nation = nat;
        length = len;
        draft = dra;
        beam = bem;
    }

    public int calculateDisplacement()
    {
        return length*beam*draft;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setNation(String na)
    {
        nation = na;
    }
    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }

    public String getNation()
    {
        return nation;
    }

    public String toString()
    {
        return name +", "+
                year + ", " +
                nation+ ", " +
                "Size: "+length +" by " +beam+" by "+draft;

    }

    public int getLength(){
        return length;
    }

    public int getDraft() {
        return draft;
    }

    public int getBeam() {
        return beam;
    }




}