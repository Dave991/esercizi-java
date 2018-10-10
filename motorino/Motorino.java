public class Motorino {
  private String colore;
  private float velocita = 0.f;
  private String tipo;
<<<<<<< HEAD
  private boolean antifurto=true;
=======
  private boolean antifurto = false;
>>>>>>> 7c4cef8ba55756e51cc2a68cbef837e2210a3659

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
    this.velocita = 0;
  }
<<<<<<< HEAD

  public void togliAntifurto()
  {
    this.antifurto = false;
  }
=======
>>>>>>> 7c4cef8ba55756e51cc2a68cbef837e2210a3659
}
