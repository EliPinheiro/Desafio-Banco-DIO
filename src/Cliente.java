import java.util.Objects;

public class Cliente {
    private String first_nome;
    private String last_name;
    private int age;
    private int cpf;

    public Cliente(String first_nome, String last_name, int age, int cpf) {
        this.first_nome = first_nome;
        this.last_name = last_name;
        this.cpf = cpf;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "first_nome = '" + first_nome + '\'' +
                ", last_name = '" + last_name + '\'' +
                ", age = " + age +
                ", cpf = " + cpf +
                '}';
    }

    public String getFirst_nome() {
        return first_nome;
    }

    public void setFirst_nome(String first_nome) {
        this.first_nome = first_nome;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return cpf == cliente.cpf;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }
}
