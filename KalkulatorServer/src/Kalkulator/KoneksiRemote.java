/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author mario
 */

public interface KoneksiRemote extends Remote {
    double valor1Obtener(double valor1) throws RemoteException;
    double valor2Obtener(double valor2) throws RemoteException;
    double valorResultado(double resultado) throws RemoteException;
    String operacion(String operacion) throws RemoteException;
}