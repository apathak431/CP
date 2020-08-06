
import java.util.concurrent.TimeUnit;

import java.util.*;
import java.lang.*;
import java.io.*;

class DCP6_JobSchedular
{
public static void main(String[] args) {
        long fromTIme = System.currentTimeMillis();
        new DCP6_JobSchedular().task(() -> System.out.println(System.currentTimeMillis() - fromTIme),
        TimeUnit.SECONDS.toMillis(5));
        System.out.println("-- done --");
    }

        public void task(Runnable func, long delay) {
            new Thread(() -> {
                try {
                    Thread.sleep(delay);
                    func.run();
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
