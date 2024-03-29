package model.proxy.static_model;

/**
 * @author luzc
 * @date 2020/11/26 15:30
 * @desc 静态代理模式
 *
 * 代理模式可以在不修改被代理对象的基础上，通过扩展代理类，进行一些功能的附加与增强。
 * 值得注意的是，代理类和被代理类应该共同实现一个接口，或者是共同继承某个类。
 */
public class StaticProxy {

    public static void main(String[] args) {
        RealMovie realMovie = new RealMovie();
        Movie cinema = new Cinema(realMovie);
        cinema.play();
    }
}
