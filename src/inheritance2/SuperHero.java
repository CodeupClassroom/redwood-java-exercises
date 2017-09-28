package inheritance2;

class SuperHero extends Person {
    private String alterEgo;
    public SuperHero(String name, String alterEgo) {
        super(name);
        this.alterEgo = alterEgo;
    }
    public String getName() {
        return alterEgo;
    }
    public String getSecretIdentity() {
        return super.getName();
    }
}
