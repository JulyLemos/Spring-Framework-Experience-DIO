import br.com.dio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição acerca do curso Java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição acerca do curso Python");
        curso2.setCargahoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Assuntos sobre Java");
        mentoria.setData(LocalDate.now());



        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp sobre como programar em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWangji = new Dev();
        devWangji.setNome("Lan WangJi");
        devWangji.increverBootcamp(bootcamp);
        System.out.println("Coonteudos Inscritos" + devWangji.getConteudosInscritos());
        devWangji.progredir();
        devWangji.progredir();
        System.out.println("-");
        System.out.println("Coonteudos Inscritos" + devWangji.getConteudosInscritos());
        System.out.println("Conteudos concluídos" + devWangji.getConteudosConcluidos());
        System.out.println("XP:" + devWangji.calculasXp());

        System.out.println("----------");

        Dev devWanning = new Dev();
        devWanning.setNome("Chu WanNing");
        devWanning.increverBootcamp(bootcamp);
        System.out.println("Coonteudos Inscritos" + devWanning.getConteudosInscritos());
        devWanning.progredir();
        //devWanning.progredir();
        //devWanning.progredir();
        System.out.println("-");
        System.out.println("Coonteudos Inscritos" + devWanning.getConteudosInscritos());
        System.out.println("Conteudos concluídos" + devWanning.getConteudosConcluidos());
        System.out.println("XP:" + devWanning.calculasXp());

    }
}
