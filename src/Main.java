import br.com.botcamp.desafio.dominio.Bootcamp;
import br.com.botcamp.desafio.dominio.Curso;
import br.com.botcamp.desafio.dominio.Dev;
import br.com.botcamp.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Go");
        curso2.setDescricao("Descrição curso Go");
        curso2.setCargaHoraria(12);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria do curso Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devEudes = new Dev();
        devEudes.setNome("Eudes");
        devEudes.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Eudes " + devEudes.getConteudosInscritos());
        devEudes.progradir();
        System.out.println("Conteudos conluidos Eudes" + devEudes.getConteudosConcluidos());
        System.out.println("Xp:" + devEudes.calcularTotalXP());

        Dev devNilton = new Dev();
        devNilton.setNome("Nilton");
        System.out.println("Conteudos inscritos Nilton " + devNilton.getConteudosInscritos());
        System.out.println("Conteudos concluidos Nilton" + devNilton.getConteudosConcluidos());
    }
}