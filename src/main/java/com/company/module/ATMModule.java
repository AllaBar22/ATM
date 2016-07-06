package com.company.module;

import com.company.*;
import com.company.impl.*;
import com.google.inject.AbstractModule;

public class ATMModule extends AbstractModule{

    @Override
    protected void configure() {

        bind(Output.class).to(OutputImpl.class);
        bind(Input.class).to(InputImpl.class);
        bind(CardReader.class).to(CardReaderImpl.class);
        bind(ServerConnection.class).to(ServerConnectionImpl.class);
        bind(Display.class).to(DisplayImpl.class);
    }
}
