class Tablet extends DispositivoMovil {
    private static final String configuracion = "";
    private String contraseña;

    public Tablet(String contraseña) {
        super(contraseña, configuracion);
        this.contraseña = contraseña;
    }

    public static void add(Tablet tablet) {
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Bienvenido Usuario " );
    }
}