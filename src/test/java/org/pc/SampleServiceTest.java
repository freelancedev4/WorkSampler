package org.pc;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
public class SampleServiceTest {
    @Mock
    SampleService mockSampleService;

    @Mock
    SampleDTO sampleDTO;

    @Spy
    @InjectMocks
    SampleService spySampleService;

    @Autowired
    SampleService sampleService;

    @BeforeAll
    public void init() {
    }

    @Test
    public void testThreadLocal() {
        Mockito.mock(ThreadLocal.class);
    }

    @Test
    public void testValueFetch() {
        //System.out.println(sampleService.testValue());
    }
}