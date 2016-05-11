package clientes;

public class ClientePreferencial extends Cliente {
    private String domicilio;
    private float saldo;
    private float limite;

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public ClientePreferencial(String nombre, String telefono, int numero, String domicilio, float saldo, float limite) {
        super(nombre, telefono, numero);
        this.domicilio = domicilio;
        this.saldo = saldo;
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ClientePreferencial{" + "domicilio=" + domicilio + ", saldo=" + saldo + ", limite=" + limite + '}';
    }
}
