import javax.swing.*;// Add this in your constructor or initialization method
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
        //hacer visible el formulario
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        uno1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uno1ButtonListener();
            }
        });

        dos2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dos2ButtonListener();
            }
        });

        tres3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tres3ButtonListener();
            }
        });

        cuatro4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuatro4ButtonListener();
            }
        });

        cinco5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cinco5ButtonListener();
            }
        });

        seis6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seis6ButtonListener();
            }
        });

        siete7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                siete7ButtonListener();
            }
        });

        ocho8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ocho8ButtonListener();
            }
        });

        nueve9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nueve9ButtonListener();
            }
        });

        cero0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cero0ButtonListener();
            }
        });

        sumaABButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumaABButtonListener();
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrarButtonListener();
            }
        });

        potenciaABButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                potenciaABButtonListener();
            }
        });

        restaABButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restaABButtonListener();
            }
        });

        multiplicacionABButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplicacionABButtonListener();
            }
        });

        divisionABButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                divisionABButtonListener();
            }
        });

        resultadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               resultadoButtonListener();
            }
        });

        puntoDecButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                puntoDecButtonListener();
            }
        });
    }

    public void sumaABButtonListener() {
        operacion = 1;
    }

    public void restaABButtonListener() {
        operacion = 2;
    }

    public void multiplicacionABButtonListener() {
        operacion = 3;
    }

    public void divisionABButtonListener() {
        operacion = 4;
    }

    public void potenciaABButtonListener() {
        operacion = 5;
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
            operacion = 0;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panelPrincipal, "Ingrese numeros validos");
        }
    }

    public void borrarButtonListener() {
        if (operacion != 0) {
            operadorTextField2.setText("");
            operandoTextField1.setText("");
            resultadoTextField3.setText("");
        } else {
            operandoTextField1.setText("");
            operadorTextField2.setText("");
            resultadoTextField3.setText("");
        }
    }

    public void uno1ButtonListener() {
        if (operacion != 0) {
            operadorTextField2.setText(operadorTextField2.getText() + "1");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "1");
        }
    }

    public void dos2ButtonListener() {
        if (operacion != 0) {
            operadorTextField2.setText(operadorTextField2.getText() + "2");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "2");
        }
    }

    public void tres3ButtonListener() {

        if (operacion != 0) {
            operadorTextField2.setText(operadorTextField2.getText() + "3");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "3");
        }
    }

    public void cuatro4ButtonListener() {
        if (operacion != 0) {
            operadorTextField2.setText(operadorTextField2.getText() + "4");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "4");
        }
    }

    public void cinco5ButtonListener() {
        if (operacion != 0) {
            operadorTextField2.setText(operadorTextField2.getText() + "5");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "5");
        }
    }

    public void seis6ButtonListener() {
        if (operacion != 0) {
            operadorTextField2.setText(operadorTextField2.getText() + "6");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "6");
        }
    }

    public void siete7ButtonListener() {
        if (operacion != 0) {
            operadorTextField2.setText(operadorTextField2.getText() + "7");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "7");
        }
    }

    public void ocho8ButtonListener() {
        if (operacion != 0) {
            operadorTextField2.setText(operadorTextField2.getText() + "8");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "8");
        }
    }

    public void nueve9ButtonListener() {
        if (operacion != 0) {
            operadorTextField2.setText(operadorTextField2.getText() + "9");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "9");
        }
    }

    public void cero0ButtonListener() {
        if (operacion != 0) {
            operadorTextField2.setText(operadorTextField2.getText() + "0");
        } else {
            operandoTextField1.setText(operandoTextField1.getText() + "0");
        }
    }

    public void puntoDecButtonListener() {
        if (operacion != 0) {
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
