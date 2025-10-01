public class Calculadora {

    // Atributos
    private float num1;
    private float num2;

    // Metodos


    public Calculadora() {
    }

    public float sumar() {
        return num1 + num2;
    }

    public float restar() {
        return num1 - num2;
    }

    public float multiplicar() {
        return num1 * num2;
    }

    public float dividir() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division por cero");
            return 0;
        }
    }

    public double potencia() {
        return Math.pow(num1, num2);
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
}
