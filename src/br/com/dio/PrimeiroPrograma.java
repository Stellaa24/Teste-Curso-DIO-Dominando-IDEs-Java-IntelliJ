package br.com.dio;

import model.Gato;

public class PrimeiroPrograma {
    public PrimeiroPrograma() {
    }

    public static void main(String[] args) {
        Gato gato = new Gato ()

        System.out.println(gato);

        Livro livro1 = new livro(nome: "O problema dos 3 corpos.", numPaginas 300);
            System.out.println (livro1);

        class Livro {
            private String nome;

            public Livro(String nome, Integer numPaginas) {
                this.nome = nome;
                this.numPaginas = numPaginas;
            }

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            @Override
            public String toString() {
                return "Livro{" +
                        "nome='" + nome + '\'' +
                        '}';

            }
        }




    }
}
