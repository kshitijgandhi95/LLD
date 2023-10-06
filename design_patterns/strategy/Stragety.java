package strategy;

class Strategy {
    public static void main (String[] args) {
        Vehicle v = new SportsVehicle(new SportsDrive());
        v.drive();
    }
}