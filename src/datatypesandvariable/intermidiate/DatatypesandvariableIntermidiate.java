/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datatypesandvariable.intermidiate;


public class DatatypesandvariableIntermidiate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String storeName = "Deeco";
        int quantity = 3;
        double unitPrice = 15.75;
        double totalCost = quantity * unitPrice;

        System.out.println("====== Receipt =======");
        System.out.println("Store Name : " + storeName);
        System.out.println("Quantity : " + quantity);
        System.out.println("Unit Price : " + unitPrice);
        System.out.println("Total Cost : " + totalCost);
        // Total Cost is not qualified to be put in the int data type because the unit price has a decimal value. If I put it in int, the code is going to have an error because int data type cannot hold decimal values.
        
        
        
        
    }
    
}
