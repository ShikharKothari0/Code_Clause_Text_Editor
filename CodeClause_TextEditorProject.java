/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeclause_text.editor.project;

import javax.swing.UIManager;

/**
 *
 * @author HP
 */
public class CodeClause_TextEditorProject {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Main_Window mw=new Main_Window();
       mw.setVisible(true);
    }
    
}