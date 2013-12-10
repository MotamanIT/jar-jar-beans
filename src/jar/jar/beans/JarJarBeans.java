/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jar.jar.beans;

/**
 *
 * @author Phoenix
 */
public class JarJarBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        System.out.println("success!");
        throw new Exception("Haha");
    }
    
    public static int addition(int nb1, int nb2){
        return nb1 + nb2;
    }
    
    public static void pow (Double nb1){
        nb1 = Math.pow(nb1, nb1);
    }
    
    public static boolean isPair(int nb1){
        return nb1%2==0;
    }
}
