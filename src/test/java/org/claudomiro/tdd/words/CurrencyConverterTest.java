package org.claudomiro.tdd.words;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class CurrencyConverterTest
{

    private CurrencyConverter conversor;

    @BeforeEach
    void setUp() {
        conversor = new CurrencyConverter();
    }

    @Test
    public void whenSimpleValueReturnWords()
    {
        assertThat(conversor.conv(2.00), equalTo("dois reais"));
        assertThat(conversor.conv(3.00), equalTo("três reais"));
        assertThat(conversor.conv(10.00), equalTo("dez reais"));
        assertThat(conversor.conv(30.00), equalTo("trinta reais"));
        assertThat(conversor.conv(55.00), equalTo("cinquenta e cinco reais"));
        assertThat(conversor.conv(97.00), equalTo("noventa e sete reais"));
    }

    @Test
    public void whenJustCentsReturnWords() {
        assertThat(conversor.conv(0.02), equalTo("dois centavos"));
        assertThat(conversor.conv(0.03), equalTo("três centavos"));
        assertThat(conversor.conv(0.10), equalTo("dez centavos"));
        assertThat(conversor.conv(0.30), equalTo("trinta centavos"));
        assertThat(conversor.conv(0.55), equalTo("cinquenta e cinco centavos"));
        assertThat(conversor.conv(0.97), equalTo("noventa e sete centavos"));
    }
}
