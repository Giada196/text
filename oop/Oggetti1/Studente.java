package Oggetti1;

public class Studente {
    private final String nome;
    private final String cognome;
    private final int id;

    public Studente(String nome, String cognome, int id) {
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    /*
     * public void setCognome(String cognome) {
     * this.cognome = cognome;
     * }
     * 
     * public void setId(int id) {
     * this.id = id;
     * }
     * 
     * public void setNome(String nome) {
     * this.nome = nome;
     * }
     */

    @Override
    public String toString() {
        return "nome= " + nome + "\n" +
                "Cognome= " + cognome + "\n" + "id= " + id;
    }

}
