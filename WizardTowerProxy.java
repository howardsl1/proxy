import java.util.ArrayList;

public class WizardTowerProxy implements WizardTower {
    public ArrayList<Wizard> wiz;
    public IvoryTower tower;
    
    public WizardTowerProxy(IvoryTower tower) {
        wiz = new ArrayList<Wizard>();
        this.tower = tower;
    }

    public void enter(Wizard wizard) {
    }

    public void exit(Wizard wizard) {
    }
}

