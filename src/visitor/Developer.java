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
public interface Developer {
    public void create(ProjectClass projectClass);
    public void create(Database database);
    public void create(Test test);

}
