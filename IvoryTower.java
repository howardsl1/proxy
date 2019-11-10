public class IvoryTower implements WizardTower {
    Wizard wizard;
    public IvoryTower() {

    }

    public void enter(Wizard wizard) {
        System.out.println("Welcome " + wizard.getName() + " to the Ivory Tower");
    }

    public void exit(Wizard wizard) {
        System.out.println("Goodbye " + wizard.getName() + " from the tower");
    }
}
