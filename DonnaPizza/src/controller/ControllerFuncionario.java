package controller;

import DAO.DAOFuncionario;
import model.ModelFuncionario;

public class ControllerFuncionario {

    private DAOFuncionario objDaoFuncionario = new DAOFuncionario();

    public void createFuncionarioController(ModelFuncionario objModelFuncionario) {

        this.objDaoFuncionario.createFuncionario(objModelFuncionario);

    }

}
