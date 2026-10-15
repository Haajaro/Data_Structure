package Hospital;
public class Outpatient extends Patient {
    double labCharge;

    public Outpatient(String name, double consultFee, double labCharge) {
        super(name, consultFee);
        this.labCharge = labCharge;
    }

    public double CalculateBill() {
        return labCharge + consultFee;
    }

    @Override
    public void Display() {
        System.out.println("=== OUTPATIENT ===");
        System.out.println("Name: " + name);
        System.out.println("Consult Fee: $" + consultFee);
        System.out.println("Lab Charge: $" + labCharge);
        System.out.println("Total Bill: $" + CalculateBill());
    }
}