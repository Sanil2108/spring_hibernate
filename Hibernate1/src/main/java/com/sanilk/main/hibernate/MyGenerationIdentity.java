package com.sanilk.main.hibernate;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.SequenceGenerator;

import java.io.Serializable;

public class MyGenerationIdentity extends SequenceGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) {


        return super.generate(session, obj);
    }
}
