package livenoitedes6quest6;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LiveNoiteDes6Quest6 {

    /**
     * Uma loja tem 150 clientes cadastrados e deseja mandar uma correspondência
     * a cada um deles anunciando um bônus especial. Escreva um algoritmo que
     * leia o nome do cliente e o valor das suas compras no ano passado e 
     * calcule um bônus de 10% se o valor das compras for menor que 500.000 e de
     * 15 %, caso contrário.
     */
    public static void main(String[] args) {
       String nome, res = "Listagem de Clientes e seus bônus\n";
       double valorCompra, bonus;
       int contCli;
        
       for (contCli=1; contCli<=5; contCli++){
           nome = JOptionPane.showInputDialog("Nome:");
           valorCompra = Double.parseDouble(JOptionPane.
                   showInputDialog("Valor compra"));
           if(valorCompra<=500000){
               bonus = valorCompra * 0.1;
           }else{
                bonus = valorCompra * 0.15;
           }
           res = res + nome+" Valor da compra R$ "+valorCompra
                   + " - Você tem direito a um Bônus de R$"+bonus+"\n";
       }
       JOptionPane.showMessageDialog(null, res);
    }
    
}
