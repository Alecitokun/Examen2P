package Pedido;

public class Suma {
        public int sumar(int numero1, int numero2) {
            return numero1 + numero2;
        }
        public int sumar(int numero1, int numero2, int numero3) {
            return numero1 + numero2 + numero3;
        }
        public double sumar(double numero1, double numero2) {
            return numero1 + numero2;
        }
        public double sumar(double numero1, double numero2, double numero3) {
            return numero1 + numero2 + numero3;
        }
        public static void main(String[] args) {
            Suma suma = new Suma();

            int resultado1 = suma.sumar(5, 3);
            int resultado2 = suma.sumar(2, 4, 6);
            double resultado3 = suma.sumar(3.5, 2.1);
            double resultado4 = suma.sumar(1.2, 2.3, 0.5);

            System.out.println("Resultado 1: " + resultado1);
            System.out.println("Resultado 2: " + resultado2);
            System.out.println("Resultado 3: " + resultado3);
            System.out.println("Resultado 4: " + resultado4);
        }
    }

