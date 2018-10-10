public class Motorino {
  private String colore;
  private float velocita = 0.f;
  private String tipo;
  private boolean antifurto = false;

  public Motorino(String colore, String tipo, float velocita) {
    this.colore = colore;
    this.tipo = tipo;
    this.velocita = velocita;
  }

  public float getVelocita() {
    return this.velocita;
  }

  public void accellera(float accellerazione) {
    if (verifica())
      this.velocita = this.velocita + accellerazione;
  }

  private boolean verifica() {
    if (antifurto == false) {
      return true;
    } else {
      System.out.println("ERRORE antifurto inserito ueueueueueue");
      return false;
    }
  }

  public void inserisciAntifurto() {
    this.antifurto = true;
  }
}
