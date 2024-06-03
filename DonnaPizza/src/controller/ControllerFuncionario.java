package controller;

import DAO.DAOFuncionario;
import java.util.ArrayList;
import model.ModelFuncionario;

public class ControllerFuncionario {

    private DAOFuncionario objDaoFuncionario = new DAOFuncionario();

    public void createFuncionarioController(ModelFuncionario objModelFuncionario) {

        this.objDaoFuncionario.createFuncionario(objModelFuncionario);

    }

    //alterar
    //delete
    //read
    public ModelFuncionario readFuncionarioController(int idFuncionario) {
        return this.objDaoFuncionario.readFuncionario(idFuncionario);
    }

    //return list
    public ArrayList<ModelFuncionario> returnListFuncionarioController() {
        return this.objDaoFuncionario.returnListFuncionarioDAO();
    }

    public void updateFuncionarioController(ModelFuncionario objModelFuncionario) {
        
        this.objDaoFuncionario.updateFuncionario(objModelFuncionario);
    
    }
    
    public void deleteFuncionarioController(ModelFuncionario objModelFuncionario){
        this.objDaoFuncionario.deleteFuncionario(objModelFuncionario);
    }
    
}
