package com.other;


interface Instrument {
    public abstract void play();
}


/*成员内部类*/
class InstrumentPlay1 {
    class Inner1 implements Instrument {
        @Override
        public void play() {
            System.out.println("成员内部类！");
        }
    }

    public void playInstrument(Instrument ins) {
        ins.play();
    }
}


/*局部内部类*/
class InstrumentPlay2 {
    public void palyInstrument() {
        class Inner2 implements Instrument {
            @Override
            public void play() {
                System.out.println("局部内部类！");
            }
        }
        Inner2 in = new Inner2();
        in.play();
    }
}


/*匿名内部类*/
class InstrumentPlay3 {
    public void palyInstrument(Instrument ins) {
        ins.play();
    }
}


/*静态内部类*/
class InstrumentPlay4 {
    public static class Inner4 implements Instrument {
        @Override
        public void play() {
            System.out.println("静态内部类！");
        }
    }

    public void playInstrument(Instrument ins) {
        ins.play();
    }
}

public class InnerClassTest {
    public static void main(String[] args) {
        // 成员内部类
        InstrumentPlay1 test1 = new InstrumentPlay1();
        InstrumentPlay1.Inner1 inner = test1.new Inner1();
        test1.playInstrument(inner);

        //局部内部类
        InstrumentPlay2 test2 = new InstrumentPlay2();
        test2.palyInstrument();

        //匿名内部类
        InstrumentPlay3 test3 = new InstrumentPlay3();
        test3.palyInstrument(new Instrument() {
            @Override
            public void play() {
                System.out.println("匿名内部类！");
            }
        });

        //静态内部类
        InstrumentPlay4.Inner4 inner4 = new InstrumentPlay4.Inner4();
        inner4.play();
    }
}
