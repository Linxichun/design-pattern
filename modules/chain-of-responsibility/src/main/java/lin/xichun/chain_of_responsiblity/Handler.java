package lin.xichun.chain_of_responsiblity;

/**
 * 抽象处理者角色Handler.java
 * Created by Lin.XiChun on 2018/11/19.
 */
public abstract class Handler {
    // 持有后继的责任对象
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return successor;
    }

    // 处理
    public abstract void handleRequest(String param);
}

