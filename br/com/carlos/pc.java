package br.com.carlos;

import br.com.carlos.Arquivo;

/**
 * @author Carlos Davi
 */
public class pc {
    private int memoria = 16;
    private String processador = "i7";
    private String placaDeVideo = "gtx 1070";
    private int hd = 1000;
    private boolean ssd = false;
    private String ligado = "desligado";

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public String getLigado() {
        return ligado;
    }

    public void setLigado(String ligado) {
        this.ligado = ligado;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    private void ligarPc(){
        setLigado("Ligado");
    }

   /* public void baixarSistema(Object Arquivo){
         setHd(getHd() - Arquivo.tamanho);
    }
    public void removerSistema(Object Arquivo){
         setHd(getHd() + Arquivo.tamanho);
    }*/
}
