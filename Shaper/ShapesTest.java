
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ShapesTest {


    public static void main(String[] args) {
        //pegar a escolha do usuario
        String input = JOptionPane.showInputDialog(
            "Enter 1 to draw retangles\n"+
            "Enter 2 to draw ovais");
        
        int choice = Integer.parseInt(input);//converter a entrada em int
        
        //cria o painel com a entrada do usuario
        var panel= new Shaper(choice);
        
        JFrame application = new JFrame(); //cria um novo frame
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);
        
        
    }
    
}
