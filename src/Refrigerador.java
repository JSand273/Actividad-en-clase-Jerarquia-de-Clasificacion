class Refrigerador extends Electrodomesticos {
    private static final String configuracion = "";

    public Refrigerador(String contraseña) {
        super(contraseña, configuracion);

    }

    public static void add(Refrigerador refrigerador) {
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Bienvenido Usuario " );
    }
}