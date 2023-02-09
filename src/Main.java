import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Desenvolvedor;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int pessoasContratadas = 0;

        Curso curso1 = new Curso();
        curso1.setTitulo("curso de java");
        curso1.setDescricao("como aprender orientação ao objeto");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso de python");
        curso2.setDescricao("como aprender orientação ao objeto");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getPessoasContratadas();

        Desenvolvedor devGustavo = new Desenvolvedor();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gustavo:" + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gustavo:" + devGustavo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Gustavo:" + devGustavo.getConteudosConcluidos());
        System.out.println("XP:" + devGustavo.calcularTotalXp());

        System.out.println("-----");

        Desenvolvedor devNaruto = new Desenvolvedor();
        devNaruto.setNome("Naruto");
        devNaruto.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Naruto:" + devNaruto.getConteudosInscritos());
        devNaruto.progredir();
        devNaruto.progredir();
        devNaruto.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Naruto:" + devNaruto.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Naruto:" + devNaruto.getConteudosConcluidos());
        System.out.println("XP:" + devNaruto.calcularTotalXp());


        System.out.println("Parabéns aos " + bootcamp.getPessoasContratadas() + " Contratados nesse bootcamp!!");

    }

}