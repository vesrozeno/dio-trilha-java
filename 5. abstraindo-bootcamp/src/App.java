
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        Course cursoPoo = new Course();
        cursoPoo.setTitle("Programação Orientada a Objetos");
        cursoPoo.setDescription("Descrição POO");
        cursoPoo.setWorkLoad(3);

        Course cursoEd = new Course();
        cursoEd.setTitle("Estrutura de Dados");
        cursoEd.setDescription("Descrição ED");
        cursoEd.setWorkLoad(5);

        Mentorship mentoriaJava = new Mentorship();
        mentoriaJava.setTitle("Mentoria Java");
        mentoriaJava.setDescription("Descrição Mentoria");
        mentoriaJava.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição do bootcamp");
        bootcamp.getContentList().add(cursoPoo);
        bootcamp.getContentList().add(cursoEd);
        bootcamp.getContentList().add(mentoriaJava);

        Dev devVitor = new Dev();
        devVitor.setName("Vitor");
        devVitor.signToBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Vitor:" + devVitor.getSignedContentList());
        devVitor.progress();
        devVitor.progress();
        devVitor.progress();
        devVitor.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Vitor:" + devVitor.getSignedContentList());
        System.out.println("Conteúdos Concluídos Vitor:" + devVitor.getConcludedContentList());
        System.out.println("XP:" + devVitor.calculateTotalXp());

        Dev devMatheus = new Dev();
        devMatheus.setName("Matheus");
        devMatheus.signToBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getSignedContentList());
        devMatheus.progress();
        devMatheus.progress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getSignedContentList());
        System.out.println("Conteúdos Concluídos Matheus:" + devMatheus.getConcludedContentList());
        System.out.println("XP:" + devMatheus.calculateTotalXp());

    }
}
