package com.company;

import com.company.impl.*;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class ATMTest {

    private static final int CONST = 100;

    @InjectMocks ATM atm;
    @Mock ServerConnection serverConnection;
    @Mock Input input;
    @Mock Display display;


    @Test
    public void testShowSum() throws Exception {
        when(serverConnection.getSum()).thenReturn(CONST);
        atm.showSum();
        verify(display).showSum(CONST);
    }

    class TestModule extends AbstractModule {

        @Override
        protected void configure() {
            bind(CardReader.class).to(CardReaderImpl.class);
            bind(Display.class).to(DisplayImpl.class);
            bind(Input.class).to(InputImpl.class);
            bind(Output.class).to(OutputImpl.class);
            bind(ServerConnection.class).to(ServerConnectionImpl.class);
        }
    }
}