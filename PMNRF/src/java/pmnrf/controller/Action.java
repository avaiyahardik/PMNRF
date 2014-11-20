/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Shidhav
 */
public interface Action {
    
    
    public String execute(HttpServletRequest request, HttpServletResponse response);
    
}
