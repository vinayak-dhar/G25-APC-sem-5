package Iheritance;

public class Test {
    public static void main(String[] args) {
        Nokia no = new Nokia();
        no.button();

        no.camera();
        no.calling();


//        parent object -> cannot use child methods
        Mobile mob = new Mobile();
//        mob.button();
        mob.calling();
        mob.camera();

//        reference to parent class and object of child class -> cannot use child class methods
        Mobile mob1 = new Nokia();
//        mob1.button();
        mob1.camera();
        mob1.calling();


//        reference to child class and object of parent class
//        Nokia no1 = new Mobile(); // cannot covert from mobile to nokia class
    }
}
