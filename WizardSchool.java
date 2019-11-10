public class WizardSchool {

    public static void main(String[] args) {
        Wizard sam = new Wizard("Sam", 120);
        Wizard dave = new Wizard("Dave", 150);
        Wizard larry = new Wizard("Larry", 260);
        Wizard harry = new Wizard("Harry", 200);
        Wizard mike = new Wizard("Mike", 30);
        Wizard ron = new Wizard("Ron", 320);
        
        IvoryTower tower = new IvoryTower();
        WizardTowerProxy proxy = new WizardTowerProxy(tower);
        
        proxy.enter(sam);
        proxy.enter(dave);
        proxy.enter(mike);
        proxy.enter(larry);
        proxy.enter(harry);
        proxy.exit(mike);
        proxy.enter(ron);
        proxy.exit(dave);
    }
}
