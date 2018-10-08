public class Docente {

  private String nome;
  private String cognome;
  private String codice;
  protected int eta;

  public class Docente(String nome, String cognome, String codice, int eta) {
    this.nome = nome;
    this.cognome = cognome;
    this.codice = codice;
    this.eta = eta;
  }

  public String getNome() {
    return this.nome;
  }

  public String getCognome() {
    return this.cognome;
  }

  public String getCodice() {
    return this.codice;
  }

  public int getEta() {
    return this.eta;
  }

}
