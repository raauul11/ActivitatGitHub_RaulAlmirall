/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author raauu
 */
public class GitHubTest {

    @Test
    public void testSuma() {
        System.out.println("Suma");
        int a = 4;
        int b = 7;
        int expResult = 11;
        int result = GitHub.Suma(a, b);
        assertEquals(expResult, result);
    }

   
    @Test
    public void testTuNombre() {
        System.out.println("TuNombre");
        String nombre = "Raul";
        String expResult = "Raul";
        String result = GitHub.TuNombre(nombre);
        assertEquals(expResult, result);
    }
    
}
