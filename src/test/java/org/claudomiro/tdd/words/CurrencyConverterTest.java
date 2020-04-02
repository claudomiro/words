package org.claudomiro.tdd.words;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import static org.hamcrest.MatcherAssert.*;

public class CurrencyConverterTest
{

    private CurrencyConverter converter;

    @BeforeEach
    void setUp() {
        converter = new CurrencyConverter();
    }

    @Test
    public void whenSimpleValueReturnWords()
    {
        assertThat(converter.conv(2.00), equalTo("dois reais"));
        assertThat(converter.conv(3.00), equalTo("três reais"));
        assertThat(converter.conv(10.00), equalTo("dez reais"));
        assertThat(converter.conv(30.00), equalTo("trinta reais"));
        assertThat(converter.conv(55.00), equalTo("cinquenta e cinco reais"));
        assertThat(converter.conv(97.00), equalTo("noventa e sete reais"));
    }

    @Test
    public void whenJustCentsReturnWords()
    {
        assertThat(converter.conv(0.02), equalTo("dois centavos"));
        assertThat(converter.conv(0.03), equalTo("três centavos"));
        assertThat(converter.conv(0.10), equalTo("dez centavos"));
        assertThat(converter.conv(0.30), equalTo("trinta centavos"));
        assertThat(converter.conv(0.55), equalTo("cinquenta e cinco centavos"));
        assertThat(converter.conv(0.97), equalTo("noventa e sete centavos"));
    }

    @Test
    public void whenMixedValueRetunWords()
    {
        assertThat(converter.conv(2.02), equalTo("dois reais e dois centavos"));
        assertThat(converter.conv(13.45), equalTo("treze reais e quarenta e cinco centavos"));
        assertThat(converter.conv(97.03), equalTo("noventa e sete reais e três centavos"));
    }

    @Test
    public void whenSingularPartCorrectlyReturnWords()
    {
        assertThat(converter.conv(1.00), equalTo("um real"));
        assertThat(converter.conv(0.01), equalTo("um centavo"));
    }

    @Test
    public void whenFractionOfCentsIsPassedReturnTheTruncatedValue()
    {
        assertThat(converter.conv(1.031), equalTo("um real e três centavos"));
        assertThat(converter.conv(1.039), equalTo("um real e três centavos"));
    }

    @Test
    public void whenInvalidValueThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                converter.conv(-3.00));
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                converter.conv(100.00));
    }

}
