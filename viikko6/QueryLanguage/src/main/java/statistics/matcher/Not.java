/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics.matcher;

import statistics.Player;

/**
 *
 * @author sakorpi
 */
public class Not implements Matcher {
    private Matcher match;

    public Not(Matcher match) {
        this.match = match;
    }

    @Override
    public boolean matches(Player p) {
        return !this.match.matches(p);
    }  
}
