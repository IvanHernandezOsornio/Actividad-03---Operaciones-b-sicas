
package Controlador;
import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    Modelo modelo=new Modelo();
    Vista vista=new Vista();
    
    public Controlador( Vista vista , Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.jb_suma.addActionListener(this);
        this.vista.jb_resta.addActionListener(this);
        this.vista.jb_modulo.addActionListener(this);
        this.vista.jb_multiplicacion.addActionListener(this);
        this.vista.jb_division.addActionListener(this);
    }

    public void Iniciar() {
        vista.setTitle("Calculadora MVC");
        vista.setLocationRelativeTo(null);
        vista.jtf_numero1.setText(String.valueOf(modelo.getNumero()) );
        vista.jtf_numero2.setText(String.valueOf(modelo.getNumero2()) );
        vista.jl_resultado.setText(String.valueOf(modelo.getOperador()) );
     }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       modelo.setNumero(Double.parseDouble(vista.jtf_numero1.getText())) ;
       modelo.setNumero2(Double.parseDouble(vista.jtf_numero2.getText())) ;
       if (e.getSource()== vista.jb_suma)modelo.setOperador("+");
       if (e.getSource()== vista.jb_resta)modelo.setOperador("-");
       if (e.getSource()== vista.jb_modulo)modelo.setOperador("%");
       if (e.getSource()== vista.jb_multiplicacion)modelo.setOperador("*");
       if (e.getSource()== vista.jb_division)modelo.setOperador("/");
       vista.jl_resultado.setText(String.valueOf(modelo.operacion()) ) ;
       
    }

   
}
