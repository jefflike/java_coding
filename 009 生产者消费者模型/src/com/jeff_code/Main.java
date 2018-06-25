package com.jeff_code;

public class Main {

    public static void main(String[] args) {
        // 多个生产者与消费者时，notify应该改为notifyAll
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        Saler s1 = new Saler();
        Saler s2 = new Saler();
        w1.start();
        w2.start();
        s1.start();
        s2.start();
    }
}

class Repo{
    public static Object[] products = new Object[10];// 简化问题就不进行扩容了，默认上限10个产品
    public static int count=0;// 默认初始没有产品

    synchronized public static void add(Object obj) {
        if(count >= products.length){
            try {
                //当前线程wait()
                //锁对象.wait()
                Repo.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        products[count]=obj;
        count++;
        System.out.println("生产者生产了一台产品，库存量是：" + count);

        Repo.class.notifyAll();// 只有一个消费者所以使用notify即可
    }

    synchronized public static void take(){
        if(count <= 0){
            try {
                //当前线程wait()
                //锁对象.wait()
                Repo.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(products, 1, products, 0, count-1);
        products[count-1]=null;
        count--;
        System.out.println("库存量是：" + count);

        Repo.class.notifyAll();
    }

}

class Product{
    private String name;

    public Product(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + "]";
    }

}

class Worker extends Thread{
    private int i = 1;
    public void run(){
        while(true){
            Repo.add(new Product("产品" + i++));
        }
    }
}

class Saler extends Thread{
    public void run(){
        while(true){
            Repo.take();
        }
    }
}