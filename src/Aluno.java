import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
    private boolean matriculado;
    public String [] alunos = new String[3];
    private float [][] notas = new float[3][4];
    private float somaNotas;
    private float mediaAluno;
    private String statusAluno;
    

    public void situacao() {
        this.matriculado = true;
    }

    public void cadastro() {
        if(matriculado){
            for(int i = 0; i < alunos.length; i++) {
                System.out.println("Aluno " + alunos[i]);
                this.somaNotas = 0;
                this.mediaAluno = 0;

                for(int j = 0; j < notas.length; j++) {
                    this.notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota numer " + (j+1) + " do aluno " + alunos[i]));
                    this.somaNotas = this.somaNotas + this.notas[i][j];
                }
                
                
            }
        } else {
            System.out.println(alunos + " Não matriculado");
        }
        boletim();
    }

   public String mediaAlunos() {
        mediaAluno = somaNotas / 4;
        if(mediaAluno < 5.5) {
            return statusAluno = "REPROVADO";
        } else if (mediaAluno >= 5.5 && mediaAluno <= 7.5) {
            return statusAluno = "EM RECUPERAÇÃO";
        } else {
            return statusAluno = "APROVADO";
        }
    }

    public void boletim() {
       for(int i = 0; i < alunos.length; i++) {
        System.out.println("**********BOLETIM******");
        System.out.println("Aluno: " + alunos[i]);
        System.out.println("Notas");
        for(int j1 = 0; j1 < notas.length; j1++) {
            System.out.println((j1+1) + " - " + notas[i][j1]);
        }
        
    }
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public String[] getAlunos() {
        return alunos;
    }

    public void setAlunos(String[] alunos) {
        this.alunos = alunos;
    }

    public float[][] getNotas() {
        return notas;
    }

    public void setNotas(float[][] notas) {
        this.notas = notas;
    }

    public float getSomaNotas() {
        return somaNotas;
    }

    public void setSomaNotas(float somaNotas) {
        this.somaNotas = somaNotas;
    }

    public float getMediaAluno() {
        return mediaAluno;
    }

    public void setMediaAluno(float mediaAluno) {
        this.mediaAluno = mediaAluno;
    }

    public String getStatusAluno() {
        return statusAluno;
    }

    public void setStatusAluno(String statusAluno) {
        this.statusAluno = statusAluno;
    }



}
