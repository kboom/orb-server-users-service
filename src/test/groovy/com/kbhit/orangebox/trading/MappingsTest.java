package com.kbhit.orangebox.trading;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class MappingsTest extends IntegrationTest {

    @Autowired
    private ObjectMapper objectMapper;

//    @Test
//    public void canSerializeBid() {
//        assertThat(objectMapper.canSerialize(Bid.class)).isTrue();
//    }
//
}
