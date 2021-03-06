/******************************************************
Cours:   LOG121
Session: E2015
Groupe:  02
Projet: Laboratoire #4
�tudiant(e)s:	Anthony Garneau
				Simon Larouche-Gagn�
              	Pierre-Luc Cusson
              
Professeur : 	Francis Cardinal
Nom du fichier: MenuWindow.java
Date cr��: 2015-07-25
Date dern. modif. 2015-07-28
 *******************************************************
Historique des modifications
 *******************************************************
L'historique des modification est disponible sur github
 *******************************************************/

package View;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Controller.Client.ViewListener;

public class MenuWindow extends JMenuBar {

	private static final long serialVersionUID = 502896813583984078L;

	private JMenu menuFile = new JMenu("File");
	JMenuItem fileOpenImage = new JMenuItem("Open Image");
	JMenuItem fileOpenProject = new JMenuItem("Open Project");
	JMenuItem fileSave = new JMenuItem("Save All");

	JMenu menuZoom = new JMenu("Zoom");
	JMenuItem zoomIn = new JMenuItem("Zoom In");
	JMenuItem zoomOut = new JMenuItem("Zoom Out");

	JMenu menuAction = new JMenu("Action");
	JMenuItem actionUndo = new JMenuItem("Undo");
	JMenuItem actionRedo = new JMenuItem("Redo");

	private Controller.Client.ViewListener viewListener;

	public MenuWindow(ViewListener viewListener) {

		initMenu(viewListener);

	}

	// Initialise le menu
	private void initMenu(ViewListener viewListener) {

		this.viewListener = viewListener;
		fileOpenImage.addActionListener(viewListener);
		menuFile.add(fileOpenImage);
		fileOpenProject.addActionListener(viewListener);
		menuFile.add(fileOpenProject);
		fileSave.addActionListener(viewListener);
		menuFile.add(fileSave);
		add(menuFile);
		actionUndo.addActionListener(viewListener);
		menuAction.add(actionUndo);
		actionRedo.addActionListener(viewListener);
		menuAction.add(actionRedo);
		add(menuAction);

	}

	public ViewListener getViewListener() {
		return viewListener;
	}

	public void setViewListener(ViewListener viewListener) {
		this.viewListener = viewListener;
	}

}