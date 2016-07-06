package com.company;

import com.company.impl.*;
import com.google.inject.AbstractModule;


public class ATMModule  extends AbstractModule{

    @Override
    protected void configure(){
        bind(CardReader.class).to(CardReaderImpl.class);
        bind(Display.class).to(DisplayImpl.class);
        bind(Input.class).to(InputImpl.class);
        bind(Output.class).to(OutputImpl.class);
        bind(ServerConnection.class).to(ServerConnectionImpl.class);
    }
}
