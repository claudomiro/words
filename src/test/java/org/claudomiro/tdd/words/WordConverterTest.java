package org.claudomiro.tdd.words;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class WordConverterTest
{

    private WordConverter converter;

    @BeforeEach
    void setUp() {
        converter = new WordConverter();
    }

    @Test
    public void whenUnitsReturnSimpleValue()
    {
        assertThat(converter.conv(0), equalTo("zero"));
        assertThat(converter.conv(1), equalTo("um"));
        assertThat(converter.conv(2), equalTo("dois"));
        assertThat(converter.conv(9), equalTo("nove"));
        assertThat(converter.conv(10), equalTo("dez"));
        assertThat(converter.conv(19), equalTo("dezenove"));
    }

    @Test
    public void whenTenFoldReturnWord()
    {
        assertThat(converter.conv(20), equalTo("vinte"));
        assertThat(converter.conv(50), equalTo("cinquenta"));
        assertThat(converter.conv(90), equalTo("noventa"));
    }

    @Test
    public void whenMixedValueReturnWords()
    {
        assertThat(converter.conv(25), equalTo("vinte e cinco"));
        assertThat(converter.conv(42), equalTo("quarenta e dois"));
        assertThat(converter.conv(98), equalTo("noventa e oito"));
    }
}
