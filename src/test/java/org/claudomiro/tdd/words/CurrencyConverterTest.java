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
    public void quandoOValorForSimplesRetornaONumeroPorExtenso()
    {
        assertThat(conversor.conv(2.00), equalTo("dois reais"));
        assertThat(conversor.conv(3.00), equalTo("três reais"));
        assertThat(conversor.conv(10.00), equalTo("dez reais"));
        assertThat(conversor.conv(30.00), equalTo("trinta reais"));
        assertThat(conversor.conv(55.00), equalTo("cinquenta e cinco reais"));
        assertThat(conversor.conv(97.00), equalTo("noventa e sete reais"));

    }
}
