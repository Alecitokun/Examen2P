package Pedido;

public class Pedido {
        public double calcularValorPedido(String primerPlato, String bebida) {
            // Calcular el valor del pedido con un primer plato y una bebida.
            // Primer plato
            double precioPrimerPlato = 15.0;
            // Precio de la Bebida
            double precioBebida = 5.9;
            //Resultado
            return precioPrimerPlato + precioBebida;
        }
        public double calcularValorPedido(String primerPlato, String segundoPlato, String bebida) {
            // Calcular el valor del pedido con un primer plato, un segundo plato y una bebida.
            // Primer plato
            double precioPrimerPlato = 20.0;
            // Segundo plato
            double precioSegundoPlato = 45.0;
            // Bebida
            double precioBebida = 7.3;
            //Resultados
            return precioPrimerPlato + precioSegundoPlato + precioBebida;
        }
        public double calcularValorPedido(String primerPlato, String segundoPlato, String bebida, String postre) {
            //Calcular el valor del pedido con un primer plato, un segundo plato, una bebida y un postre.
            // Primer plato
            double precioPrimerPlato = 35.0;
            // Segundo plato
            double precioSegundoPlato = 45.0;
            //  Bebida Seleccionada
            double precioBebida = 4.2;
            // Postre
            double precioPostre = 12.5;
            //Resultado
            return precioPrimerPlato + precioSegundoPlato + precioBebida + precioPostre;
        }

    }
}
