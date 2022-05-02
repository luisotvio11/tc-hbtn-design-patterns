public class VideoMediaPlayer implements AdvancedMediaPlayer {


    @Override
    public void reproduzirVLC(String nomeArquivo) {
        System.out.print("Reproduzindo VLC: " + nomeArquivo);

    }
    @Override
    public void reproduzirMP4(String nomeArquivo) {
        System.out.print("Reproduzindo MPA: " + nomeArquivo);

    }
}
