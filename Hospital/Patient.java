package Hospital;
public class Patient {
    String name;
    double consultFee;

    public Patient(String name, double consultFee) {
        this.name = name;
        this.consultFee = consultFee;
    }

    public void Display() {
        System.out.println("Patient Name: " + name);
        System.out.println("Consult Fee: $" + consultFee);
        System.out.println("Total Bill: $" + consultFee);
    }
}