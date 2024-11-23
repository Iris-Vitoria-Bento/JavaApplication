
package javaapplication;
public class Student {
    // Atributos da classe
    private String name;
    private String studentId;
    private String status;

    // Construtor da classe
    public Student(String name, String studentId, String status) {
        this.name = name;
        this.studentId = studentId;
        this.status = status;
    }

    // Métodos getters
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStatus() {
        return status;
    }

    // Método toString para exibir as informações do aluno
    @Override
    public String toString() {
        return "Nome do Aluno: " + name + "\n" +
               "ID do Aluno: " + studentId + "\n" +
               "Status do Aluno: " + status;
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        Student student = new Student("Lisa Palombo", "123456789", "Active");
        System.out.println(student);
    }
}
