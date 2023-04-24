package Modelos;

import java.util.Objects;

public class Cliente {
    private String nome;
    private Long cpf;
    private Long telefone;
    private Long endereco;
    private Integer numero;
    private String cidade;
    private String estado;
    
    public Cliente(String nome, String  cpf, String telefone, Long endereco, Integer numero, String cidade, String estado) {
        this.nome = nome;
        this.cpf = Long.valueOf(cpf.trim()) ;
        this.telefone = Long.valueOf(telefone.trim());
        this.endereco = endereco;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    public Long getTelefone() {
        return telefone;
    }
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
    public Long getEndereco() {
        return endereco;
    }
    public void setEndereco(Long endereco) {
        this.endereco = endereco;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash  = 79 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        final Cliente other  = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)){
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return "Cliente {Nome:"+ nome + '\'' + "CPF: " + cpf + "}";
    }
}
