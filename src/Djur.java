public class Djur {

    protected int vikt;
    protected int energi;
    protected boolean levande;
    protected int antal_djur = 0;

    Djur(float vikt, int energi) {
        vikt = 40;
        energi = 3000;
        levande = true;
        antal_djur++;

    }

    void äta(int energi) {
        energi += 500;
    }

    void spring(int meter) {
        energi = energi - meter * vikt;
        if (energi <= 0) {
            levande = false;
        }
    }

    String läte() {

        return "djuret låter";
    }

}
