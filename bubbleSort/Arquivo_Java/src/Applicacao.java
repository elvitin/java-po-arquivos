public class Applicacao {
    public static void main(String... args) {
        Arquivo_Java objArq = new Arquivo_Java("D:\\arquivo.bin");
        objArq.leArq();
        objArq.exibirArq();
        objArq.bolha();
        objArq.exibirArq();
    }
}
