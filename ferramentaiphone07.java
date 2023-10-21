---------------------
| iPhone           |
---------------------
| + ReprodutorMusical |
| + AparelhoTelefonico |
| + NavegadorInternet  |
---------------------

--------------------------
| ReprodutorMusical     |
--------------------------
| + tocar()              |
| + pausar()             |
| + selecionarMusica()   |
--------------------------

----------------------------
| AparelhoTelefonico         |
----------------------------
| + ligar()                  |
| + atender()                |
| + iniciarCorreioVoz()      |
----------------------------

-----------------------------
| NavegadorInternet          |
-----------------------------
| + exibirPagina()           |
| + adicionarNovaAba()       |
| + atualizarPagina()        |
-----------------------------


public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
 
    @Override
    public void tocar() {
        
    }

    @Override
    public void pausar() {
        
    }

    @Override
    public void selecionarMusica() {
        
    }

    @Override
    public void ligar() {
        
    }

    @Override
    public void atender() {
       
    }

    @Override
    public void iniciarCorreioVoz() {
       
    }

    @Override
    public void exibirPagina() {
        
    }

    @Override
    public void adicionarNovaAba() {
      
    }

    @Override
    public void atualizarPagina() {
        
    }
}


public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}

public interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

public interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}
