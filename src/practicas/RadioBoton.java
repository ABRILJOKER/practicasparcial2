package practicas;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;

import java.awt.Font;

import javax.swing.JLabel;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JRadioButton;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class RadioBoton {

	private JFrame frmBotonRadio;

	private JLabel lblColores;

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Launch the application.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					RadioBoton window = new RadioBoton();

					window.frmBotonRadio.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Create the application.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public RadioBoton() {

		initialize();

	}

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Initialize the contents of the frame.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	private void initialize() {

		frmBotonRadio = new JFrame();

		frmBotonRadio.setFont(new Font("Times New Roman", Font.BOLD, 15));

		frmBotonRadio.setTitle("Boton Radio");

		frmBotonRadio.setBounds(100, 100, 620, 459);

		frmBotonRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBotonRadio.setLocationRelativeTo(null);

		frmBotonRadio.getContentPane().setLayout(null);

		lblColores = new JLabel("");

		lblColores.setOpaque(true);

		lblColores.setBorder(new LineBorder(new Color(0, 0, 0), 15, true));

		lblColores.setBounds(286, 33, 297, 364);

		frmBotonRadio.getContentPane().add(lblColores);

		JRadioButton rdVerde = new JRadioButton("Verde");

		rdVerde.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColores.setBackground(Color.GREEN);

			}

		});

		rdVerde.setBounds(26, 26, 177, 42);

		frmBotonRadio.getContentPane().add(rdVerde);

		JRadioButton rdRojo = new JRadioButton("Rojo");

		rdRojo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColores.setBackground(Color.RED);

			}

		});

		rdRojo.setBounds(26, 173, 153, 42);

		frmBotonRadio.getContentPane().add(rdRojo);

		JRadioButton rdAzul = new JRadioButton("Azul");

		rdAzul.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColores.setBackground(Color.BLUE);

			}

		});

		rdAzul.setBounds(26, 141, 111, 23);

		frmBotonRadio.getContentPane().add(rdAzul);

		JRadioButton rdNaranja = new JRadioButton("Naranja");

		rdNaranja.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColores.setBackground(Color.orange);

			}

		});

		rdNaranja.setBounds(26, 74, 90, 64);

		frmBotonRadio.getContentPane().add(rdNaranja);

		JRadioButton rdBlanco = new JRadioButton("Blanco");

		rdBlanco.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColores.setBackground(Color.white);

			}

		});

		rdBlanco.setBounds(24, 229, 111, 23);

		frmBotonRadio.getContentPane().add(rdBlanco);

		JRadioButton rdAmarillo = new JRadioButton("Amarillo");

		rdAmarillo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColores.setBackground(Color.yellow);

			}

		});

		rdAmarillo.setBounds(24, 358, 111, 23);

		frmBotonRadio.getContentPane().add(rdAmarillo);

		JRadioButton rdNegro = new JRadioButton("Negro");

		rdNegro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColores.setBackground(Color.black);

			}

		});

		rdNegro.setBounds(24, 324, 111, 23);

		frmBotonRadio.getContentPane().add(rdNegro);

		JRadioButton rdRosa = new JRadioButton("Rosa");

		rdRosa.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColores.setBackground(Color.pink);

			}

		});

		rdRosa.setBounds(24, 281, 111, 23);

		frmBotonRadio.getContentPane().add(rdRosa);
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(rdBlanco);
		grupo.add(rdRosa);
		grupo.add(rdNegro);
		grupo.add(rdAmarillo);
		grupo.add(rdNaranja);
		grupo.add(rdAzul);
		grupo.add(rdRojo);
		grupo.add(rdVerde);
		
		

	}

}