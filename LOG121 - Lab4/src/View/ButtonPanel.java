/******************************************************
Cours:   LOG121
Session: E2015
Groupe:  02
Projet: Laboratoire #4
�tudiant(e)s:	Anthony Garneau
				Simon Larouche-Gagn�
              	Pierre-Luc Cusson
              
Professeur : 	Francis Cardinal
Nom du fichier: ButtonPanel.java
Date cr��: 2015-07-25
Date dern. modif. 2015-07-28
 *******************************************************
Historique des modifications
 *******************************************************
L'historique des modification est disponible sur github
 *******************************************************/

package View;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controller.Client.ViewListener;

public class ButtonPanel extends JPanel {

	private static final long serialVersionUID = 502896813583984078L;
	private JButton ZoomIn;
	private JButton ZoomOut;
	private JButton Up;
	private JButton Down;
	private JButton Right;
	private JButton Left;
	private JButton Save;
	private JPanel MovePanel;
	private ViewListener viewListener;

	public ButtonPanel(ViewListener viewListener) {

		this.viewListener = viewListener;
		this.ZoomIn = new JButton("ZoomIn");
		this.ZoomOut = new JButton("ZoomOut");
		this.Save = new JButton("Save");
		this.Up = new JButton("Up");
		this.Down = new JButton("Down");
		this.Right = new JButton("Right");
		this.Left = new JButton("Left");
		ZoomIn.addActionListener(this.viewListener);
		ZoomOut.addActionListener(this.viewListener);
		Save.addActionListener(this.viewListener);
		Up.addActionListener(this.viewListener);
		Down.addActionListener(this.viewListener);
		Left.addActionListener(this.viewListener);
		Right.addActionListener(this.viewListener);
		this.MovePanel = new JPanel(new BorderLayout());
		MovePanel.add(Up, BorderLayout.NORTH);
		MovePanel.add(Down, BorderLayout.CENTER);
		MovePanel.add(Left, BorderLayout.WEST);
		MovePanel.add(Right, BorderLayout.EAST);
		add(Save);
		add(ZoomIn);
		add(ZoomOut);
		add(MovePanel);

	}

	public ViewListener getViewListener() {
		return viewListener;
	}

	public void setViewListener(ViewListener viewListener) {
		this.viewListener = viewListener;
	}

}