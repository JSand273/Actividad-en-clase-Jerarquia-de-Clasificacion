class DispositivoMovil extends Dispositivos_electronicos  {
    private String usuario;
    private String configuraciones;

    public DispositivoMovil(String buscador, String configuraciones) {
        this.usuario = buscador;
        this.configuraciones = configuraciones;

    }

    public DispositivoMovil(String contraseña) {
        super();
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + usuario + ", Modelo: " + configuraciones + ", Año: " );
    }
}