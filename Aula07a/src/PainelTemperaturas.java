import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;


public class PainelTemperaturas extends JPanel {
	
	private JTextField caixaTextoTemperatura;
	private JLabel rotuloCelsius, rotuloFarenheit;
	private JButton BotaoConverte;
	
	public PainelTemperaturas (){
		
			GridLayout GridLayout=new GridLayout (2,2,1,1);
			this.setLayout(GridLayout);
			caixaTextoTemperatura = new JTextField();
			this.add(caixaTextoTemperatura);
			rotuloCelsius = new JLabel ("Celsius", JLabel.RIGHT);
			this.add(rotuloCelsius);
			BotaoConverte = new JButton ("Converter");
			this.add(BotaoConverte);
			rotuloFarenheit=new JLabel ("Farenheit",JLabel.RIGHT);
			this.add(rotuloFarenheit);
				
		}
		
	}
