/*
Desenvolva uma aplicação para a Petshop Amigos de quatro patas. A aplicação deve
ser orientada a objetos, ou seja, crie uma classe denominada Petshop que contenha 
os seguintes atributos: nomeAnimal, pesoAnimal, idadeAnimal, sexoAnimal, valorPrimeiroServico, 
valorSegundoServico, notaFiscal.
Ao usuário clicar em cadastrar, deve ser retornado todos os dados informados (JOptionPane), 
inclusive as seleções de radio e checkbox. Ao clicar em cancelar, todos os campos de texto devem ser anulados, 
o radiobutton macho deve ser selecionado e não deverá ter checkbox selecionado. 
OBS: Somar os valores dos serviços 1 e 2 e também retornar.

 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Andressa
 */
public class PetShop {
    private String nomeAnimal, sexoAnimal;
    private double pesoAnimal, valorPrimeiroServico, valorSegundoServico;
    private int idadeAnimal;
    ArrayList<String> notaFiscal = new ArrayList<>();

    public void adicionar(String nf){
        this.notaFiscal.add(nf);
    }
    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }
    public double calcularServicos(){
        return this.valorPrimeiroServico+this.valorSegundoServico;
    }
    
    public String getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(String sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    public double getPesoAnimal() {
        return pesoAnimal;
    }

    public void setPesoAnimal(double pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

    public double getValorPrimeiroServico() {
        return valorPrimeiroServico;
    }

    public void setValorPrimeiroServico(double valorPrimeiroServico) {
        this.valorPrimeiroServico = valorPrimeiroServico;
    }

    public double getValorSegundoServico() {
        return valorSegundoServico;
    }

    public void setValorSegundoServico(double valorSegundoServico) {
        this.valorSegundoServico = valorSegundoServico;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }

    @Override
    public String toString() {
        return "Nome Animal=" + nomeAnimal + 
                "\n Sexo Animal=" + sexoAnimal + 
                "\n Peso Animal=" + pesoAnimal + 
                "\n Valor do Primeiro Serviço=" + valorPrimeiroServico + 
                "\n Valor do Segundo Serviço=" + valorSegundoServico + 
                "\n Idade do Animal=" + idadeAnimal + 
                "\n Nota Fiscal=" + notaFiscal;
    }
    
    
    
}
