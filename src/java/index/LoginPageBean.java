/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author alef
 */
@Named(value = "loginPageBean")
@ViewScoped
public class LoginPageBean implements Serializable {

    private String buttonCaption;

    public String getButtonCaption() {
        try {
            buttonCaption = "ВОЙТИ <span class=\"glyphicon glyphicon-log-in\"></span>";

        } catch (Exception e) {
        }
        return buttonCaption;
    }
    
    

    /**
     * Creates a new instance of LoginPageBean
     */
    public LoginPageBean() {

    }

}
