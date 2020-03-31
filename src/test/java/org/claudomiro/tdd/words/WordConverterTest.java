package org.claudomiro.tdd.words;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class WordConverterTest
{
    @Test
    public void whenUnitsReturnSimpleValue()
    {
        WordConverter converter = new WordConverter();
        assertThat(converter.conv(0), equalTo("zero"));
        assertThat(converter.conv(1), equalTo("um"));
        assertThat(converter.conv(2), equalTo("dois"));
        assertThat(converter.conv(9), equalTo("nove"));
        assertThat(converter.conv(10), equalTo("dez"));
        assertThat(converter.conv(19), equalTo("dezenove"));
    }
}
