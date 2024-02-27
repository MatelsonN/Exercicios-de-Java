package Exercicio2.Utilitario;

import Exercicio2.Entidade.Comentario;
import Exercicio2.Entidade.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario comen1 = new Comentario("Boa viagem");
        Comentario comen2 = new Comentario("Uau que é incrível!");

        Post post = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Viajando para Nova Zelandia",
                "Vou visitar este país maravilhoso!",
                12);

        post.adicionarComentarios(comen1);
        post.adicionarComentarios(comen2);

        Comentario comen3 = new Comentario("Boa noite");
        Comentario comen4 = new Comentario("Que a Força esteja com você");

        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                "Boa noite, galera!",
                "Até amanhã!",
                5);

        post2.adicionarComentarios(comen3);
        post2.adicionarComentarios(comen4);

        System.out.println(post);
        System.out.println(post2);

    }
}
