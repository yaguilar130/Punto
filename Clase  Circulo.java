class Circulo {
    private Punto centro;
    private float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public String ostentacion() {
        return "Círculo con centro en " + centro.getX() + ", " + centro.getY() + " y radio " + radio;
    }

    public void dibujarCirculo() {
        System.out.println(ostentacion());
    }
}
