/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Rodrigues
 */
public class ResolucaoTela {
 
    public static void main(String[] args) {
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        Dimension d = tk.getScreenSize();
//        System.out.println("Tela largura = " + d.width);
//        System.out.println("Tela altura = " + d.height);
        Toolkit tk;
        tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.print("Sua resolução é de "+d.width);
        System.out.println(" X "+d.height);
    }
    
}
