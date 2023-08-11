/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author bolillo Espartano
 */
public class ServicioCliente {
    private List<Cliente> clientes = new ArrayList<>();

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    public void actualizarCliente(UUID id, String nombre, int edad, double altura, double peso, String objetivo) {
        for (Cliente cliente : clientes) {
            if (cliente.getUuid().equals(id)) {
                cliente.setNombre(nombre);
                cliente.setEdad(edad);
                cliente.setAltura(altura);
                cliente.setPeso(peso);
                cliente.setObjetivo(objetivo);
                break;
            }
        }
    }

    public void eliminarCliente(UUID id) {
        clientes.removeIf(cliente -> cliente.getUuid().equals(id));
    }
}
