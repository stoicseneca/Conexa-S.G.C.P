package model;

public class Cliente {
    private int id;
    private String operador;
    private int numeroCliente;
    private double valorKWh;
    private String email;
    private String tipoProyecto;
    private String mesPrimeraLectura;
    private int valorMaximoConsumo;
    private int valorMinimoConsumo;
    private int consumoPromedio6Meses;
    private String fases;
    private double costoProyecto;
    private String notasCliente;

    //constructor
    public Cliente(int id, String operador, int numeroCliente, double valorKWh,
                   String email, String tipoProyecto, String mesPrimeraLectura,
                   int valorMaximoConsumo, int valorMinimoConsumo,
                   int consumoPromedio6Meses, String fases, double costoProyecto,
                   String notasCliente) {
        this.id = id;
        this.operador = operador;
        this.numeroCliente = numeroCliente;
        this.valorKWh = valorKWh;
        this.email = email;
        this.tipoProyecto = tipoProyecto;
        this.mesPrimeraLectura = mesPrimeraLectura;
        this.valorMaximoConsumo = valorMaximoConsumo;
        this.valorMinimoConsumo = valorMinimoConsumo;
        this.consumoPromedio6Meses = consumoPromedio6Meses;
        this.fases = fases;
        this.costoProyecto = costoProyecto;
        this.notasCliente = notasCliente;
    }
    //getters y setters
    public int getId(){return id;}
    public String getOperador(){return operador;}
    public int getNumeroCliente(){return numeroCliente;}
    public double getValorKWh(){return valorKWh;}
    public String getEmail(){return email;}
    public String getTipoProyecto() {return tipoProyecto;}
    public String getMesPrimeraLectura(){return mesPrimeraLectura;}
    public int getValorMaximoConsumo(){return valorMaximoConsumo;}
    public int getValorMinimoConsumo(){return valorMinimoConsumo;}
    public int getConsumoPromedio6Meses(){return consumoPromedio6Meses;}
    public String getFases(){ return fases;}
    public double getCostoProyecto(){return costoProyecto;}
    public String getNotasCliente(){return notasCliente;}
}