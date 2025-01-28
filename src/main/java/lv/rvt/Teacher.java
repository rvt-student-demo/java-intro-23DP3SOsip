package lv.rvt;

public class Teacher extends Person {
    private int nauda;

    public Teacher(String name, String adress, int nauda) {
        super(name, adress);
        this.nauda = nauda;
    }

    @Override
    public String toString() {
        return super.toString() + "\n salary " + this.nauda + " euro/month";
    }
    
}
