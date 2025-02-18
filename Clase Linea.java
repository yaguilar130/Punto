class Linea {
    private Punto p1;
    private Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String trazar() {
        return "Línea desde " + p1.getX() + ", " + p1.getY() + " hasta " + p2.getX() + ", " + p2.getY();
    }

    public void dibujarLinea() {
        System.out.println(trazar());
    }
}
