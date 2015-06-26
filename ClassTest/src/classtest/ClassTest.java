/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtest;

import AdditionalPackage.Student;

/**
 *
 * @author Mohsen
 */
public class ClassTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student firstStd = new Student();
        Student secontStd = new Student(92422154, "Mohsen Lachinani", (float)17.56);
        firstStd.printDetails();
        secontStd.printDetails();
        
    }
    
}
