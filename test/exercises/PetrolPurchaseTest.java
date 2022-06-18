package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetrolPurchaseTest {

    PetrolPurchase petrolPurchase;

    @BeforeEach
    void setUp() {
        petrolPurchase = new PetrolPurchase("Conoil-Lekki2", "Diesel", 10, 500.0, 5);
    }

    @Test
    void testPurchaseWasMadeAtAParticularLocation(){
        petrolPurchase.setLocation("Conoil-Lekki");
        assertEquals("Conoil-Lekki", petrolPurchase.getLocation());
        petrolPurchase.setPetrolType("Fuel");
        assertEquals("Fuel", petrolPurchase.getPetrolType());
        assertEquals(10, petrolPurchase.getLitres());
        assertEquals(500.0, petrolPurchase.getPricePerLitres());
        assertEquals(0.05, petrolPurchase.getDiscount());
    }
    
    @Test
    void testThatNetPurchaseCanBeCalculated(){
        petrolPurchase.setPurchaseAmount(5, 500.0, 5);
        petrolPurchase.setLitres(5);                // optional line
        petrolPurchase.setPricePerLitres(500.0);    // optional line
        petrolPurchase.setDiscount(5);           // optional line
        assertEquals(2499.95, petrolPurchase.getPurchaseAmount());
    }
}