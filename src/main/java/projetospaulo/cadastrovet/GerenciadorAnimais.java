/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetospaulo.cadastrovet;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorAnimais {
    
   
    private List<Animal> animals;

    public GerenciadorAnimais() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }
    
     public void gravarDadosEmArquivo() {
        try {
            FileWriter arquivo = new FileWriter("animais.txt");
            BufferedWriter gravador;
            gravador = new BufferedWriter(arquivo);

            for (Animal animal : animals) {
                gravador.write(animal.toString()); 
                gravador.newLine(); 
            }

            gravador.close(); 
            
        } catch (IOException e) {
            System.err.println("erro: " + e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
} 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

