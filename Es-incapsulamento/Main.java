public class Main {
    public static void main(String args[]) {
        Auto auto1 = new Auto(100, "EB00577", "Opel", "Astra");

        System.out.println("Cilindrata: " + auto1.getCilindrata());
        System.out.println("Targa: " + auto1.getTarga());
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modello: " + auto1.getModello());

        auto1.setCilindrata(200);
        auto1.setModello("Zafira");

        System.out.println("Dati aggiornati:" + "\n" + "Cilindrata: " + auto1.getCilindrata() + "\n" + "Modello: "
                + auto1.getModello());
    }
}