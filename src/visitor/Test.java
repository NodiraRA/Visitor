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
public class Test implements ProjectElement{

    

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);

    }
    
}
