package entities;

import java.util.Date;

import entities.enums.Marca;
import entities.enums.TipoDoRemedio;

public class Remedio {
  
 private String nome;
 private TipoDoRemedio tipo;
 private Marca marca;
 private long codigo;
 private Date validade;
 private double valor;

public Remedio(String nome, TipoDoRemedio tipo, Marca marca, long codigo, Date validade, double valor) {
  this.nome = nome;
  this.tipo = tipo;
  this.marca = marca;
  this.codigo = codigo;
  this.codigo = codigo;
  this.validade = validade;
  this.valor = valor;
}

public String getNome() {
  return nome;
}

public TipoDoRemedio getTipo() {
  return tipo;
}

public Marca getMarca() {
  return marca;
}

public void setMarca(Marca marca) {
  this.marca = marca;
}

public long getCodigo() {
  return codigo;
}

public Date getValidade() {
  return validade;
}

public double getValor() {
  return valor;
}

public void setValor(double valor) {
  this.valor = valor;
}

@Override
public String toString() {
  return "Nome: " + nome  + " || Código : #" + codigo + "\n"
          + "Tipo=" + tipo + " ||  Marca: " + marca + "\n"
          + "Valor = R$" + valor + " || Validade: " + validade;
}

 
}
