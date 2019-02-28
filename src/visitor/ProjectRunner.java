/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author nodira
 */
public class ProjectRunner {

    
    public static void main(String[] args) {
        Project project = new Project();
        
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();
        
        System.out.println("Junior an Action...");
        project.beWritten(junior);
        
        System.out.println("\n==================================\n");
        
        System.out.println("Senior an Action...");
        project.beWritten(senior);
        
    }
    
}
