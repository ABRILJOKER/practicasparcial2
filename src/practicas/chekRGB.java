package practicas;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JRadioButton;

import java.awt.BorderLayout;

import java.awt.Font;

import javax.swing.JLabel;

import javax.swing.border.LineBorder;

import java.awt.Color;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class chekRGB {

	private JFrame frmChekrgb;

	private JRadioButton chKRojo;

	private JRadioButton chkVerde;

	private JRadioButton chkAzul;

	private JLabel lblColor;

	/**
	 * 
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					chekRGB window = new chekRGB();

					window.frmChekrgb.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	/**
	 * 
	 * Create the application.
	 * 
	 */

	public chekRGB() {

		initialize();

	}

	private void asignarColor() {

		int r = (chKRojo.isSelected()) ? 255 : 0;

		int g = (chkVerde.isSelected()) ? 255 : 0;

		int b = (chkAzul.isSelected()) ? 255 : 0;

		lblColor.setBackground(new Color(r, g, b));

	}

	private void initialize() {

		frmChekrgb = new JFrame();

		frmChekrgb.setTitle("CheKRGB");

		frmChekrgb.setBounds(100, 100, 690, 465);

		frmChekrgb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChekrgb.setLocationRelativeTo(null);

		frmChekrgb.getContentPane().setLayout(null);

		chKRojo = new JRadioButton("ROJO");

		chKRojo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				asignarColor();

			}

		});

		chKRojo.setFont(new Font("Wide Latin", Font.PLAIN, 15));

		chKRojo.setBounds(70, 112, 169, 43);

		frmChekrgb.getContentPane().add(chKRojo);

		chkVerde = new JRadioButton("VERDE");

		chkVerde.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				asignarColor();

			}

		});

		chkVerde.setFont(new Font("Wide Latin", Font.PLAIN, 15));

		chkVerde.setBounds(70, 182, 150, 36);

		frmChekrgb.getContentPane().add(chkVerde);

		chkAzul = new JRadioButton("AZUL");

		chkAzul.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				asignarColor();

			}

		});

		chkAzul.setFont(new Font("Wide Latin", Font.PLAIN, 15));

		chkAzul.setBounds(70, 263, 150, 23);

		frmChekrgb.getContentPane().add(chkAzul);

		lblColor = new JLabel("");

		lblColor.setBorder(new LineBorder(new Color(0, 0, 0), 10, true));

		lblColor.setOpaque(true);

		lblColor.setBounds(269, 50, 345, 333);

		frmChekrgb.getContentPane().add(lblColor);

	}

}