package com.denis.kurs;

import com.denis.kurs.Math.MathEngine;
import org.junit.Test;

public class MathEngineTest {

    @Test
    public void testMath() throws Exception {

        MathEngine engine = new MathEngine();
        String data = "C=(4 1)#A=(1 2|1 4)#alfa=(0.9772 0.8413)#b1=(6 1)#b2=(6 4)";
        engine.parseData(data);
        engine.showData();
        engine.resetData();
        engine.showData();


    }
}