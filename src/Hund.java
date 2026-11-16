class Hund extends Djur {

    Hund() {
        super(8, 20000);
    }

    @Override
    String läte() {
        return "Vofff";
    }

    void spåra(String bytet)
    {
        if (bytet == "kanin")
        {
            System.out.println("Spårar: " + bytet);
        }
    }

}
