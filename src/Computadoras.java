class Computadoras extends Dispositivos_electronicos{
    private String usuario;
    private String configuraciones;

    public Computadoras(String buscador, String configuraciones) {
        this.usuario = buscador;
        this.configuraciones = configuraciones;

    }

    public Computadoras(String contraseña) {
        super();
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + usuario + ", Modelo: " + configuraciones + ", Año: " );
    }
}