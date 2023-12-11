package com.KGiSL.xbuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.KGiSL.xbuilder.Controller.Customer;
import com.KGiSL.xbuilder.Controller.CustomerBuilder;

public class CustomerBuilderTest {

    @Test
    void testCustomerBuilder() {
        Customer customer = new CustomerBuilder()
                .Id(1)
                .firstName("John")
                .LastName("Doe")
                .email("john.doe@example.com")
                .build();

        assertEquals(1, customer.getId());
        assertEquals("John", customer.getFirstname());
        assertEquals("Doe", customer.getLastname());
        assertEquals("john.doe@example.com", customer.getEmail());
    }
}
