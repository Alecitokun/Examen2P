package Pedido;

public class Pedido {
    public double calcularValorPedido(String primerPlato, String bebida) {
        double precioPrimerPlato = 15.0;
        double precioBebida = 5.9;
        return precioPrimerPlato + precioBebida;
    }
    public double calcularValorPedido(String primerPlato, String segundoPlato, String bebida) {
        double precioPrimerPlato = 20.0;
        double precioSegundoPlato = 45.0;
        double precioBebida = 7.3;
        return precioPrimerPlato + precioSegundoPlato + precioBebida;
    }
    public double calcularValorPedido(String primerPlato, String segundoPlato, String bebida, String postre) {
        double precioPrimerPlato = 35.0;
        double precioSegundoPlato = 45.0;
        double precioBebida = 4.2;
        double precioPostre = 12.5;
        return precioPrimerPlato + precioSegundoPlato + precioBebida + precioPostre;
    }
}
