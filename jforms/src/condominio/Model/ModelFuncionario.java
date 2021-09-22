package condominio.Model;

import common.PessoaFisica;

/**
 *
 * @author Marcelo
 */
public class ModelFuncionario extends PessoaFisica {
    public int getIdFuncionario() {
        return _idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this._idFuncionario = idFuncionario;
    }

    public String getCargo() {
        return _cargo;
    }

    public void setCargo(String cargo) {
        this._cargo = cargo;
    }

    public double getSalario() {
        return _salario;
    }

    public void setSalario(double salario) {
        this._salario = salario;
    }

    private int _idFuncionario;
    private String _cargo;
    private double _salario;
}
