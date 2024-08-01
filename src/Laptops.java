class Laptops extends Computadoras {
    private static final String configuracion = "";
    private String contraseña;

    public Laptops(String contraseña) {
        super(contraseña, configuracion);
        this.contraseña = contraseña;
    }

    public static void add(Laptops laptops) {
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Bienvenido Usuario " );
    }
}
