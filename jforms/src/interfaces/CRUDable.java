package interfaces;

import java.util.ArrayList;

/**
 *
 * @author Erick Frederick
 * @param <T>
 */
public interface CRUDable<T> {
    public void Inserir(T modelo);
    public void Alterar(T modelo);
    public void Deletar(T modelo);
    public ArrayList<T> Listar();
}