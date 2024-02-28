public class Main {

    public static void main(String args[]) {
        Auto cars = new Auto(100, "EB09119", "Opel", "Astra");
        System.out.println("Cilindrata: " + cars.getCilindrata() + "\n" + "Targa: " + cars.getTarga() + "\n" + "Marca: "
                + cars.getMarca() + "\n" + "Modello: " + cars.getModello());
    }
}
