package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void doesNotKnowAboutROS() throws Exception {
        assertThat(queryProcessor.process("ros"), is(""));
    }

    @Test
    public void knowsAboutMe() throws Exception {
        assertThat(queryProcessor.process("kowalski"), containsString("French"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void ourTeamNamet() throws Exception {
        assertThat(queryProcessor.process("team name"), containsString("united pleasure peer"));
        assertThat(queryProcessor.process("what is your team name"), containsString("united pleasure peer"));
    }

    @Test
    public void calculator() throws Exception {
        assertThat(queryProcessor.process( "  what is 3 plus 4"), containsString("7"));
        assertThat(queryProcessor.process( "        what is 3 minus 4"), containsString("-1"));
        assertThat(queryProcessor.process( "  what is 3 times 4"), containsString("12"));
        assertThat(queryProcessor.process( "what is 3 times 5"), containsString("15"));
        assertThat(queryProcessor.process( "  what is 3 divided 4"), containsString("0"));
        assertThat(queryProcessor.process("  what is 3 plus 4"), containsString("7"));
        assertThat(queryProcessor.process("  what is 3 minus 4"), containsString("-1"));
        assertThat(queryProcessor.process("  what is 3 times 4"), containsString("12"));
        assertThat(queryProcessor.process("  what is 3 divided 4"), containsString("0"));
    }

    @Test
    public void squareCube() throws Exception {
        String query = "which of the following numbers is both a square and a cube:   117649,   641";
        assertThat(queryProcessor.process(query), containsString("117649"));
    }

    @Test
    public void bond() throws Exception {
        String query = "james bond dr no";
        assertThat(queryProcessor.process(query), containsString("sean connery"));
    }

    @Test
    public void largest() throws Exception {
        assertThat(queryProcessor.process("what is largest: 43, 67"), containsString("67"));
        assertThat(queryProcessor.process("what is largest: 59, 72"), containsString("72"));
    }

    @Test
    public void fib() throws Exception {
        assertThat(queryProcessor.process("what is the 4th fibonacci"), containsString("3"));
        assertThat(queryProcessor.process("what is the 1st fibonacci"), containsString("1"));
        assertThat(queryProcessor.process("what is the 2nd fibonacci"), containsString("1"));
    }

    @Test
    public void primes() throws Exception {
        assertThat(queryProcessor.process("are primes: 1, 2, 3, 4"), containsString("2, 3"));
    }

    @Test
    public void power() throws Exception {
        assertThat(queryProcessor.process("   what is 4 to the power of  2"), containsString("16"));
        assertThat(queryProcessor.process("what is     16 to the power of   6   "), containsString("16777216"));
    }
}
