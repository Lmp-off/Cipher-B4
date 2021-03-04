package com.example.cipherb4;

import org.junit.Test;

import static org.junit.Assert.*;

public class BattistaBellasoTest {

    @Test
    public void cipher() {
        BattistaBellaso battistaBellaso = new BattistaBellaso("zeleg");
        assertEquals("hpwyy",battistaBellaso.make("Illus"));
    }

    @Test
    public void decode() {
    }
}