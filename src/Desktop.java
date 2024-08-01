class Desktop extends Computadoras{
    private static final String configuracion = "";
    private String contraseña;

    public Desktop(String contraseña) {
        super(contraseña, configuracion);
        this.contraseña = contraseña;
    }

    public static void add(Desktop laptops) {
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Bienvenido Usuario " );
    }
}