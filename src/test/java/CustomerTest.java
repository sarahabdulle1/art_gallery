
import org.example.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CustomerTest {

    Customer hayan;

    @BeforeEach
    public void setUp() {
        hayan = new Customer("Hayan", 100);
    }

    @Test
    public void canGetName() {
        assertThat(hayan.getName()).isEqualTo("Hayan");
    }
}