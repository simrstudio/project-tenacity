package data.dataobjects;

public class Familiar {

    private String name;
    private int lp;
    private int maxhit;
    private int attack;
    private int defence;
    private int ranged;
    private int magic;
    private int invenSpaces;
    private int summonReq;

    public Familiar(String name, int lp, int maxhit, int attack, int defence, int ranged, int magic, int invenSpaces, int summonReq) {
        this.name = name;
        this.lp = lp;
        this.maxhit = maxhit;
        this.attack = attack;
        this.defence = defence;
        this.ranged = ranged;
        this.magic = magic;
        this.invenSpaces = invenSpaces;
        this.summonReq = summonReq;
    }

    public int getInvenSpaces() {
        return invenSpaces;
    }
}
