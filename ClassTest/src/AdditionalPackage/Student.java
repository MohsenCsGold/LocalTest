/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdditionalPackage;
import java.util.*;


/**
 *
 * @author Mohsen
 */
public class Student {
    private int ID;
    private String fullName;
    private float Grade;
    
    
    public Student()
    {
        ID = 00;
        fullName = "No Name";
        Grade = 0;
    }
    
    public Student( int id , String name , float grade)
    {
        ID = id ; 
        fullName = name ; 
        Grade = grade; 
    }
    
    public void printDetails()
    {
        System.out.print("Detailed Student:\t");
        System.out.println(ID + " " + fullName.toString() + " " + Grade);
    }
    
}
