/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetospaulo.cadastrovet;



public class Animal {
    
    private String codigo;
    private String nome;
    private String raca;
    private int anoDeNascimento;
    private String nomeDono;
    private String cpfDono;
    private String tipoAnimal;

    public Animal(String codigo, String nome, String raca, int anoDeNascimento, String nomeDono, String cpfDono, String tipoAnimal) {
        this.codigo = codigo;
        this.nome = nome;
        this.raca = raca;
        this.anoDeNascimento = anoDeNascimento;
        this.nomeDono = nomeDono;
        this.cpfDono = cpfDono;
        this.tipoAnimal = tipoAnimal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getDataNascimento() {
        return anoDeNascimento;
    }

    public void setDataNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getCpfDono() {
        return cpfDono;
    }

    public void setCpfDono(String cpfDono) {
        this.cpfDono = cpfDono;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    
    
   /* // Método para converter uma linha do arquivo em um objeto Animal
    public static Animal parseAnimal(String linha) {
        String[] campos = linha.split(", "); // Divide a linha em campos usando a vírgula e espaço

       // int codigo = Integer.parseInt(campos[0].split(": ")[1]);
        String codigo = campos[0].split(": ")[1];
        String nome = campos[1].split(": ")[1];
        String raca = campos[2].split(": ")[1];
        int anoDeNascimento = Integer.parseInt(campos[3].split(": ")[1]);
        String nomeDono = campos[4].split(": ")[1];
        String cpfDono = campos[5].split(": ")[1];
        String tipoAnimal = campos[6].split(": ")[1];

        return new Animal(codigo, nome, raca, anoDeNascimento, nomeDono, cpfDono, tipoAnimal);
    }
*/
    
    
    public static Animal parseAnimal(String linha) throws IllegalArgumentException {
     
        String[] campos = linha.split(", ");
        if (campos.length != 7) { 
            throw new IllegalArgumentException("Formato de "
                    + "linha inválido. Esperados 7 campos,"
                    + " encontrados: " + campos.length);
        }
      
        String codigo = extrairValorCampo(campos[0]);
        String nome = extrairValorCampo(campos[1]);
        String raca = extrairValorCampo(campos[2]);
        int anoDeNascimento = Integer.parseInt(
                extrairValorCampo(campos[3]));
        String nomeDono = extrairValorCampo(campos[4]);
        String cpfDono = extrairValorCampo(campos[5]);
        String tipoAnimal = extrairValorCampo(campos[6]);

        return new Animal(codigo, nome, raca, anoDeNascimento, nomeDono, cpfDono, tipoAnimal);
    }
    
    
    
    
    
    private static String extrairValorCampo(String campo) throws IllegalArgumentException {
        String[] partes = campo.split(": ");
        if (partes.length != 2) { 
            throw new IllegalArgumentException("Formato de campo inválido: " + campo);
        }
        return partes[1].trim(); 
    }
    
    

    @Override
    public String toString() {
        return 
               "codigo: " + codigo + 
               ", nome: " + nome + 
               ", raca: " + raca + 
               ", anoDeNascimento: " + anoDeNascimento +
               ", nomeDono: " + nomeDono + 
               ", cpfDono: " + cpfDono  +
               ", tipoAnimal: " + tipoAnimal + "\n" ;
    }
}
