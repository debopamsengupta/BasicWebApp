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
    }
}
