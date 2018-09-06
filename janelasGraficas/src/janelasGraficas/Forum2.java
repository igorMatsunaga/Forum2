package janelasGraficas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Forum2 extends JFrame
{

    private JPanel contentPane;
    String Text1= ("Aplicações Java pode criar interfaces com o usuário , permitindo aos usuários realizar tarefas de aplicação. \r\n"
            + " Dentro dessas interfaces de usuário , o código Java deve ser capaz de responder à interação do usuário , adaptando o processamento a qualquer ação que o usuário tem . \r\n"
            + "Eventos Java são a chave para esta técnica, uma vez que fornecem programas com os meios para detectar tal interação do usuário. \r\n"
            + " Programação com eventos em Java envolve uma série de atividades. User Interfaces \r\n" + 
            "\r\n" + 
            "Quando a maioria dos programadores aprender Java, os primeiros programas de operar sem intervenção do usuário.\r\n"
            + " Quando a primeira a aprender a criar interfaces de usuário em Java, os programadores precisam ajustar as estruturas de controle dentro de suas aplicações. \r\n"
            + "Quando um aplicativo Java com uma interface de usuário começa a execução , o processamento inicial normalmente constrói os vários elementos dentro da interface de usuário , \r\n"
            + "como botões e campos de texto , em seguida, apresenta -los para o usuário a interagir. Durante esta fase inicial de processamento , os programas também pode configurar ouvintes de evento , \r\n"
            + "instruindo Java para ouvir para eventos do usuário, como interagir com os componentes de interface do usuário. \r\n" + 
            "\r\n" + 
            "Tipos de evento \r\n" + 
            "programas\r\n" + 
            "Java pode ouvir vários tipos de evento. A interação do usuário pode incluir movendo o mouse, clicando nos botões do mouse e digitar com o teclado .\r\n"
            + " Programas em Java pode ouvir especificamente para esses eventos , bem como detectar qual o componente que o usuário está interagindo. \r\n"
            + "Quando um programa Java cria uma interface de usuário usando bibliotecas como o toolkit Swing, ele pode atribuir ouvintes de eventos para cada elemento dentro da interface, \r\n"
            + "de modo que quando Java detecta interação do usuário com estes, ele chama um método para adequar o processamento da ação executada pelo o usuário . \r\n" + 
            "\r\n" + 
            "Ouvintes eventos \r\n" + 
            "Quando um programa Java atribui um ouvinte de evento para um componente de interface de usuário em particular , o programa irá se mover para um determinado ponto de execução \r\n"
            + " quando o ouvinte detecta um evento de usuário . Programadores , portanto, necessidade de fornecer instruções para o que deve acontecer quando esses eventos ocorrem . \r\n"
            + " O primeiro passo neste processo está tipicamente determinar qual o componente de interface de utilizador que este interagiu com .\r\n"
            + " O seguinte código de exemplo demonstra a aquisição da origem de um evento : \r\n" + 
            "userEvent.getSource (); \r\n" + 
            "Este código demonstra uma instância da classe EventObject chamando o método  getSource  . Eventos em Java herdam da classe EventObject . \r\n"
            + " O método  getSource  retorna um objeto que representa o elemento da interface do usuário ele interagiu com , para que o código pode, então, responder adequadamente a essa ação. \r\n" + 
            "\r\n" + 
            "Eventos personalizados \r\n" + 
            "Como bem como a criação de ouvintes de eventos em Java GUI aplicações ( Graphical User Interface) , os programadores podem , opcionalmente, criar seus próprios tipos de eventos. \r\n"
            + "Em geral , os programas podem usar os tipos de eventos existentes em Java, como estes fornecem ampla funcionalidade para os lotes de tipos de evento do usuário , \r\n "
            + "incluindo mouse, chave e janelas eventos. No entanto, em alguns casos especializados , os programadores optar por implementar suas próprias classes de eventos . \r\n"
            + " Para fazer isso, eles podem estender uma das classes de eventos existentes e fornecer qualquer funcionalidade adicional de que precisam.\r\n" + 
            "\r\n");

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    Forum2 frame = new Forum2();
                    frame.setVisible(true);
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Forum2()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblEquaoDeSegundo = new JLabel("Fórum de Discussão 3 e 4 - UIA 2");
        lblEquaoDeSegundo.setBounds(109, 11, 263, 14);
        contentPane.add(lblEquaoDeSegundo);
        
        JButton btnNewButton = new JButton("Identificando tratamento de eventos em aplicações GUI");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, Text1);
            }
        });
        btnNewButton.setBounds(21, 62, 384, 23);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Implementando um ouvinte de eventos em Java");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showConfirmDialog(null, "Esté software é uma demostração de um ouvinte de evento, onde um botão aguarda sua ação.");
            }
        });
        btnNewButton_1.setBounds(21, 108, 384, 23);
        contentPane.add(btnNewButton_1);
    }
}
