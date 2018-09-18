import javax.swing.JFrame;
import java.awt.BorderLayout;

public class JanelaDeTemperaturas extends JFrame{
	public JanelaDeTemperaturas (){
		this.setSize (200,100);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PainelTemperaturas pt = new PainelTemperaturas ();
		this.getContentPane().add(pt,BorderLayout.CENTER);
		
	}
	public void exibeFrame (String titulo){
		this.setTitle (titulo);
		this.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JanelaDeTemperaturas jt=new JanelaDeTemperaturas();
		jt.exibeFrame("Conversor");

	}

}
