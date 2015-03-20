/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsearchenginephase1;

import javax.swing.UIManager;

/**
 *
 * @author Yousef
 */
public class ProjectSearchEnginePhase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try { 
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (Exception e) {
    e.printStackTrace();
}  
        searchEngineGUI searchGUI = new searchEngineGUI();
        searchGUI.setVisible(true);
    }
}
