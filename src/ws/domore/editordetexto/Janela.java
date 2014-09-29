/*
 * Janela.java
 *
 */

package ws.domore.editordetexto;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author mariojp
 */
public class Janela extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton copiar = new JButton("Copiar");
    private JButton limpar = new JButton("Limpar");
    private JButton sair = new JButton("Sair");
    private JTextField campo = new JTextField();
    private JTextArea texto = new JTextArea();
    private JMenuBar barraMenu = new JMenuBar();
    private JMenu menu = new JMenu("Opcoes");
    private JMenuItem itemcopiar = new JMenuItem("Copiar");
    private JMenuItem itemlimpar = new JMenuItem("Limpar");
    private JMenuItem itemsair = new JMenuItem("Sair");
    
    public Janela(String nome) {
        super(nome);
        
        this.itemlimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                metodoLimpar();
            }
        });
        
        this.itemcopiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                metodoCopiar();
            }
        });
        
        this.itemsair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                metodoSair();
            }
        });
        
        this.limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                metodoLimpar();
            }
        });
        
        this.copiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                metodoCopiar();
            }
        });
        
        this.sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                metodoSair();
            }
        });
        menu.add(itemcopiar);
        menu.add(itemlimpar);
        menu.add(itemsair);
        barraMenu.add(menu);
        this.setJMenuBar(barraMenu);
        
        this.setLayout(new BorderLayout());
        JPanel botoes = new JPanel();
        
        botoes.setLayout(new GridLayout(3,1));
        botoes.add(copiar);
        botoes.add(limpar);
        botoes.add(sair);
        JPanel lateral = new JPanel();
        lateral.setBackground(Color.GREEN);
        lateral.add(botoes);
        
        this.add(BorderLayout.NORTH,campo);
        this.add(BorderLayout.CENTER,texto);
        this.add(BorderLayout.WEST, lateral);
        this.setSize(400,350);
        this.setVisible(true);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    private void metodoCopiar() {
        String textoEscrito = this.campo.getText();
        this.texto.setText(textoEscrito);
    }
    
    private void metodoLimpar() {
        this.campo.setText(" ");
    }
    
    private void metodoSair() {
        System.exit(1);
    }
    
    public static void main(String[] args) {
        new Janela("Janela Editor");
    }
}
