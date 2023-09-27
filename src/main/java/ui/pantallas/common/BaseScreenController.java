package ui.pantallas.common;

import ui.pantallas.principalControllers.PrincipalController;


public abstract class BaseScreenController {

    private PrincipalController principalController;


    public PrincipalController getPrincipalController() {
        return principalController;
    }

    public void setPrincipalController(PrincipalController principalController) {
        this.principalController = principalController;
    }

    public void principalCargado() {

    }

}
