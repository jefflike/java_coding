/*
* 我们定义的这个接口定义了一个规范，实现我们的这个接口的类都必须实现自己的一套排序方式
* 并且大小顺序按照此规则来定
* */
public interface SortAble {
    /*
     * 规定：当前对象this 和 指定对象obj比较大小时，
     * 当 this “大于” obj时，返回正整数
     * 当 this “小于” obj时，返回负整数
     * 当 this “等于” obj时，返回零
     */
    public abstract int compare(Object obj);
}
