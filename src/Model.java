/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turisames
 */

import java.util.*;


public class Model {
    
    List<Combatant> units = new LinkedList<Combatant>();

    public Model() {
    }
    
    // Adds a unit to the list
    public void addToList(String name, int Initiative){
        
        // Java really does take a lot of influences from C/C++.
        units.add( new Combatant(name, Initiative) );
    }
    
}
