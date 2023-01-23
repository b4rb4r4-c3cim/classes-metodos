//Exer01
//deseenvolver metodos para ligar e desligar uma lampada

public class Lampada{
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada; //para representar o status da lampada

    //metodo que retornada nada

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if(ligada==true){
            System.out.println("Lampada esta ligada.");
        } else{
            System.out.println("Lampada esta desligada.");
        }
    }

    void mudarEstado(){
        if(ligada){
            desligar();
        } else{
            ligar();
        }
    }
}