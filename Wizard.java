public class Wizard {
    public String name;
    public int credits;

    public Wizard(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public void setName() {
        this.name = name;
    }

    public void setCredAccum(int credAcc) {
        credits += credAcc;
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append(name + " has " + credits + " credits accumulated");
        return str.toString();
    }
}
