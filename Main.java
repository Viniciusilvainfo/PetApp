import controllers.Animais;

public class Main {
    public static void main(String[] args) {
        Animais dog = new Animais("Lucky", "Dog");

        System.out.println(dog.getName());

        dog.addVacina("Raiva");
        dog.getVacina(0);

        dog.addTratamento("Tosagem");
        dog.addTratamento("Tosagem"); // não vai salvar porque não permite duplicatas
        dog.addTratamento("Banho");
        System.out.println(dog.getTratamentos());

        dog.addDadoAdicional("Latido", "Ele é um cachorro que late bastante");
        dog.addDadoAdicional("Fome", "Ele é um cachorro que que uma vez por dia");

        System.err.println(dog.getDadoAdicional("Latido"));

        dog.addFilaAtendimento("Consulta de rotina");
        dog.addFilaAtendimento("Vacinação");
        System.out.println(dog.atenderProximo());
    }
}
