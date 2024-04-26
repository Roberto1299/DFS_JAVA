/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Stack;

/**
 * Created by Adrian on 04/06/2017.
 */
public class DFS {

    public DFS() {

    }

    public void recursiveDfs(Vertex vertex) {//A
        System.out.println(vertex + " ");
            for (Vertex v : vertex.getAdjacenciesList()) {//V = {B,C}
                if (!v.isVisited()) {//Si B no ha sido visitado
                    v.setVisited(true);//B se declara como visitado
                    v.setPrecedessor(vertex);//El predecesor de B es A
                    recursiveDfs(v);//Enviamos ahora B
                }
            }
        }

}