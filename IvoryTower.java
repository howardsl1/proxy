public class IvoryTower implements WizardTower {
    //public String name;

    public IvoryTower() {
      //  name = "Ivory Tower";
    }

    public void enter(Wizard wizard) {
        
        System.out.println("Welcome " + wizard.getName() + " to the Ivory Tower");
    }

    public void exit(Wizard wizard) {
        System.out.println("Goodbye from the tower");
    }
}
