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
    
    // TODO: Maybe change this into an ArrayList instead?
    List<Combatant> units = new LinkedList<Combatant>();

    public Model() {
    }
    
    // Adds a unit to the list
    public void addToList(String name, int Initiative){
        
        if ( units.isEmpty() ){
            // Java really does take a lot of influences from C/C++.
            units.add( new Combatant(name, Initiative) );
        }
        else{
            for ( int i = 0; i < units.size(); i++ ){
                if ( units.get(i).getInitiative() > Initiative ){
                    units.add(i, new Combatant(name, Initiative));
                }
            }
        }
    }
    
    public void removeUnit(String name){
        
        // Presumably, this is the "ListIterator Approach".
        ListIterator<Combatant> iter = units.listIterator();
        
        // TODO: Check whether this works as intended.
        while( iter.hasNext() ){
            if ( iter.getClass().getName() == name  ){
                iter.remove();
                break;
            }
            iter.next();
        }
    }
    
    // TODO: Make sort function anyway, for practice.
    public void sortList(){
        
    }
}
