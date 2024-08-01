class Smartphone extends DispositivoMovil {
    private static final String configuracion = "";
    private String contraseña;

    public Smartphone(String contraseña) {
        super(contraseña, configuracion);
        this.contraseña = contraseña;
    }

    public static void add(Smartphone smartphone) {
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Bienvenido Usuario " );
    }
}