public class Circulo1 {
    private double radio;

    public Circulo1(double radio) {
        if (radio<0) {
            this.radio=0;
        } else {
            this.radio=radio;
        }
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        Circulo1 circulo = new Circulo1(5.0);
        System.out.println("Radio del círculo: " + circulo.getRadio());
        System.out.println("Área del círculo: " + circulo.getArea());
    }

     public static class Cilindro extends Circulo1 {
        private double altura;

        public Cilindro(double radio, double altura) {
            super(radio);

            if (altura < 0) {
                this.altura=0;
            } else {
                this.altura=altura;
            }
        }

        public double getAltura() {
            return altura;
        }

        public double getVolumen() {
            return getArea() * altura;
        }


        public static void main(String[] args) {
            Cilindro cilindrin = new Cilindro(5.0, 10.0);
            System.out.println("Radio del cilindro: " + cilindrin.getRadio());
            System.out.println("Altura del cilindro: " + cilindrin.getAltura());
            System.out.println("Área del cilindro: " + cilindrin.getArea());
            System.out.println("Volumen del cilindro: " + cilindrin.getVolumen());
        }

    }

}


