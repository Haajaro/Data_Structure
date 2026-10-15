package Hospital;
public class main {
    public static void main(String[] args) {

        Patient patient = new Patient("Haajaro", 50);
        Outpatient out = new Outpatient("Moahamed", 50, 30);
        Inpatient in = new Inpatient("Ruquyo", 50, 100, 3);

        System.out.println("=== PATIENT ===");
        patient.Display();

        System.out.println();
        out.Display();

        System.out.println();
        in.Display();
    }
}