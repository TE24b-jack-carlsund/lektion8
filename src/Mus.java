class Mus extends Djur {

    Mus() {
        super(1, 2000);
    }

    @Override
    String läte() {
        return "Piiiip";
    }

    void klättra() {
        System.out.println("Musen klättrar");
    }

}
