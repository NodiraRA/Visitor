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
public class Project implements ProjectElement{

    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
            new ProjectClass(),
            new Database(),
            new Test()
        };
    }
    
    
    
    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element : projectElements){
            element.beWritten(developer);
        }
    }
    
}
