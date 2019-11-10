import java.util.ArrayList;

public class WizardTowerProxy implements WizardTower {
    public ArrayList<Wizard> wiz;
    public IvoryTower tower;
    public Wizard wizard;

    public WizardTowerProxy(IvoryTower tower) {
        wiz = new ArrayList<Wizard>();
        tower = new IvoryTower();
    }

    public void enter(Wizard wizard) {
        IvoryTower tower = new IvoryTower();
        if (wizard.getCredits() >= 100 && wiz.size() < 4) {
                System.out.println(wizard.toString() + " has met the criteria");
                wiz.add(wizard);
                tower.enter(wizard);
        } else {
            System.out.println("Wizard not allowed in");
        }
    }

    public void exit(Wizard wizard) {
        IvoryTower tower = new IvoryTower();
        boolean c = false;;
        if (wiz.size() > 0) {
            for (int i = 0; i < wiz.size(); i++) {
                if (wizard.getName().equals(wiz.get(i).getName())) { 
                    System.out.println(wizard.toString() + " has left the tower.");
                    tower.exit(wizard);
                    wiz.remove(i);
                    c = true;
                }
            }
        }
        if (!c) {
            System.out.println(wizard.getName() + " you are not in the tower!");
        }
    }
}

