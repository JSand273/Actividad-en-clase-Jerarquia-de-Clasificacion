class Electrodomesticos extends Dispositivos_electronicos {
    private String usuario;
    private String configuraciones;

    public Electrodomesticos(String buscador, String configuraciones) {
        this.usuario = buscador;
        this.configuraciones = configuraciones;

    }

    public Electrodomesticos(String contraseña) {
        super();
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + usuario + ", Modelo: " + configuraciones + ", Año: " );
    }
}