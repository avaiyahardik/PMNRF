/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.controller.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmnrf.controller.Action;

/**
 *
 * @author Shidhav
 */
public class LogoutAction implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "error.jsp";
    }
}