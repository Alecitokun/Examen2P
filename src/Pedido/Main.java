package Pedido;

public class Main {
    public static void main(String[] args) {
            Pedido pedido = new Pedido();

            double valorPedido1 = pedido.calcularValorPedido("Pizza", "Limonada");
            double valorPedido2 = pedido.calcularValorPedido("Trancapecho", "Pique", "Aguardiente");
            double valorPedido3 = pedido.calcularValorPedido("Pollo", "Saice", "VinoTinto", "Helado");
        double valorPedido4 = pedido.calcularValorPedido("Pollo", "Saice", "VinoTinto", "Helado");

            System.out.println("Valor del Pedido 1:  $" + valorPedido1);
            System.out.println("Valor del Pedido 2:  $" + valorPedido2);
            System.out.println("Valor del Pedido 3:  $" + valorPedido3);
        System.out.println("Valor del Pedido 3:  $" + valorPedido4);


        }

    }
