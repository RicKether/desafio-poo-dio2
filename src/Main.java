import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Cursos;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentorias;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        Cursos curso1 = new Cursos();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        //System.out.println(curso1);
        //System.out.println(curso2);

        Mentorias mentoria1 = new Mentorias();

        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Mentorias mentoria2 = new Mentorias();

        mentoria2.setTitulo("mentoria js");
        mentoria2.setDescricao("descricao mentoria js");
        mentoria2.setData(LocalDate.now());

        //System.out.println(mentoria1);
        //System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev dev1 = new Dev();
        dev1.setNome("dev1");
        dev1.inscrever(bootcamp);

        System.out.println("Conteudos Inscritos Dev1: " + dev1.getConteudosInscritos());
        dev1.progredir();

        System.out.println("Conteudos Concluídos Dev1: " + dev1.getConteudosConcluidos());
        System.out.println("XP de Dev1: " + dev1.calcularTotalXp());

        System.out.println("..........");
        System.out.println("..........");

        Dev dev2 = new Dev();
        dev2.setNome("dev2");
        dev2.inscrever(bootcamp);

        System.out.println("Conteudos Inscritos Dev2: " + dev2.getConteudosInscritos());

        dev2.progredir();
        System.out.println("Conteudos Concluídos Dev2: " + dev2.getConteudosConcluidos());
        System.out.println("XP de Dev 2: " + dev2.calcularTotalXp());
    }

}
