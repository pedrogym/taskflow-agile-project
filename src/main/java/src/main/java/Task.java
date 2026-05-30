import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testCriarTarefa() {

        Task tarefa = new Task(
                1,
                "Entregar carga",
                "Centro",
                "Carlos"
        );

        assertEquals("Entregar carga", tarefa.getTitulo());
        assertEquals("A Fazer", tarefa.getStatus());
    }

    @Test
    public void testTituloVazio() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Task(2, "", "Teste", "Ana")
        );
    }

    @Test
    public void testAtualizarStatus() {

        Task tarefa = new Task(
                3,
                "Separar pedidos",
                "Galpão",
                "Ana"
        );

        tarefa.atualizarStatus("Em Progresso");

        assertEquals(
                "Em Progresso",
                tarefa.getStatus()
        );
    }

    @Test
    public void testStatusInvalido() {

        Task tarefa = new Task(
                4,
                "Teste",
                "Descrição",
                "Pedro"
        );

        assertThrows(
                IllegalArgumentException.class,
                () -> tarefa.atualizarStatus("Cancelado")
        );
    }
}
