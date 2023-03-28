/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception3;

/**
 *
 * @author Student
 */
public class lab2 {
    public static void main(String[] args) {
        int[] list=new int[10];
        try{
        System.out.println("List[10] is "+list[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(RuntimeException ex){
            System.out.println("");
        }
        catch(Exception ex){
            System.out.println("");
        }
    }

}   
    

