public class EditorVideo extends Funcionario {

    public EditorVideo() {

    }

    public double getBonificacao() {
        System.out.println("Chamando o método bonificação do Editor de Vídeo");
        return super.getBonificacao() + 100;
    }

}
