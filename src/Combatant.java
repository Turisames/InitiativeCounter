/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turisames
 */
public class Combatant {
    
    String name;
    int initiative;

    // Default constructor.
    public Combatant() {
        name = "";
        initiative = 0;
    }

    // Parameter constructor.
    public Combatant(String name, int initiative) {
        this.name = name;
        this.initiative = initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAll(String name, int initiative) {
        this.name = name;
        this.initiative = initiative;
    }

    public String getName() {
        return name;
    }

    public int getInitiative() {
        return initiative;
    }   
}
