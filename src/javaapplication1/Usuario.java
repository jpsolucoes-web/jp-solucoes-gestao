package javaapplication1;

public class Usuario {
    private int id;
    private String login;
    private String senha;
    private String nivelAcesso;

    public Usuario(int id, String login, String senha, String nivelAcesso) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public boolean autenticar(String loginInformado, String senhaInformada) {
        return this.login.equals(loginInformado) && this.senha.equals(senhaInformada);
    }
}
 