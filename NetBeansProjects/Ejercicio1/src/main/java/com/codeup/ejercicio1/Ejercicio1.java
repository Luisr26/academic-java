package com.codeup.ejercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        Estudiantes estudiante = new Estudiantes();
        ArrayList<String> estudiantes = new ArrayList<>();
        int opcion;
        int id;
        String newName;
        try {
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                 Menu Principal
                                                 1. Agregar
                                                 2. Imprimir
                                                 3. Actualizar
                                                 4. Eliminar
                                                 5. Salir
                                                 Escoge la Opcion
                                                 """)
                );
                switch (opcion) {
                    case 1:
                        String name = JOptionPane.showInputDialog("Ingresa tu nombre completo");
                        estudiante.name = name;
                        estudiantes.add(name);
                        break;
                    case 2:
                        StringBuilder mensaje = new StringBuilder("Lista de Nombres Creados\n");
                        for (int i = 0; i < estudiantes.size(); i++) {
                            mensaje.append((i + 1)).append(". ").append(estudiantes.get(i)).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, mensaje.toString());
                        break;
                    case 3:
                        id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id de la persona que deseas Actualizar")) - 1;
                        if (id >= 0 && id < estudiantes.size()) {
                            newName = JOptionPane.showInputDialog("Ingresa el nuevo nombre para: " + estudiantes.get(id));
                            estudiantes.set(id, newName);
                        } else {
                            JOptionPane.showMessageDialog(null, "Hubo un error al buscar el id: " + (id + 1));
                        }
                        break;
                    case 4:
                        id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id de la persona que deseas Actualizar")) - 1;
                        if (id >= 0 && id < estudiantes.size()) {
                            String boolOpcion = JOptionPane.showInputDialog("Seguro que quieres eliminar a: " + estudiantes.get(id) +" si/no").toLowerCase();
                            if(boolOpcion.equals("si")){
                                estudiantes.remove(id);
                            }else{
                                JOptionPane.showMessageDialog(null, "Hubo un error");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Hubo un error al buscar el id: " + (id + 1));
                        }
                        break;

                }
            } while (opcion != 5);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresa datos validos");
            System.out.println("Ah ocurrido un error inesperado");
        };
    }
}
