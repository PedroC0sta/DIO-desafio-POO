import br.cm.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo conteudo = new Curso();


        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro"+ devPedro.getConteudosInscritos());

        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();


        System.out.println("---");

        System.out.println("Conteúdos Inscritos Pedro"+ devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pedro"+ devPedro.getConteudosConcluitos());
        System.out.println("XP:" + devPedro.calcularTotalXp());

        System.out.println("-------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila"+ devPedro.getConteudosInscritos());

        devCamila.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Camila"+ devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila"+ devCamila.getConteudosConcluitos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

    }
}