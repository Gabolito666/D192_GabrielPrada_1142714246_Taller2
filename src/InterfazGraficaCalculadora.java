import javax.swing.*;

public class InterfazGraficaCalculadora {

    // Atributos
    private Calculadora calculadora;
    private byte operacion; // 1: suma, 2: resta, 3: multiplicacion, 4: division, 5: potencia
    private JPanel panelPrincipal;
    private JLabel titulo;
    private JLabel labelOperando;
    private JLabel labelOperador;
    private JLabel labelResultado;
    private JTextField operandoTextField1;
    private JTextField operadorTextField2;
    private JTextField resultadoTextField3;
    private JButton borrarButton;
    private JButton potenciaABButton;
    private JButton sumaABButton;
    private JButton restaABButton;
    private JButton multiplicacionABButton;
    private JButton divisionABButton;
    private JButton resultadoButton;
    private JButton uno1Button;
    private JButton dos2Button;
    private JButton tres3Button;
    private JButton cuatro4Button;
    private JButton cinco5Button;
    private JButton seis6Button;
    private JButton siete7Button;
    private JButton ocho8Button;
    private JButton nueve9Button;
    private JButton cero0Button;
    private JButton puntoDecButton;


    //Metodos
    public InterfazGraficaCalculadora() {
    }

    public void sumaABButtonListener() {
        operacion = 1;
        labelOperador.setText("+");
    }

    public void restaABButtonListener() {
        operacion = 2;
        labelOperador.setText("-");
    }

    public void multiplicacionABButtonListener() {
        operacion = 3;
        labelOperador.setText("*");
    }

    public void divisionABButtonListener() {
        operacion = 4;
        labelOperador.setText("/");
    }

    public void potenciaABButtonListener() {
        operacion = 5;
        labelOperador.setText("^");
    }

    public void resultadoButtonListener() {
        calculadora = new Calculadora();
        try {
            calculadora.setNum1(Float.parseFloat(operandoTextField1.getText()));
            calculadora.setNum2(Float.parseFloat(operadorTextField2.getText()));
            float resultado = 0;
            switch (operacion) {
                case 1:
                    resultado = calculadora.sumar();
                    break;
                case 2:
                    resultado = calculadora.restar();
                    break;
                case 3:
                    resultado = calculadora.multiplicar();
                    break;
                case 4:
                    resultado = calculadora.dividir();
                    break;
                case 5:
                    resultado = (float) calculadora.potencia();
                    break;
                default:
                    JOptionPane.showMessageDialog(panelPrincipal, "Seleccione una operacion");
                    return;
            }
            resultadoTextField3.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panelPrincipal, "Ingrese numeros validos");
        }
    }

    public void borrarButtonListener() {
        operandoTextField1.setText("");
        operadorTextField2.setText("");
        resultadoTextField3.setText("");
        labelOperador.setText("?");
        operacion = 0;
    }

    public void uno1ButtonListener() {
        if (operadorTextField2.isFocusOwner()) {
            operadorTextField2.setText(operadorTextField2.getText() + "1");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "1");
        }
    }

    public void dos2ButtonListener() {
        if (operadorTextField2.isFocusOwner()) {
            operadorTextField2.setText(operadorTextField2.getText() + "2");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "2");
        }
    }

    public void tres3ButtonListener() {
        if (operadorTextField2.isFocusOwner()) {
            operadorTextField2.setText(operadorTextField2.getText() + "3");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "3");
        }
    }

    public void cuatro4ButtonListener() {
        if (operadorTextField2.isFocusOwner()) {
            operadorTextField2.setText(operadorTextField2.getText() + "4");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "4");
        }
    }

    public void cinco5ButtonListener() {
        if (operadorTextField2.isFocusOwner()) {
            operadorTextField2.setText(operadorTextField2.getText() + "5");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "5");
        }
    }

    public void seis6ButtonListener() {
        if (operadorTextField2.isFocusOwner()) {
            operadorTextField2.setText(operadorTextField2.getText() + "6");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "6");
        }
    }

    public void siete7ButtonListener() {
        if (operadorTextField2.isFocusOwner()) {
            operadorTextField2.setText(operadorTextField2.getText() + "7");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "7");
        }
    }

    public void ocho8ButtonListener() {
        if (operadorTextField2.isFocusOwner()) {
            operadorTextField2.setText(operadorTextField2.getText() + "8");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "8");
        }
    }

    public void nueve9ButtonListener() {
        if (operadorTextField2.isFocusOwner()) {
            operadorTextField2.setText(operadorTextField2.getText() + "9");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "9");
        }
    }

    public void cero0ButtonListener() {
        if (operadorTextField2.isFocusOwner()) {
            operadorTextField2.setText(operadorTextField2.getText() + "0");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "0");
        }
    }

    public void puntoDecButtonListener() {
        if (operadorTextField2.isFocusOwner()) {
            if (!operadorTextField2.getText().contains(".")) {
                operadorTextField2.setText(operadorTextField2.getText() + ".");
            }
        } else {
            if (!operandoTextField1.getText().contains(".")) {
                operandoTextField1.setText(operandoTextField1.getText() + ".");
            }
        }
    }



}
