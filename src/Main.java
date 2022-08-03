import br.com.desafio.dominio.Cursos;
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

        System.out.println(curso1);
        System.out.println(curso2);

        Mentorias mentoria1 = new Mentorias();

        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Mentorias mentoria2 = new Mentorias();

        mentoria2.setTitulo("mentoria js");
        mentoria2.setDescricao("descricao mentoria js");
        mentoria2.setData(LocalDate.now());

        System.out.println(mentoria1);
        System.out.println(mentoria2);




    }

}
