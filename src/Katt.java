class Katt extends Djur {

    Katt() {
        super(3, 10000);
    }

    @Override
    String läte() {
        return "Miiuuaaaoo";
    }

    void leka(String sak)
    {
        if (sak == "garn-nystan")
        {
            System.out.println("Leker med " + sak);
        }
    }
    
}
