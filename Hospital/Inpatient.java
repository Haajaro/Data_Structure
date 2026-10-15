package Hospital;
public class Inpatient extends Patient {
    double roomCharge;
    int numberOfDays;

    public Inpatient(String name, double consultFee,
                     double roomCharge, int numberOfDays) {
        super(name, consultFee);
        this.roomCharge = roomCharge;
        this.numberOfDays = numberOfDays;
    }

    public double CalculateBill() {
        return (numberOfDays * roomCharge) + consultFee;
    }

    @Override
    public void Display() {
        System.out.println("=== INPATIENT ===");
        System.out.println("Name: " + name);
        System.out.println("Consult Fee: $" + consultFee);
        System.out.println("Room Charge: $" + roomCharge);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Total Bill: $" + CalculateBill());
    }
}