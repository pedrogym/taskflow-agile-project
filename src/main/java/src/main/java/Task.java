public class Task {
    private int id;
    private String titulo;
    private String descricao;
    private String responsavel;
    private String status;

    public Task(int id, String titulo, String descricao, String responsavel) {
        // Validação exigida pelo testTituloVazio
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser vazio.");
        }
        
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.status = "A Fazer"; // Exigido pelo testCriarTarefa
    }

    public void atualizarStatus(String novoStatus) {
        // Validação exigida pelo testStatusInvalido
        // Aqui definimos os status aceitos. Se não for um desses, joga a exceção.
        if (novoStatus.equals("A Fazer") || novoStatus.equals("Em Progresso") || novoStatus.equals("Concluído")) {
            this.status = novoStatus;
        } else {
            throw new IllegalArgumentException("Status inválido: " + novoStatus);
        }
    }

    // Getters necessários para as asserções (assertEquals)
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public String getResponsavel() { return responsavel; }
    public String getStatus() { return status; }
}
