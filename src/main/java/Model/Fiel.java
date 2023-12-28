     
package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Fiel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private int datadenascimento;
    private int cpf;
    // outras informações sobre o membro
    // getters e 

    public Fiel(String nome, String Endereco, int DatadeNascimento, int cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.datadenascimento = datadenascimento;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public int getDatadeNascimento(){
        return datadenascimento;
    }
    
    public void setDatadeNascimento(int datadenascimento){
        this.datadenascimento = datadenascimento;
    }
    
    public int getcpf(){          
        return cpf;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    }
    
    public void setcpf(int cpf){
        this.cpf = cpf;  
    }
}