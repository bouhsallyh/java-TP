package ma.education.tp1.introduction;

public class Test {
    public static void main(String[] args) {
        Salle o1 = new Salle();
        Salle o2 = new Salle("salle d'info");
        Salle o3 = new Salle(2,"Salle des cours");
        System.out.println(o1);
        System.out.println(o2.id+" "+o2.nom);
        System.out.println(o3.id+" "+o3.nom);
    }
}
